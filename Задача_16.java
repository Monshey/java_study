/**
 * ������������ ������ ��� �����. ��������� ������ ����� � ��� ����, ������ ����� ��������� �� 3, ������ ����� ��������� � ������� � ����� ������� ����� ����� ���� �����.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ ������ ��� ����� a,b,c. \n��������� ������ ����� � ��� ����, ������ ����� ��������� �� 3, "
				+ "������ ����� ��������� � ������� \n� ����� ������� ����� ����� ���� �����");
		
		Scanner in = new Scanner(System.in);
		int a =in.nextInt()*2;
		int b=in.nextInt()-3;
		int c=in.nextInt();
			c*=c;
		System.out.printf("%n����� ���� ����� �����:%d",a+b+c);
	}

}
