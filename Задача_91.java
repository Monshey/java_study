/**
 * ����� ����� 2/3+3/4+4/5+...+9/10.
 */

/**
 * @author mindybaev
 *
 */
public class ������_91 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ����� ����� 2/3+3/4+4/5+...+9/10.");
		double sum=0.0;
		
		for(int i=2;i<=10;i++) {
			sum+=((double)i/(double)(i+1));
			System.out.printf("��������� #%d : %f%n",i,sum);
		}
		
		System.out.println("��������� : "+ sum);
	}

}
