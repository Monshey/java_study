/**
 * Найдите сумму квадратов первых n натуральных чисел
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_93 {

	/**
	 * @param args
	 */
	public static int sum_sq(int n) {
		int sum=0;
		for(int i = 1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Найдите сумму квадратов первых n натуральных чисел");
		System.out.print("n = ");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()) {
			int n = in.nextInt();
			if(n>0) {
				System.out.println("Результат : "+sum_sq(n));
			}
		}
		else {
			System.out.println("Ошибка. Данные не корректны. n - не натурально число.");
		}
		in.close();
	}

}
