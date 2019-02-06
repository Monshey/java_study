/**
 * Вывести на экран текущее название дня недели, название месяца и свое имя. Каждое слово должно быть в отдельной строке.
 */

/**
 * @author mindybaev
 *
 */


import java.util.Calendar;

import static java.util.Calendar.MONTH;

import java.util.*;
public class Задача_2 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Locale locale = Locale.getDefault();
		Calendar cal = Calendar.getInstance();
		
	//	System.out.println(cal.getTime());
	//	System.out.println(cal.get(cal.get(cal.MONTH)));
		
		System.out.println(cal.getDisplayName(MONTH,Calendar.LONG_STANDALONE,locale));
		System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG_STANDALONE,locale));
		System.out.println("Ilya");
		
	}

}
