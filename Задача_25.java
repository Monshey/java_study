/**
 * ������������ ������ ���������� ������, �������, ��� � �������� ���������� ���� �� ��� �����.
 *  �������, ��� � ������ 30 ����.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ ������ ���������� ������, �������, ��� � �������� ���������� ���� �� ��� �����.\n" + 
				"�������, ��� � ������ 30 ����.");
		
		Scanner in = new Scanner(System.in);
		System.out.print("���������� ������ ");
		int weeks=in.nextInt();
		
		System.out.print("���������� ������� ");
		int months=in.nextInt();
		
		System.out.print("���������� ��� ");
		int years=in.nextInt();
		
		int days = 7*weeks+30*months+12*30*years;
		
		if(days%10==1) {
			System.out.printf("\n� ��������� ���������� %d ����",days);	
		}
		if(days%10>=5) {
			System.out.printf("\n� ��������� ���������� %d ����",days);	
			}
		if(days<5||days%100<5){
			System.out.printf("\n� ��������� ���������� %d ���",days);	
		}
		in.close();
	}

}
