package datastuctures;

public class BigO {

	public static void main(String[] args) {
		//Sample BIG O Notation
		
		System.out.println(addUp(345435));
		System.out.println(adddUp(345435));
		
		//6 BIG O Notations
		//Constant Time
		//Logarithmic Time
		//Linear Time
		//Quasilinear Time
		//Quadratic Time
		//Factorial Time
	}
	 //O Linear Time/////
	static int addUp(int n) {
		int sum = 0;
		for(int i = 0;i <= n;i++) {
			sum += i;
		}
		return sum;
	}
	//O Constant Time/////
	static int adddUp(int n) {
		int sum = n * (n + 1) / 2;
		return sum;
	}
}
