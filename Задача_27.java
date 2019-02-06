/**
 * Даны три переменные a, b и c. 
 * Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
 *  в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
 *  Например, a=0, b=2, c=5, тогда новые значения a=2, b=3 и c=7.
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" * Даны три переменные a, b и c. \r\n" + 
				" * Изменить значения этих переменных так, чтобы в a хранилось значение a+b,\r\n" + 
				" *  в b хранилась разность старых значений c−a, "
				+ "а в c хранилось сумма старых значений a+b+c.\r\n" + 
				" *  Например, a=0, b=2, c=5, тогда новые значения a=2, b=3 и c=7.");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("\na = ");
		int a = in.nextInt();
		System.out.print("\nb = ");
		int b = in.nextInt();
		System.out.print("\nc = ");
		int c = in.nextInt();
		int a1=a+b;
		int b1=c-a;
		int c1=a+b+c;
		a=a1;b=b1;c=c1;
		
		System.out.printf("a=a+b=%d\tb=c-a=%d\tc=a+b+c=%d",a,b,c);
	}

}
