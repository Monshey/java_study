/**
 * ������������ ������ ����� ������ � ���� � ������� �������. 
 * ������� ����� ������ ����� 5 ��� (����������� ��� ������� ���������� ���������)
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ ������ ����� ������ � ���� � ������� �������. "
				+ "\n������� ����� ������ ����� 5 ���. "
				+ "(����������� ��� ������� ���������� ���������.)");
		Scanner in = new Scanner(System.in);
		
		System.out.print("������� ����� ������: ");
		double sum = in.nextDouble();
		System.out.print("\n������� ������� �������: ");
		double percent=in.nextDouble();
		double sum_cap = sum;
		double sum_def = sum;
		System.out.println("����� ���� ��� ����� �� ����� ����� ��������:");
		
		for(int i =0;i<5;i++){
			sum_cap+=sum_cap*percent*0.01;
		}
		
		sum_def=sum+(sum*percent*0.01)*5;
		System.out.printf("%n ����� c �������������� %.2f",sum_cap);
		System.out.printf("%n ����� ��� ������������� %.2f",sum_def);
	}

}
