/**
 * Вычислите значение выражения ex−2+|sin(x)|−x4⋅cos1x при x=3.6 Ответ: -156.1276
 */

/**
 * @author mindybaev
 *
 */
public class Задача_12 {

	/**
	 * @param args
	 */
	public static double func_12(double x)
	{
		double y = 0;
		try {
			y=Math.exp(x-2)+Math.abs(Math.sin(x))-Math.pow(x, 4)*Math.cos(1.0/x);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=3.6;
		System.out.printf("Значение выражения e^(x−2)+|sin(x)|−x^4⋅*cos(1/x) при x=%.1f Ответ:%.5f",x,func_12(x));
	}

}
