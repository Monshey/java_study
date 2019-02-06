/**
 * Пользователь вводит два числа. Найдите сумму и произведение данных чисел.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Введите два целых числа.");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.printf("Сумма введенных чисел равна %d%n"
					+ "Произведение введенных чисел равно %d%n",a+b,b*a);
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
