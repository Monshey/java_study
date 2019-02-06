/**
 * Выведите на экран n раз фразу "Silence is golden". Число n вводит пользователь.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_76 {

	/**
	 * @param args
	 */
	public static void show(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Silence is good");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Выведите на экран n раз фразу \"Silence is golden\". Число n вводит пользователь.");
		Scanner in = new Scanner(System.in);
		System.out.print("Сколько раз повторить? ");
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
