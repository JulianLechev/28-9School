package edy.smg;
import java.util.Scanner;
public class random2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] arr = new int[10];
       for(int i  = 0; i < 10; i++){
    	   System.out.println("Number " + (i + 1) + " ?");
         arr[i] = scanner.nextInt();
         
       }
         for(int i  = 0; i < 10; i++){
         int random = (int)(Math.random() * 10);
         int swap = random;
         arr[random] = swap;
         random = arr[i];
       }
       for(int i = 0; i < 10; i++){
         System.out.println(arr[i]);
       }
    }
}