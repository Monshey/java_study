/**
 *������ ����� 1+1/2+1/3+�+1/n.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_94 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ����� 1+1/2+1/3+�+1/n.");
		System.out.print("n = ");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()) {
			int n = in.nextInt();
			if(n>0) {
				double m=1/(double)n;
				System.out.println("��������� : "+((m*(m+1))/2));
			}
		}
		else {
			System.out.println("������. ������ �� ���������. n - �� ���������� �����.");
		}
	}

}
