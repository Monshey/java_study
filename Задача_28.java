/**
 * Пользователь вводит сумму вклада в банк и годовой процент. 
 * Найдите сумму вклада через 5 лет (рассмотреть два способа начисления процентов)
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит сумму вклада в банк и годовой процент. "
				+ "\nНайдите сумму вклада через 5 лет. "
				+ "(рассмотреть два способа начисления процентов.)");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите сумму вклада: ");
		double sum = in.nextDouble();
		System.out.print("\nВведите годовой процент: ");
		double percent=in.nextDouble();
		double sum_cap = sum;
		double sum_def = sum;
		System.out.println("Через пять лет сумма на вашем счете составит:");
		
		for(int i =0;i<5;i++){
			sum_cap+=sum_cap*percent*0.01;
		}
		
		sum_def=sum+(sum*percent*0.01)*5;
		System.out.printf("%n Тариф c капитализацией %.2f",sum_cap);
		System.out.printf("%n Тариф без капитализации %.2f",sum_def);
	}

}
