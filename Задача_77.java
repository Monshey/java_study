/**
 *�������� �� ����� ������������� �� �����. ���������� ����� ������ ������������, ���������� �������� ����� 5..
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_77 {

	/**
	 * @param args
	 */
	public static void show(int n) {
		for(int i=0;i<n;i++) {
			for(int j = 0;j < 5; j++){
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������� �� ����� ������������� �� �����. "
				+ "\n���������� ����� ������ ������������, ���������� �������� ����� 5.");
		Scanner in = new Scanner(System.in);
		System.out.print("������� �����? ");
		if(in.hasNextInt()) {
			int n = in.nextInt();
			show(n);
		}
		else {
			System.out.println("��������� ������ ����������. ������������� ���������.");
		}
		in.close();
	}

}
