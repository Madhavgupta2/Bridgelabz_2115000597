import com.fasterxml.jackson.databind.*;
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class IPLCensorAnalyzer {
    
    public static void main(String[] args) throws Exception {
        processJSON("ipl_data.json", "ipl_data_censored.json");
        processCSV("ipl_data.csv", "ipl_data_censored.csv");
    }

    public static void processJSON(String inputFilePath, String outputFilePath) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> matches = objectMapper.readValue(new File(inputFilePath), List.class);
        
        for (Map<String, Object> match : matches) {
            censorMatchData(match);
        }

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFilePath), matches);
    }

    public static void processCSV(String inputFilePath, String outputFilePath) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(inputFilePath));
        List<String[]> records = reader.readAll();
        reader.close();

        String[] header = records.get(0);
        
        for (int i = 1; i < records.size(); i++) {
            String[] match = records.get(i);
            censorCSVData(match);
        }

        CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath));
        writer.writeAll(records);
        writer.close();
    }

    private static void censorMatchData(Map<String, Object> match) {
        String team1 = (String) match.get("team1");
        String team2 = (String) match.get("team2");
        String playerOfMatch = (String) match.get("player_of_match");
        
        match.put("team1", maskTeamName(team1));
        match.put("team2", maskTeamName(team2));
        match.put("player_of_match", "REDACTED");

        Map<String, Integer> score = (Map<String, Integer>) match.get("score");
        if (score != null) {
            score.put(team1, 0);
            score.put(team2, 0);
        }
    }

    private static String maskTeamName(String teamName) {
        if (teamName.contains("Mumbai Indians")) {
            return "Mumbai ***";
        }
        return teamName;
    }

    private static void censorCSVData(String[] match) {
        String team1 = match[1];
        String team2 = match[2];
        String playerOfMatch = match[6];
        
        match[1] = maskTeamName(team1);
        match[2] = maskTeamName(team2);
        match[6] = "REDACTED";
    }
}
