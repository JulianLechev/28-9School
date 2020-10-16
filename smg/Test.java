package edy.smg;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
int[] arr = new int[5];
int swap = 0;
for(int i = 0; i < 5; i++){
	System.out.println("Input number " + (i+1));
	arr[i] = scanner.nextInt();
	if(arr[i] < 0){
		System.out.println("Please, enter a positive value!");
		i = -1;
		
	}
}
for(int j = 0; j <5; j++){
for(int i = 0; i < 5 -1; i++){
	if(arr[i+1] < arr[i]){
		swap = arr[i+1];
		arr[i+1] = arr[i];
		arr[i] = swap;
		
	}
}
}
System.out.println("The lowest sum possible of 2 numbers is " + (arr[0] + arr[1]));

	}

}
