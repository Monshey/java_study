/**
 * ���� ������ �������������� ������������. ������� �������, �������� � ���������� ������������.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;

public class ������_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ �������������� ������������."
				+ "\n������� �������, �������� � ���������� ������������.");
		Scanner in = new Scanner(System.in);
		
		System.out.print("a=");
		double a=in.nextDouble();
		
		System.out.print("\nb=");
		double b=in.nextDouble();
		
		System.out.printf("������� ������������ %.3f%n�������� %.3f%n ���������� %.3f%n", a*b/2.0,a+b+Math.sqrt(a*a+b*b),
				Math.sqrt(a*a+b*b));
	}

}
