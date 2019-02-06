/**
 * Даны a и n. Вычислите p=(a+1)^2(a+2)^2⋅…⋅(a+n)^2
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_95 {

	/**
	 * @param args
	 */
	public static long seq_95(int a,int n) {
		long p=1;
		
		for(int i =1;i<=n;i++) {
			p*=(a+i)*(a+i);
			System.out.printf("p#%d = %d%n",i,p);
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Даны a и n. Вычислите p=(a+1)^2(a+2)^2⋅…⋅(a+n)^2");
		
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		if(in.hasNextInt()) {
			int a=in.nextInt();
			System.out.print("n = ");
			if(in.hasNextInt()) {
				int n = in.nextInt();
				System.out.println("Результат : " + seq_95(a,n));
			}
			else {
				System.out.println("Некорректные данные для n.");
			}
		}
		else {
			System.out.println("Некорректные данные для a.");
		}
		
	}

}
