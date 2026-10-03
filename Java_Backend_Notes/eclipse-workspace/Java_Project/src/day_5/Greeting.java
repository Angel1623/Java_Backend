package day_5;

public class Greeting {

	public static void main(String[] args) {
		
		
		GreetingsDemo gd = () -> {
			System.out.println("Hello All! Welcome to the session.");
		};
		
		gd.greet();
		
	}

}
