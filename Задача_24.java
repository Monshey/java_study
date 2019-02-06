/**
 * Пользователь вводит количество дней, указывает процент скидки и вводит сумму. 
 * Рассчитать прибыль, если за каждый день сумма увеличивается на 3 $  
 * и затем применяется скидка, то есть итоговая сумма еще увеличивается на данное число процентов.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит количество дней, указывает процент скидки и вводит сумму. "
				+ "\nРассчитать прибыль, если за каждый день сумма увеличивается на 3 $ "
				+ " \nи затем применяется скидка, то есть итоговая сумма еще увеличивается на данное число процентов.");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Количество дней ");
		int days=in.nextInt();
		
		System.out.print("\nПроцент скидки (%) ");
		double discount=in.nextInt()*0.01;
		
		System.out.print("\nСумма (руб) ");
		double sum = in.nextDouble();
		
		double income =0;
		double total=0;
		for(int i=0;i<days;i++){
			income=(income+sum)*discount;
			sum+=3;
			total+=income;
			System.out.printf("\nПрибыль за день %d составила %.2f",i,income);
		}
		if(days==1||days%10==1) {
			System.out.printf("\nИтого прибыль за %d день скидки составила %.2f",days,total);	
		}
		if(days>=5||days%10>=5) {
				System.out.printf("\nИтого прибыль за %d дней скидки составила %.2f",days,total);
			}
		if(days<5||days%10<5){
			
			System.out.printf("\nИтого прибыль за %d дня скидки составила %.2f",days,total);
		}
	} 
}
