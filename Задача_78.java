/**
 * Вывести на экран фигуру из звездочек:
*******
*******
*******
*******
(квадрат из n строк, в каждой строке n звездочек)
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_78{

	/**
	 * @param args
	 */
	public static void show(int n) {
		for(int i=0;i<n;i++) {
			for(int j = 0;j < n; j++){
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Выведите на экран (квадрат из n строк, в каждой строке n звездочек)");
		Scanner in = new Scanner(System.in);
		System.out.print("Сколько строк и столбцов? ");
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