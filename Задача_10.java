/**
 * ��������� �������� ��������� (x+1)^2+3*(x+1) ��� �) x=1.7; �) x=3. �����: �) 15.39 �) 28
 */

/**
 * @author mindybaev
 *
 */
public class ������_10 {


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
		System.out.printf("��� �) x = %.1f (x+1)^2+3*(x+1)=(%.1f+1)^2+3*(%.1f+1)=%.2f",x,x,x,func_10(x));
		
		x=3;
		System.out.printf("%n��� �) x = %.1f (x+1)^2+3*(x+1)=(%.1f+1)^2+3*(%.1f+1)=%.2f",x,x,x,func_10(x));
	}

}
