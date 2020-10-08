package edy.smg;
import java.util.Scanner;

public class pyramid{

     public static void main(String []args){
         Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number between 1 and 15");
        num = scanner.nextInt();
        int finalNum = num;
        for(int i = 0; i < finalNum; i++){
            while(num>=1){
                System.out.print(num + " ");
                num--;
            }
            num =2;
            while(num<=finalNum-i){
                System.out.print(num + " ");
                num++;
      
            }           
            System.out.println();
            num = num - 2;
        }
     }
}