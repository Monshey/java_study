/**
 * Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
 */

/**
 * @author mindybaev
 *
 */
public class Задача_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("0");
			}
			System.out.println();
		}
	}

}
