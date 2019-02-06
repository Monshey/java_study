/**
 * Вычислите |x|+x5, если x=−2. Ответ: -30
 */

/**
 * @author mindybaev
 *
 */

public class Задача_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -2,y=0;
		
		try {
				y=(int)(Math.abs(x) + Math.pow(x, 5));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.printf("x=%d |x|+x^5=|%d|+%d^5=%d",x,x,x,y);
	}

}
