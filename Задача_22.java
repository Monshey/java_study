/**
 * Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Дано значение температуры в градусах Цельсия."
				+ "\nВывести температуру  в градусах Фаренгейта.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("t(C) = ");
		double t = in.nextDouble();
		
		System.out.printf(" = %.2f(F).", (t)*(9.0/5.0)+32);
	}

}
