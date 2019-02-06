/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.*;

public class Ex_141 {
public static String ex_141 = "Сгенерируйте серию случайных чисел из 0, 1, 2 так, "
		+ "\nчтобы количество двоек было равно количеству нулей.";
public static String ex_142 = "Компьютер загадывает число от 1 до 100. У пользователя три попытки отгадать. "
		+ "\nПосле каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.";

public static void show_task(String s) {
	System.out.println(s);
}
public static void ex_141() {
	int t=0,n=0;
	int i = 0;
	Random rand = new Random();
do{		
		
		int r = rand.nextInt(3);
		System.out.printf("%3d",r);
		if(r!=1) {
			if(r==2) {
				t++;
			}
			else {
				n++;
			}
		}
		i++;
	}	while( ((t!=n) && (t>=0) && (n>=0))||(i<3)  );

}

public static void ex_142() {
	Random rand = new Random();
	Scanner in = new Scanner (System.in);
	int num =0;
	int r = rand.nextInt(101);
	int i= 0;
	do {
	System.out.println("Ввевдите число : ");
	 num=in.nextInt();
	if(num==r) {
		System.out.println("Вы угадали!");
	}
	else if(r>num) {
		System.out.println("Загаданное число больше. "+r);
	}
	else {
		System.out.println("Загаданное число меньше. "+r);
	}
	i++;
	}while((num!=r)&&(i<3));
	if(i==3) {
		System.out.println("Попытки закончились. Вы проиграли.");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show_task(ex_142);	ex_142();
	
	}

}
