package edy.smg;
import java.util.Scanner;
public class ColorRange {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
int wavelevel = 0;
System.out.println("Enter a number");
wavelevel = scanner.nextInt();
if(wavelevel<380 || wavelevel>750){
	System.out.println("The entered wavelength is not a part of the visible spectrum");
}
else if(wavelevel>620){
	System.out.println("The color is Red");
	}
else if(wavelevel>590){
	System.out.println("The color is Orange");
	}
else if(wavelevel>570){
	System.out.println("The color is Yellow");
	}
else if(wavelevel>495){
	System.out.println("The color is Green");
	}
else if(wavelevel>450){
	System.out.println("The color is Blue");
	}
else if(wavelevel>380){
	System.out.println("The color is Violet");
	}
 
	}

}
