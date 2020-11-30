package pack;

public class MyIntegerTest {

	public static void main(String[] args) {
		
		
		MyInteger myInt = new MyInteger(17);
		System.out.println(myInt.isEven());
		System.out.println(myInt.isOdd());
		System.out.println(myInt.isPrime());
		
		int x = 18;
		System.out.println(MyInteger.isEven(x));
		System.out.println(MyInteger.isOdd(x));
		System.out.println(MyInteger.isPrime(x));
		
		
		System.out.println(MyInteger.isEven(myInt));
		System.out.println(MyInteger.isOdd(myInt));
		System.out.println(MyInteger.isPrime(myInt));
		
		MyInteger myInt1 = new MyInteger(18);
		System.out.println(myInt.equals(17));
		System.out.println(myInt.equals(myInt1));
		
		
		char[] abc = new char[] {'1', '2'};
		System.out.println(MyInteger.parseInt(abc));
		
		String xyz = "123";
		System.out.println(MyInteger.parseInt(xyz));
	}

}
