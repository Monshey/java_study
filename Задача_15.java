/**
 * ������������ ������ �����. �������� �� ����� ������� ����� �����, ��� ����� �����.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ����� �����.");
		int a=in.nextInt();
		System.out.printf("��� ��� ������� %d, � ��� ��� ��� %d.",a*a,(int)Math.pow(a,3));
	}

}
