/**
 * ������������ ������ ����� � ������� � ���������� � ����������. ������� �������� � �/c.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("������������ ������ ����� � ������� � ���������� � ����������. \n������� �������� � �/c.");
		
		System.out.print("t(���)=");
		double t=in.nextDouble();
		
		System.out.print("S(��)=");
		double S=in.nextDouble();
		
		System.out.printf("%n�������� ����� %.1f �/�. ��� %.1f ��/�.",(S*1000)/(t*60),S/(t/60));
		
	}

}
