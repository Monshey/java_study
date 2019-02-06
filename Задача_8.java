/**
 * ычислите значение выражения (a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94
 */

/**
 * @author mindybaev
 *
 */
public class Задача_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=3,c=(a+4*b)*(a-3*b)+a*a;
		System.out.printf("a=%d,b=%d %n (a+4*b)(a−3*b)+a^2 = (%d+4*%d)(%d−3*%d)+%d^2 = %d",a,b,a,b,a,b,a,c);
	}

}
