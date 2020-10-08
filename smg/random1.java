package edy.smg;
import java.lang.Math;
public class random1 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int min = 0, max = 9;
		for(int i = 0; i<10;i++){
			array1[i] = (int)(Math.random()*(max-min)) + min;
			System.out.println(array1[i]);
		}
		
		
	}
	

}
