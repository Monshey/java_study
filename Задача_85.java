/**
 * ������������ ������ ���������� �����. 
 * ������� �� ����� ������� ���������������� �������. 
 * ���� ����� �� ����������, �� ������� ������� ��� ������. 
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class ������_85 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ ������ ���������� �����. "
				+ "\n������� �� ����� ������� ���������������� �������. "
				+ "\n���� ����� �� ����������, �� ������� ������� ��� ������. ");
		System.out.print("������� ���������� ����� ������ 8 : ");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()) {
			int n = in.nextInt();
			if(n>=8) {
			
			String s_1 = "CODE THE WORLD",s_2="http://www.itmathrepetitor.ru";
			
			System.out.println("[[[[[[[[[[[[[[[\t\t\t\t]]]]]]]]]]]]]]]");
			for(int i = 0;i<n;i++) {
				
				
				if((i==2)||(i==n-2)) {
					System.out.println("[:::::::[[[[[[[\t\t\t\t]]]]]]]:::::::]");
					continue;
				}
				if(i<2||i>n-2) {
					System.out.println("[::::::::::::::\t\t\t\t::::::::::::::]");
					continue;
				}
				if(i>3||i<n-3) {
					if(i==n/2) {
						System.out.println("[:::::[\t"+s_1+"\t]:::::]");
					}
					else {
						if(i==(n/2)+1) {
							System.out.println("[:::::["+s_2+"]:::::]");	
						}
						else {
							System.out.println("[:::::[ \t\t\t\t ]:::::]");
						}
					}
				}
			}
		}
			

			System.out.println("[[[[[[[[[[[[[[[\t\t\t\t]]]]]]]]]]]]]]]]");
		}
		else {
			System.out.println("�� ����� ������������ ������. ���������� ������������� ���������.");
		}
		in.close();
	}

}
