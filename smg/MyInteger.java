package pack;

public class MyInteger {

	private int value;
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public static boolean isOdd(int value) {
		boolean isOdd = true;
		if(value%2==0) {
			isOdd = false;
		}
		return isOdd;
		}
	
	public static boolean isEven(int value) {
		boolean isEven = true;
		if(value%2!=0) {
			isEven = false;
		}
		return isEven;
		}
	
	public static boolean isPrime(int value) {
		boolean isPrime = true;
		int counter = 1;
		while(counter < value) {
			if(value%counter == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public boolean isOdd() {
		boolean isOdd = true;
		if(value%2==0) {
			isOdd = false;
		}
		return isOdd;
		}
	
	public boolean isEven() {
		boolean isEven = true;
		if(value%2!=0) {
			isEven = false;
		}
		return isEven;
		}
	
	public boolean isPrime() {
		
		if(value < 2) {
			return false;
		}
		for(int i = 2; i < value; i++) {
			if(value%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOdd(MyInteger a) {
		
		if(a.value%2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public static boolean isPrime(MyInteger a) {
		for(int i = 2; i < a.value; i++) {
		if(a.value%i == 0) {

			return false;
			
		}
		else {
			continue;
		}
		}
		return true;
	}
	
	
	public static boolean isEven(MyInteger a) {
		
		if(a.value%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean equals(int a) {
		if(a==value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean equals(MyInteger a) {
		if(a.value == value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static int parseInt(char[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
		sum = sum*10 + a[i];
		}
		return sum;
	}
	
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}
	
	
	}

