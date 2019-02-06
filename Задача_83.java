/**
 * Выведите следующие строки. Первая: 25  25.5  24.8. Вторая: 26 26.5 25.8.  И так далее. Последняя строка: 35 35.5 34.8.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_83 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 25;i<=35;i++) {
			System.out.printf("%d %.1f %.1f%n",i,(double)(i+0.5),(double)(i-0.2));
		}
	}

}
