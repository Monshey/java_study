/**
 * ������������ ������ ���� 1 �� ������ � 1 �� �������. 
 * ������� ���������: 
 * �) ����� ������� �� 300 � ������ � 400 � �������; 
 * �) ���� �������, ������ �� 2 �� ������� � 1 �� 800 � ������.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;

public class ������_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("������������ ������ ���� 1 �� ������ � 1 �� �������. \n" + 
				"  ������� ���������:\n" + 
				"  �) ����� ������� �� 300 � ������ � 400 � �������; \n" + 
				"  �) ���� �������, ������ �� 2 �� ������� � 1 �� 800 � ������.\ns");
		Scanner in = new Scanner(System.in);
		try {
			double candy=(double)in.nextDouble();
			
			double cookie=(double)in.nextDouble();	
			
			System.out.printf("%n����� �)��������� ������%.3f , ��������� ������� %.3f",0.3*candy,0.4*cookie);
			System.out.printf("%n����� b)%.3f",1.8*candy+2*cookie);
		}
		catch(Exception e) {System.out.println(e.getMessage());}
		
	}

}
