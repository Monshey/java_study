/**
 * ������������ ������ ���� ������� � ������. �������� ������� ��� 1$, 2$, ..., 100$ � ������,
 * ������� �������� �������� ���������� �� ������, 
 * ������� ����� ������ �� ������ �����, ���� ���� 1 �� ������ ����� 20 ���. 
 * ������: 1$ - 70 � - 3.5 �� � ��� ����� (����� 100 �����).
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_84 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("* ������������ ������ ���� ������� � ������. �������� ������� ��� 1$, 2$, ..., 100$ � ������,\r\n" + 
				" * ������� �������� �������� ���������� �� ������, \r\n" + 
				" * ������� ����� ������ �� ������ �����, ���� ���� 1 �� ������ ����� 20 ���. \r\n" + 
				" * ������: 1$ - 70 � - 3.5 �� � ��� ����� (����� 100 �����).");
		Scanner in = new Scanner(System.in);
		
		System.out.print("������� ���� ������� � ������ : ");
		double price = 70.0,qty=0.0;
		if(in.hasNextDouble()) {
			double val = in.nextDouble();
			for(int i=1;i<=100;i++) {
				double x=val*i;
				qty=x/price;
				System.out.printf("%d$\t%.2f(���.)\t%.2f (��.)%n",i,x,qty);
			}
		}
		else {
			System.out.println("�� ����� ������������ ������. ������������� ���������.");
		}
		in.close();
	}

}
