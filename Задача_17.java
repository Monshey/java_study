/**
 * ������������ ������ ��� �����. 
 * ������� ������� �������������� ���� �����, � ����� �������� ��������� ����� ������� 
 * � �������� ����� � ���������� ������� �����.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;

public class ������_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ ������ ��� ����� a,b,c.\n ������� ������� �������������� ���� �����, � ����� �������� ��������� "
				+ "����� �������\n � �������� ����� � ���������� ������� �����.");
	
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	
	System.out.printf("\n������� �������������� ���� �����: %.2f",(double)(a+b+c)/3);
	System.out.printf("\n�������� ��������� ����� ������� � �������� ����� � ���������� ������� "
			+ "�����: %.2f",(double)(2*(a+c)-3*b));
	
	
	}

}
