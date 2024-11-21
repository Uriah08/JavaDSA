package datastuctures;

public class recursionn {
	public static void main(String[] args) {
		//Recursion//////
		
//		System.out.println(factorial(5));
//		
//		walk(5);
		
		System.out.println(power(2,8));
	}

	private static int power(int base, int exponent) {
		// TODO Auto-generated method stub
		if(exponent < 1) return 1;
		return base * power(base, exponent-1);
	}

//	private static int factorial(int num) {
//		if(num < 1) {
//			return 1;
//		}
//		return num*factorial(num-1);
//	}
//
//	private static void walk(int step) {
//		if(step < 1) {
//			return;
//		}
//		System.out.println(step);
//		System.out.println("You take a step!");
//		walk(step-1);
//	}
}
