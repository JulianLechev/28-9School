package edy.smg;

import java.util.Scanner;

public class random3{

     public static void main(String []args){
         Scanner scanner = new Scanner(System.in);
      int[] arr3  = new int[10];
      for(int i =0; i < 10;i++){
        System.out.println("Enter " + (i+1) +" number");
        arr3[i] = scanner.nextInt();
      }
      int one = arr3[0];
      int swap = 0;
      for(int j = 0; j<10;j++){
          if(arr3[j] == one){
              swap = arr3[j];
              arr3[j]=arr3[j+1];
              arr3[j+1]=swap;
          }
          else{
             break;
          }
      }
    for(int k = 0; k<9;k++){
        System.out.println(arr3[k]);
        }
     }
}