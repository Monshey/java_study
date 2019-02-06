/**
 * Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Пользователь вводит время в минутах и расстояние в километрах. \nНайдите скорость в м/c.");
		
		System.out.print("t(мин)=");
		double t=in.nextDouble();
		
		System.out.print("S(км)=");
		double S=in.nextDouble();
		
		System.out.printf("%nСкорость равна %.1f м/с. или %.1f км/ч.",(S*1000)/(t*60),S/(t/60));
		
	}

}
