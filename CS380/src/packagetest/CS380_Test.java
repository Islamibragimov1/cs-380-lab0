package packagetest;

public class CS380_Test {
	public static void main(String[] args) {
		System.out.println("The First Lab Cs 380");
		System.out.println(reverseInteger(12345));
	}

	public static int reverseInteger(int n) {
		int reversed = 0;
		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		return reversed;

	}
}
