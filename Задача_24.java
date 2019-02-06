/**
 * ������������ ������ ���������� ����, ��������� ������� ������ � ������ �����. 
 * ���������� �������, ���� �� ������ ���� ����� ������������� �� 3 $  
 * � ����� ����������� ������, �� ���� �������� ����� ��� ������������� �� ������ ����� ���������.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ ������ ���������� ����, ��������� ������� ������ � ������ �����. "
				+ "\n���������� �������, ���� �� ������ ���� ����� ������������� �� 3 $ "
				+ " \n� ����� ����������� ������, �� ���� �������� ����� ��� ������������� �� ������ ����� ���������.");
		Scanner in = new Scanner(System.in);
		
		System.out.print("���������� ���� ");
		int days=in.nextInt();
		
		System.out.print("\n������� ������ (%) ");
		double discount=in.nextInt()*0.01;
		
		System.out.print("\n����� (���) ");
		double sum = in.nextDouble();
		
		double income =0;
		double total=0;
		for(int i=0;i<days;i++){
			income=(income+sum)*discount;
			sum+=3;
			total+=income;
			System.out.printf("\n������� �� ���� %d ��������� %.2f",i,income);
		}
		if(days==1||days%10==1) {
			System.out.printf("\n����� ������� �� %d ���� ������ ��������� %.2f",days,total);	
		}
		if(days>=5||days%10>=5) {
				System.out.printf("\n����� ������� �� %d ���� ������ ��������� %.2f",days,total);
			}
		if(days<5||days%10<5){
			
			System.out.printf("\n����� ������� �� %d ��� ������ ��������� %.2f",days,total);
		}
	} 
}
