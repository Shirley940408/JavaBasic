/*
	��¼��С����
	�û�����admin
	���룺123
	���������ȷ���û�������������ʾ��¼�ɹ���������ʾ��¼ʧ��
*/
import java.util.Scanner;


public class AL04_TestIfElse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your name");
		String name = sc.next();

		System.out.println("please input your password");
		String password = sc.next();
//Because the String is not the basic data type, it cannot use '==' to compare with.
		if("admin".equals(name) && "123".equals(password)){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ�ܣ��û������������");
		}
	}
}