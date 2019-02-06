/**
 * Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;

public class Задача_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Даны катеты прямоугольного треугольника."
				+ "\nНайдите площадь, периметр и гипотенузу треугольника.");
		Scanner in = new Scanner(System.in);
		
		System.out.print("a=");
		double a=in.nextDouble();
		
		System.out.print("\nb=");
		double b=in.nextDouble();
		
		System.out.printf("Площадь треугольника %.3f%nПериметр %.3f%n Гипотенуза %.3f%n", a*b/2.0,a+b+Math.sqrt(a*a+b*b),
				Math.sqrt(a*a+b*b));
	}

}
