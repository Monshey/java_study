/**
 * Пользователь вводит количество строк. 
 * Вывести на экран логотип соответствующего размера. 
 * Если текст не помещается, то вывести логотип без текста. 
 */

/**
 * @author mindybaev
 *
 */
import java.util.Scanner;
public class Задача_85 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Пользователь вводит количество строк. "
				+ "\nВывести на экран логотип соответствующего размера. "
				+ "\nЕсли текст не помещается, то вывести логотип без текста. ");
		System.out.print("Введите количество строк больше 8 : ");
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
			System.out.println("Вы ввели некорректные данные. Пожалуйста перезапустите программу.");
		}
		in.close();
	}

}
