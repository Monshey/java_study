/**
 * Пользователь вводит три числа. 
 * Найдите среднее арифметическое этих чисел, а также разность удвоенной суммы первого 
 * и третьего чисел и утроенного второго числа.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;

public class Задача_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит три числа a,b,c.\n Найдите среднее арифметическое этих чисел, а также разность удвоенной "
				+ "суммы первого\n и третьего чисел и утроенного второго числа.");
	
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	
	System.out.printf("\nСреднее арифметическое этих чисел: %.2f",(double)(a+b+c)/3);
	System.out.printf("\nРазность удвоенной суммы первого и третьего чисел и утроенного второго "
			+ "числа: %.2f",(double)(2*(a+c)-3*b));
	
	
	}

}
