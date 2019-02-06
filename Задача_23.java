/**
 * Известно, что x кг конфет стоит a рублей. 
 * Определите, сколько стоит y кг этих конфет,а также сколько кг конфет можно купить на k рублей. 
 * Все значения вводит пользователь.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Известно, что x кг конфет стоит a рублей.\n"
				+ "Определите, сколько стоит y кг этих конфет, "
				+ "а также сколько кг конфет можно купить на k рублей"
				+ ".\nВсе значения вводит пользователь.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Вес (кг) = ");
		double x=in.nextDouble();
		
		System.out.print("Стоймость (руб) = ");
		double a = in.nextDouble();
		
		double price=a/x;
		System.out.printf("Цена за килограмм %.2f",price);
		
		System.out.print("\nСколько у вас есть? ");
		double k = in.nextDouble();
		System.out.printf("Вы можете купить %.2f (кг) конфет",k/price);
		
	}

}