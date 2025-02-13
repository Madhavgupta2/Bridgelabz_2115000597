class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieList {
    Movie head;
    Movie tail;

    public MovieList() {
        head = null;
        tail = null;
    }

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (position == 0) {
            addMovieAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addMovieAtEnd(title, director, yearOfRelease, rating);
            return;
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        temp.next.prev = newMovie;
        temp.next = newMovie;
    }

    // Remove a movie by Movie Title
    public void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                System.out.println("Movie '" + title + "' removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie with Title '" + title + "' not found");
    }

    // Search for a movie by Director or Rating
    public void searchMoviesByDirectorOrRating(String director, double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director) || temp.rating == rating) {
                System.out.println("Movie found: " + temp.title + ", " + temp.director + ", " + temp.yearOfRelease + ", " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found with the given criteria.");
        }
    }

    // Display all movies in forward order
    public void displayAllMoviesForward() {
        if (head == null) {
            System.out.println("No movies to display");
            return;
        }
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    public void displayAllMoviesReverse() {
        if (tail == null) {
            System.out.println("No movies to display");
            return;
        }
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update a movie's rating based on Movie Title
    public void updateMovieRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for movie '" + title + "'");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie with Title '" + title + "' not found");
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        // Add movies to the list
        movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieList.addMovieAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addMovieAtPosition("Dunkirk", "Christopher Nolan", 2017, 7.9, 2);

        // Display movies in forward order
        System.out.println("Movies in Forward Order:");
        movieList.displayAllMoviesForward();

        // Display movies in reverse order
        System.out.println("\nMovies in Reverse Order:");
        movieList.displayAllMoviesReverse();

        // Search movies by director or rating
        System.out.println("\nSearch movies by Director 'Christopher Nolan' or Rating '8.8':");
        movieList.searchMoviesByDirectorOrRating("Christopher Nolan", 8.8);

        // Update movie rating
        System.out.println("\nUpdating Rating for 'Inception':");
        movie
