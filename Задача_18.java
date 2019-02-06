/**
 * Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит сторону квадрата a.\n Найдите периметр и площадь квадрата.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.printf("Периметр квадрата равен %d", a*4);
		System.out.printf("\nПлощадь равна %d", a*a);
	}

}
