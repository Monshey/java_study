/**
 * ��������, ��� x �� ������ ����� a ������. 
 * ����������, ������� ����� y �� ���� ������,� ����� ������� �� ������ ����� ������ �� k ������. 
 * ��� �������� ������ ������������.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��������, ��� x �� ������ ����� a ������.\n"
				+ "����������, ������� ����� y �� ���� ������, "
				+ "� ����� ������� �� ������ ����� ������ �� k ������"
				+ ".\n��� �������� ������ ������������.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("��� (��) = ");
		double x=in.nextDouble();
		
		System.out.print("��������� (���) = ");
		double a = in.nextDouble();
		
		double price=a/x;
		System.out.printf("���� �� ��������� %.2f",price);
		
		System.out.print("\n������� � ��� ����? ");
		double k = in.nextDouble();
		System.out.printf("�� ������ ������ %.2f (��) ������",k/price);
		
	}

}