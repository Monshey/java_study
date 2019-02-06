/**
 * Вывести на экран сто первых сумм вида 1+2+3+...+n.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_92 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Вывести на экран сто первых сумм вида 1+2+3+...+n.");
		for(int i = 1;i<=100;i++) {
			System.out.printf("Cумма #%d : %d %n",i,(i*(i+1))/2 );
		}
	}

}
