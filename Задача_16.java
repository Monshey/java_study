/**
 * Пользователь вводит три числа. Увеличьте первое число в два раза, второе числа уменьшите на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит три числа a,b,c. \nУвеличьте первое число в два раза, второе числа уменьшите на 3, "
				+ "третье число возведите в квадрат \nи затем найдите сумму новых трех чисел");
		
		Scanner in = new Scanner(System.in);
		int a =in.nextInt()*2;
		int b=in.nextInt()-3;
		int c=in.nextInt();
			c*=c;
		System.out.printf("%nСумма этих чисел равна:%d",a+b+c);
	}

}
