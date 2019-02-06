/**
 * Выведите на экран числа 1.2, 1.4, 1.6, ..., 2.8.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_82 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Выведите на экран числа 1.2, 1.4, 1.6, ..., 2.8.");
		for(double i =1.2;i<=2.8;i+=0.2){
			System.out.printf("%.1f ",i);
		}
	}

}
