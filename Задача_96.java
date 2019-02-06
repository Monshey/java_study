/**
 * 
 */
/**
 *Вычислите 1⋅2+2⋅3⋅4+...+n⋅(n+1)⋅…⋅2n
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_96 {
//Задача #97 на самом деле 
	/**
	 * @param args
	 */
	public static long seq_97(int n) {
		long p=1;
		
		for(int i =1;i<=n;i++) {
			p+=i*(i+1)*(2*i);
			System.out.printf("p#%d = %d%n",i,p);
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Вычислите 1⋅2+2⋅3⋅4+...+n⋅(n+1)⋅…⋅2n");
		
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		if(in.hasNextInt()) {
		int n = in.nextInt();
		System.out.println("Результат : "+ seq_97(n));
		}
		else {
			System.out.println("Некорректные данные для n.");
		}
		in.close();
	}

}
