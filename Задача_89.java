/**
 *Найти сумму  1+4+7+11+...+112.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_89 {

	/**
	 * @param args
	 */
public static int posl_89(int n) {
	int sum=0;
for(int i=0;i<=n;i+=3)
{
	sum+=i;
}
	return sum;
}

public static int posl_89(int n,int n0) {
	int sum=0;
for(int i=n0;i<=n;i+=3)
{
	sum+=i;
}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Найти сумму  1+4+7+10+...+112.");
			System.out.println("Результат : "+posl_89(112,1));
	}

}
