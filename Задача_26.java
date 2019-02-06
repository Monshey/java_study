/**
 * Даны две переменных с некоторыми значениями. Поменять местами значения этих переменных
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
import java.lang.*;
public class Задача_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Даны две переменных с некоторыми значениями.\nПоменять местами значения этих переменных");
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nПеременная a = ");
	//	double a = in.nextDouble();
		Object A=in.nextLine(); 
		System.out.print("Переменная b = ");

	//	double b=in.nextDouble();
		Object B=in.nextLine();
		System.out.print("A = ");
		System.out.print(A);
		System.out.print("\t");
		System.out.print("B = ");
		System.out.print(B);
		System.out.println("\nВот это поворот!");
		Object C;
		C=A;
		A=B;
		B=C;
	//	System.out.printf("\na=%f , b=%f\nВот это поворот!\n",a,b);
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
