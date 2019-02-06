/**
 * Вычислите значение выражения x2+b−−−−−√5−b2sin3(x+a)x при a=0.1, b=0.2 и x=1 Ответ: 1.0088
 */

/**
 * @author mindybaev
 *
 */
public class Задача_13 {

		/**
		 * @param args
		 */
	public static boolean isNthRoot(double value, int n)
	{
	   
		double a = Math.pow(value, 1.0 / n);
	    return Math.pow(Math.round(a), n) == value;
	}
	
	private static boolean isNthRoot(double value, int n, double precision) {
	    double a = Math.pow(value, 1.0 / n);
	    return Math.abs(a - Math.round(a)) < precision; // if a and round(a) are "close enough" then we're good
	}
	
		public static double func_13(double a,double b,double x)
		{
			double y = 0;
			try {
			y=Math.pow(x*x+b, 1.0/5.0) - (b*b*Math.pow(Math.sin(x+a), 3)/x);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			return y;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double a=0.1,b=0.2,x=1.0;
			System.out.printf("Значение выражения при a=%.1f, b=%.1f, x=%.1f Ответ:%.4f",a,b,x,func_13(a,b,x));
			System.out.println(isNthRoot(x*x+b,5));
			System.out.println(isNthRoot(x*x+b,5,0.09));
		}

	}