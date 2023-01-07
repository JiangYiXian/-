//Scanner的使用
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		//创建一个接受对象信息的程序
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = myScanner.next();//接受一个字符串
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//接受一个整型int
		System.out.println("请输入薪水");
		double salary = myScanner.nextDouble();//接受一个浮点数double
		System.out.println("这B的信息如下");
		System.out.println("name=" + name + " age=" 
			+ age + " salary=" + salary);//系统总体输出信息

	}
}