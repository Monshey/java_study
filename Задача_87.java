/**
 * ����� ����� 10+11+12+13+...+88. �������� ����� www.itmathrepetitor.ru �����: 3871
 */

/**
 * @author mindybaev
 *
 */
public class ������_87 {

	/**
	 * @param args
	 */
public static int posl(int n ,int n0) {
	int sum=0;
	if(n>=0) {
		for(int i =n0;i<=n;i++) {
			sum+=i;
		}
	}
		else {
			for(int i =n0;i>=n;i--) {
				sum+=i;
			}
		}
	return sum;
}
public static int posl(int n ) {
	int sum=0;
	if(n>=0) {
		for(int i =0;i<=n;i++) {
			sum+=i;
		}
	}
		else {
			for(int i =0;i>=n;i--) {
				sum+=i;
			}
		}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("����� ����� 10+11+12+13+...+88. �������� ����� www.itmathrepetitor.ru �����: 3871");
			System.out.println("��������� : "+posl(88,10));
	}

}
