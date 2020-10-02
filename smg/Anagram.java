package edy.smg;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word1, word2;
		int Position1 = 0,Position2= 0;
		boolean isAnagram = true;
		System.out.println("Enter a word");
		word1 = scanner.nextLine();
		System.out.println("Enter another word");
		word2 = scanner.nextLine();
		int lastPosition1 = word1.length() ;
		int lastPosition2 = word2.length() ;
		int lenght1 = word1.length() ;
		int lenght2 = word2.length() ;
		if(lenght1 != lenght2){
			System.out.println("Words are not anagrams");
		}
		else{
		while(Position1<lastPosition1){
			while(Position2<lastPosition2){
				if(word1.charAt(Position1)=word2.charAt(Position2)){
				lenght1--;
				continue;
				}
				else{
					Position2++;
				}
			}
		}
	}
	}
}
