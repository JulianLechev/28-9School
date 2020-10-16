package edy.smg;

import java.lang.Math;

public class MathTest {
    public static void main(String[] args) {
     int min = 0, max = 4, points = 0;
     char[][] arr = new char[10][8];
     char[] key = new char[10];
     for(int k = 0; k <10; k++){
       key[k] = (char)('A' + Math.random() * (max - min + 1) + min);
     }
     for(int i = 0 ; i<10; i++){
       for(int j = 0; j <8; j++){
         arr[i][j] =(char)('A' + Math.random() * (max - min + 1) + min);
       }
     }
       for(int i = 0 ; i<10; i++){
       for(int j = 0; j <8; j++){
         if(arr[i][j] == key[j]){
           points++;
         }
       }
       System.out.println("Student " + (i+1) + " has " + points + " points");
       points = 0;
       }
     
    }
}
