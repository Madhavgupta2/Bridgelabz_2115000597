class CircularTour {
    int tour(int[] petrol, int[] distance, int n) {
        int start = 0, deficit = 0, balance = 0;
        
        for (int i = 0; i < n; i++) {
            balance += petrol[i] - distance[i];
            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
    }
}