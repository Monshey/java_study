/**
 * Найти сумму 2/3+3/4+4/5+...+9/10.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_91 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Найти сумму 2/3+3/4+4/5+...+9/10.");
		double sum=0.0;
		
		for(int i=2;i<=10;i++) {
			sum+=((double)i/(double)(i+1));
			System.out.printf("Результат #%d : %f%n",i,sum);
		}
		
		System.out.println("Результат : "+ sum);
	}

}
