/**
 * ���� �������� ����������� � �������� �������. ������� �����������  � �������� ����������.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� �������� ����������� � �������� �������."
				+ "\n������� �����������  � �������� ����������.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("t(C) = ");
		double t = in.nextDouble();
		
		System.out.printf(" = %.2f(F).", (t)*(9.0/5.0)+32);
	}

}
