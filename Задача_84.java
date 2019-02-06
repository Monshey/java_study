/**
 * Пользователь вводит курс доллара в рублях. Показать таблицу цен 1$, 2$, ..., 100$ в рублях,
 * третьим столбцом добавить количество кг конфет, 
 * которые можно купить на данные суммы, если цена 1 кг конфет равна 20 руб. 
 * Пример: 1$ - 70 р - 3.5 кг и так далее (всего 100 строк).
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_84 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("* Пользователь вводит курс доллара в рублях. Показать таблицу цен 1$, 2$, ..., 100$ в рублях,\r\n" + 
				" * третьим столбцом добавить количество кг конфет, \r\n" + 
				" * которые можно купить на данные суммы, если цена 1 кг конфет равна 20 руб. \r\n" + 
				" * Пример: 1$ - 70 р - 3.5 кг и так далее (всего 100 строк).");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите курс доллара в рублях : ");
		double price = 70.0,qty=0.0;
		if(in.hasNextDouble()) {
			double val = in.nextDouble();
			for(int i=1;i<=100;i++) {
				double x=val*i;
				qty=x/price;
				System.out.printf("%d$\t%.2f(руб.)\t%.2f (кг.)%n",i,x,qty);
			}
		}
		else {
			System.out.println("Вы ввели некорректные данные. Перезапустите программу.");
		}
		in.close();
	}

}
