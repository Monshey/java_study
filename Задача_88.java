/**
 * Найти произведение 5⋅6⋅7⋅...⋅13.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_88 {

	/**
	 * @param args
	 */
public static int mult(int n ,int n0) {
	int mult = 1;
	for(int i = n0;i<=n;i++) {
		mult*=i;
	}
	return mult;
}

	public static int mult(int n) {
		int mult = 1;
		for(int i = 1;i<=n;i++) {
			mult*=i;
		}
		return mult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Найти произведение 5⋅6⋅7⋅...⋅13.");
			System.out.println("Результат : "+mult(3,1));
	}

}
