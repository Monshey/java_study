/**
 * Вычислите значение выражения (x+1)^2+3*(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
 */

/**
 * @author mindybaev
 *
 */
public class Задача_10 {


	/**
	 * @param args
	 */
	public static double func_10(double x)
	{
		double y=Math.pow(x+1, 2)+3*(x+1);
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1.7;
		System.out.printf("При а) x = %.1f (x+1)^2+3*(x+1)=(%.1f+1)^2+3*(%.1f+1)=%.2f",x,x,x,func_10(x));
		
		x=3;
		System.out.printf("%nПри б) x = %.1f (x+1)^2+3*(x+1)=(%.1f+1)^2+3*(%.1f+1)=%.2f",x,x,x,func_10(x));
	}

}
