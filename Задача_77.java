/**
 *Выведите на экран прямоугольник из нулей. Количество строк вводит пользователь, количество столбцов равно 5..
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_77 {

	/**
	 * @param args
	 */
	public static void show(int n) {
		for(int i=0;i<n;i++) {
			for(int j = 0;j < 5; j++){
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Выведите на экран прямоугольник из нулей. "
				+ "\nКоличество строк вводит пользователь, количество столбцов равно 5.");
		Scanner in = new Scanner(System.in);
		System.out.print("Сколько строк? ");
		if(in.hasNextInt()) {
			int n = in.nextInt();
			show(n);
		}
		else {
			System.out.println("Введенные данные некоректны. Перезапустите программу.");
		}
		in.close();
	}

}
