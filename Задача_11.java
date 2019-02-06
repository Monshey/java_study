
/**
 * Вычислите значение выражения (|x−5|−sinx) /3+sqrt(x2+2014)*cos2x − 3 при x=−2.34. Ответ: -1.76911 (проверено!)
 */

/**
 * @author mindybaev
 *
 */
public class Задача_11{


	/**
	 * @param args
	 */
	public static double func_11(double x)
	{	
		double y=0;
		try {
		 y=(Math.abs(x-5)-Math.sin(x))/3 + Math.sqrt(x*x+2014)*Math.cos(2*x)-3;
		}
		catch(Exception e) 
		{
			System.err.println(e.getMessage());
		}
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=-2.34;
		System.out.printf("Вычислите значение выражения (|x−5|−sinx) /3+sqrt(x2+2014)*cos2x − 3 при x=%.2f. Ответ:%.5f",x,func_11(x));
		}

}