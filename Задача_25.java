/**
 * Пользователь вводит количество недель, месяцев, лет и получает количество дней за это время.
 *  Считать, что в месяце 30 дней.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит количество недель, месяцев, лет и получает количество дней за это время.\n" + 
				"Считать, что в месяце 30 дней.");
		
		Scanner in = new Scanner(System.in);
		System.out.print("Количество недель ");
		int weeks=in.nextInt();
		
		System.out.print("Количество месяцев ");
		int months=in.nextInt();
		
		System.out.print("Количество лет ");
		int years=in.nextInt();
		
		int days = 7*weeks+30*months+12*30*years;
		
		if(days%10==1) {
			System.out.printf("\nВ указанном промежутке %d день",days);	
		}
		if(days%10>=5) {
			System.out.printf("\nВ указанном промежутке %d дней",days);	
			}
		if(days<5||days%100<5){
			System.out.printf("\nВ указанном промежутке %d дня",days);	
		}
		in.close();
	}

}
