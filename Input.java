//Scanner��ʹ��
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		//����һ�����ܶ�����Ϣ�ĳ���
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String name = myScanner.next();//����һ���ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();//����һ������int
		System.out.println("������нˮ");
		double salary = myScanner.nextDouble();//����һ��������double
		System.out.println("��B����Ϣ����");
		System.out.println("name=" + name + " age=" 
			+ age + " salary=" + salary);//ϵͳ���������Ϣ

	}
}