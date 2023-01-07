//java快速入门

public class hello {
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1 / 3;
		if(Math.abs(num1 - num2) < 0.00001){
			System.out.println("差不多相等");
		}
	    System.out.println(Math.abs(num1 - num2));
	}
}
