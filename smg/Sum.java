package edy.smg;
public class Sum {
    public static void main(String[] args) {
     int max = 100, min = 0, sum = 0, biggestSum = 0;
     int[][] arr = new int[5][5];
     for(int i = 0 ; i<5; i++){
       for(int j = 0; j <5; j++){
         arr[i][j] =(int)( Math.random() * (max - min + 1) + min);
       }
     }
       for(int i = 0 ; i<5; i++){
       for(int j = 0; j <5; j++){
         sum += arr[i][j];
       }
       if(sum > biggestSum){
         biggestSum = sum;
       }
      sum = 0;
     }
     System.out.println(biggestSum);
    }
}
