/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ex_135_144 {
public static String ex_135 = "Выведите случайную серию чисел из 0 и 1 такую, что сумма чисел в ней больше 10.";
public static String ex_136 = "Дано n кирпичей. Вы и компьютер ходите поочередно. за ход можно взять 1, 2 или 3 кирпича.\n "
		+ "Проиграл тот, кому нечего брать. Реализуйте игру с компьютером. Компьютер ходит случайно (без анализа выигрышной стратегии),\n "
		+ "однако если у него есть ход, который является последним для его выигрыша, то он его совершает.";
public static String ex_137 = "Реализуйте серию из n игр \"Камень, ножницы, бумага\" с компьютером. "
		+ "\nВ результате выведите статистику: сколько игр выиграл пользователь, сколько раз каждого вида ходов было выбрано. \n"
		+ "Дополните игру анализом компьютера ваших ходов и выбор наиболее подходящего против вас хода.";
public static String ex_138 = "Сгенерировать случайную серию из 15 чисел, в которой ровно 3 единицы, остальные нули.";
public static String ex_139 = "Сгенерируйте серию из 10 случайных чисел от 1 до 3 и найдите: "
		+ "/nа) на сколько количество двоек больше/меньше количества троек,"
		+ "/nб) количество троек, стоящих на четных местах, "
		+ "/nв)количество двоек среди первых пяти чисел серии.";
public static String ex_140 = "Cгенерировать 20 серий из 0, 1, 2 таких, что сумма чисел в каждой серии равна 12."
		+ "\nНайти количество единиц в каждой серии, "
		+ "\nколичество двоек в каждой серии, длину каждой серии, "
		+ "\nсреднее количество двоек в сериях, среднюю длину серий "
		+ "\nи наибольшее количество ненулевых чисел в сериях.";
public class Serial{
	Vector vector = new Vector();
	int count_1;
	int count_2;
	int length;
	int count_not_0;
	Serial(){
		
	}
	public int get_count_1() {
		return this.count_1;
	}
	public int get_count_2() {
		return this.count_2;
	}
	public int get_count_not_0() {
		return this.count_not_0;
	}
	public int get_length() {
		return this.length;
	}
	public void fill(int n ) {
		int sum=0;
		count_1 =0;
		count_2=0;
		length = 0;
		count_not_0=0;
		while(sum!=n) {
			int r=rand.nextInt(3);
			this.vector.addElement(r);
		}
	}
	public void calculate(int n) {
		this.fill(n);
		for(int i = 0;i<n;i++) {
			if((int)this.vector.get(i)==1) {this.count_1++;}
			if((int)this.vector.get(i)==2) {this.count_2++;}
		}
		this.length=this.vector.size();
		this.count_not_0=this.count_1+this.count_2;
	
	}
};
public Random rand = new Random();



public static void show_task(String s) {
	System.out.println(s);
}
public static void ex_135(int n) {
	int i=0,sum=0;
	Random rand = new Random();
	while(sum<=n) {
		i = rand.nextInt(2);
		sum+=i;
		System.out.printf("Число %d Сумма %d%n",i,sum);
	}
}
public static void ex_136(int n) {
	int u=0,p=0,k=1;
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("В стопке "+n+" кирпичей.");
	while(n>=0) {
		if(n==0) {
			System.out.println("В стопке "+n+" кирпичей. Компьютер победил." );
			break;
		}
		System.out.printf("%nХод %d : Возьмите 1,2,3 кирпича из стопки :  ",k++);
		u= in.nextInt();
		n-=u;
		System.out.printf("Вы взяли %d кирпичей, в стопке осталось %d.%n",u,n);
		if(n<0) {
			System.out.println("В стопке "+n+" кирпичей. Компьютер победил." );
			break;
		}
		p=rand.nextInt(3)+1;
		n-=p;
		if(n==0) {
			System.out.printf("Компьютер взял %d кирпичей, в стопке осталось %d.%n",p,n);
			System.out.println("Компьютер победил.");
			break;
		}
	
		System.out.printf("Компьютер взял %d кирпичей, в стопке осталось %d.",p,n);
	}
	in.close();
}
public static void ex_137(int n) {
	String[] game = {"Камень","Ножницы", "Бумага"};
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	String comp = "";
	String user = "";
	int u=0,c=0;
	while(n>0) {
		System.out.print("Раунд#"+n--+" : ваш ход : ");
		user = in.nextLine();
		comp = game[rand.nextInt(3)];
		System.out.println("Ход компьютера : "+ comp);
		if(user.equalsIgnoreCase(comp)) {
			System.out.println("Ничья");
		}
		else if(user.equalsIgnoreCase("Камень")) {
			if(comp==game[1]&&(game[1]!=null)) {
				u++;
				System.out.println("Вы победили." );
			}
			else {
				c++;
				System.out.println("Вы проиграли.");
			}
			
		}
		else if(user.equalsIgnoreCase("Ножницы")){
			if(comp==game[2]&&(game[2]!=null)) {
				u++;
				System.out.println("Вы победили." );
			}
			else {
				c++;
				System.out.println("Вы проиграли.");
			}
		}
		else if(user.equalsIgnoreCase("Бумага")){
			if(comp==game[0]&&(game[0]!=null)) {
				u++;
				System.out.println("Вы победили." );
			}
			else {
				c++;
				System.out.println("Вы проиграли.");
			}
		}
		else {
			System.out.println("Вы ввели неправильную команду.");
		}
	}
	System.out.printf("Счет %d : %d. Итог : %s %n",u,c,((u>c)?"Победа игрока!":((u==c)?"Ничья.":"Победа компьютера.")));
	in.close();
}
public static void ex_138(int n,int m) {
	Random rand = new Random();
	int [] arr = new int[n];
	for(int i =0;i<n;i++) {
		arr[i]=0;
		System.out.print((i%5==0?"\n":"\t")+arr[i]);
	}
	for(int i = 0;i<m;i++) {
		int index = rand.nextInt(n+1);
		if(arr[index]==0) {
			arr[index]=1;
		}
		else {
			m++;
		}
	}
	System.out.println("\n\nЗаполним случайно единицами.");
	for(int i =0;i<n;i++) {
		System.out.print((i%5==0?"\n":"\t")+arr[i]);
	}
	
}
public static void ex_139(int n) {
	int[] arr = new int[n];
	Random rand = new Random();
	int count_2=0,count_3=0,count_chetn_3=0,count_2_in_first_five=0;
	for(int i =0;i<n;i++) {
		arr[i]=rand.nextInt(3)+1;
		System.out.print((i%5==0?"\n":"\t")+arr[i]);
		if(arr[i]==2) {
			count_2++;
		}
		if(arr[i]==3) {
			count_3++;
		}
		if((arr[i]==3)&&i%2==0) {
			count_chetn_3++;
		}
		if((arr[i]==2)&&(i<5)) {
			count_2_in_first_five++;
		}
	}
	System.out.printf("%nДвоек на %d %s троек",(int)Math.abs(count_2-count_3),(count_2>=count_3?"больше":"меньше"));
	System.out.printf("%nКоличество троек, стоящих на четных местах : %d",count_chetn_3);
	System.out.printf("%nКоличество двоек среди первых пяти чисел серии : %d", count_2_in_first_five);
}

public static void ex_140(int n,int m) {
	Serial[] mas = new Serial[m];
	for(int i = 0;i<m;i++) {
		System.out.printf("Серия#%d:",i);
		
		mas[i].calculate(n);
		for(int j=0;j<mas[i].length;j++) {
			System.out.printf("%3d",mas[i].vector.get(j));
		}
		System.out.printf("%nКоличество единиц в серии : %d  Количество двоек : %d ",mas[i].get_count_1(),mas[i].get_count_2());
	}
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show_task(ex_135);	ex_135(10);
		show_task(ex_140); ex_140(12,5);

		
	}

}
