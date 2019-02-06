/**
 * Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите целое число.");
		int a=in.nextInt();
		System.out.printf("Вот его квадрат %d, а вот его куб %d.",a*a,(int)Math.pow(a,3));
	}

}
