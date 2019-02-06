/**
 * Найти сумму cos35+cos57+cos79+...+cos111113.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_90 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Найти сумму cos3/5+cos5/7+cos7/9+...+cos111/113.");
		double sum=0;
		for(int i =3;i<111;i+=2) {
			sum+=Math.cos((double)(i/(i+2)));	
		}
		System.out.println("Результат : "+sum);
	}

}
