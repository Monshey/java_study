/**
 * Для данного n найти сумму 1+2+3+...+n. Например, для n=10 ответ равен 55
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_86 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Для данного n найти сумму 1+2+3+...+n. Например, для n=10 ответ равен 55");
		System.out.print("Введите n = ");
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextInt()) {
			int n = in.nextInt();
			int sum=0;
			if(n>=0) {
				for(int i =0;i<=n;i++) {
					sum+=i;
				}
			}
				else {
					for(int i =0;i>=n;i--) {
						sum+=i;
					}
				}
		System.out.println("Результат : "+sum);	
		}
		else {
			System.out.println("Введенные данные некоректны.");
		}
		in.close();
	}

}
