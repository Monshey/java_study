/**
 * ��� ������� n ����� ����� 1+2+3+...+n. ��������, ��� n=10 ����� ����� 55
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_86 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��� ������� n ����� ����� 1+2+3+...+n. ��������, ��� n=10 ����� ����� 55");
		System.out.print("������� n = ");
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextInt()) {
			int n = in.nextInt();
			int sum=0;
			if(n>=0) {
				for(int i =0;i<=n;i++) {
					sum+=i;
				}
			}
				else {
					for(int i =0;i>=n;i--) {
						sum+=i;
					}
				}
		System.out.println("��������� : "+sum);	
		}
		else {
			System.out.println("��������� ������ ����������.");
		}
		in.close();
	}

}
