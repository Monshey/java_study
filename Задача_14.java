/**
 * ������������ ������ ��� �����. ������� ����� � ������������ ������ �����.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("������� ��� ����� �����.");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.printf("����� ��������� ����� ����� %d%n"
					+ "������������ ��������� ����� ����� %d%n",a+b,b*a);
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
