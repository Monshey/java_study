/**
 * Пользователь вводит цены 1 кг конфет и 1 кг печенья. 
 * Найдите стоимость: 
 * а) одной покупки из 300 г конфет и 400 г печенья; 
 * б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;

public class Задача_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Пользователь вводит цены 1 кг конфет и 1 кг печенья. \n" + 
				"  Найдите стоимость:\n" + 
				"  а) одной покупки из 300 г конфет и 400 г печенья; \n" + 
				"  б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.\ns");
		Scanner in = new Scanner(System.in);
		try {
			double candy=(double)in.nextDouble();
			
			double cookie=(double)in.nextDouble();	
			
			System.out.printf("%nОтвет а)Стоймость конфет%.3f , стоймость печенек %.3f",0.3*candy,0.4*cookie);
			System.out.printf("%nОтвет b)%.3f",1.8*candy+2*cookie);
		}
		catch(Exception e) {System.out.println(e.getMessage());}
		
	}

}
