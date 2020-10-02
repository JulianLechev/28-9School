package edy.smg;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
	double weight = 0;
	System.out.println("What is your weight?");
	weight = scanner.nextInt();
	String planet = (String)JOptionPane.showInputDialog(
			null, 
			"Choose a planet",
			"Planets",
			3,
			null,
			planets,
			planets[0]
			);
	if(planet.equals("Mars")){
		 weight = weight*0.38;
		 System.out.println("Your weight on " +planet + "is" +weight);
	}
	else if(planet.equals("Mercury")){
		weight = weight*0.38;
		System.out.println("Your weight on " +planet + "is" +weight);
	}
	else if(planet.equals("Venus")){
		weight = weight*0.91;
		System.out.println("Your weight on " +planet + "is" +weight);
	}
	else if(planet.equals("Jupiter")){
		weight = weight*2.36;
		System.out.println("Your weight on " +planet + "is" +weight);
	}
	else if(planet.equals("Saturn")){
		weight = weight*0.92;
		System.out.println("Your weight on " +planet + "is" +weight);
	}
	else if(planet.equals("Uranus")){
		weight = weight*0.89;
		System.out.println("Your weight on " +planet + "is" +weight);
	}
	else if(planet.equals("Neptune")){
		weight = weight*1.13;
		System.out.println("Your weight on " +planet + "is" +weight);
	}
	
	}	
	
}
