/**
 * ���� ��� ���������� � ���������� ����������. �������� ������� �������� ���� ����������
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
import java.lang.*;
public class ������_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("���� ��� ���������� � ���������� ����������.\n�������� ������� �������� ���� ����������");
		Scanner in = new Scanner(System.in);
		
		System.out.print("\n���������� a = ");
	//	double a = in.nextDouble();
		Object A=in.nextLine(); 
		System.out.print("���������� b = ");

	//	double b=in.nextDouble();
		Object B=in.nextLine();
		System.out.print("A = ");
		System.out.print(A);
		System.out.print("\t");
		System.out.print("B = ");
		System.out.print(B);
		System.out.println("\n��� ��� �������!");
		Object C;
		C=A;
		A=B;
		B=C;
	//	System.out.printf("\na=%f , b=%f\n��� ��� �������!\n",a,b);
	//	double c = a;
	//	a=b;
	//	b=c;
		System.out.print("A = ");
		System.out.print(A);
		System.out.print("\t");
		System.out.print("B = ");
		System.out.print(B);
	}

}
