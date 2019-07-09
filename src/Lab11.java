import java.util.ArrayList;
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userOrder;
		boolean rerun = true;

	do {
		
		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 10 movies in this list.\n"
		+ "What category are you interested in?");
		userOrder = scan.nextLine();

		Movie m1 = new Movie("Scream III", "horror");
		Movie m2 = new Movie("Dragon Ball Z", "animated");
		Movie m3 = new Movie("Spotlight", "drama");
		Movie m4 = new Movie("Star Wars", "scifi");
		Movie m5 = new Movie("Nightmare on Elm Street", "horror");
		Movie m6 = new Movie("Spirited Away", "animated");
		Movie m7 = new Movie("The Aftermath", "drama");
		Movie m8 = new Movie("Children of Men", "scifi");
		Movie m9 = new Movie("The Witch", "horror");
		Movie m10 = new Movie("Shrek 2", "animated");
		
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
		movies.add(m9);
		movies.add(m10);
		
		//loop through arraylist and print title
		for(Movie m : movies) {
			if (m.getCategory().trim().contentEquals(userOrder.trim())) {
				System.out.println(m.getTitle());
			}		
		}
		
		
		System.out.println("\nContinue? (y/n)");
		String userReorder = scan.nextLine();
		
		if(userReorder.trim().equalsIgnoreCase("y")|| userReorder.trim().equalsIgnoreCase("yes")) {
			rerun = true;
		} else {
			rerun = false;
		}
	} while(rerun);
		
		
		 scan.close();
		}

	}
	
