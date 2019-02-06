/**
 * Выведите  на экран строки (в последней строке n звездочек):
 */

/**
 * @author mindybaev
 *
 */
import java.io.IOException;
import java.util.Scanner;
public class Ex_108_114 {

	/**
	 * @param args
	 */
	public static int[] cache= {1,1};
	
	static String err_text_n = "Введенные данные не корректны. Перезапустите программу.";
	static String err_text_1 = "Введенные данные не корректны. Попробуйте еще.";
	static String ex_108 = "Выведите  на экран строки (в последней строке n звездочек):";
	static String ex_109 = "Выведите на экран строки вида:\r\n" + 
			"*******\r\n" + 
			"****\r\n" + 
			"*******\r\n" + 
			"****\r\n" + 
			"*******\r\n" + 
			"****\r\n" + 
			"(всего n строк, звездочек или 7, или 4 по очереди)";
	static String ex_110 ="Вывести на экран:"+
		"\nAAABBBAAABBBAAABBB"+
		"\nBBBAAABBBAAABBBAAA"+
		"\nAAABBBAAABBBAAABBB"+
		"\n(таких строк n, в каждой строке m троек AAA)\n";
	static String ex_111 = "Вывести на экран:\r\n" + 
			"AAAAAAAAAAAAAAAA\r\n" + 
			"ABBBBBBBBBBBBBBA\r\n" + 
			"ABBBBBBBBBBBBBBA\r\n" + 
			"ABBBBBBBBBBBBBBA\r\n" + 
			"AAAAAAAAAAAAAAAA\r\n" + 
			"(количество строк вводит пользователь, ширина прямоугольника в два раза больше высоты)";
	static String ex_112 = "Выведите на экран квадрат из нулей и единиц, "
			+ "причем нули находятся только на диагонали квадрата.\n Всего в квадрате сто цифр.\n";
	static String ex_113 = "Вывести на экран 20 строк. В строках с четными номерами вывести по 10 чисел, равных номеру строки.\n"
			+ " В строках с нечетными номерами вывести десять единиц.";
	static String ex_114 = "Вывести 30 строк. Нечетные строки содержат натуральные числа "
							+ "от 1 до номера текущей строки включительно с шагом 1, \n"
							+ "четные строки состоят  из пяти единиц.";
	static String ex_115 = "Выведите на экран таблицу умножения для чисел от 1 до 10.";
	static String ex_116 = "Найдите количество целых чисел от a до b включительно, которые делятся на 12.";
	static String ex_117 = "Пользователь вводит ненулевые числа до тех пор пока не введет ноль. Найдите сумму этих чисел.";
	static String ex_118 = "Пользователь вводит ненулевые целые числа до тех пор, пока не введет ноль. "
			+ "/nНайдите количество четных чисел, которые он ввел.";
	static String ex_119 = "Найдите четырехзначные числа, сумма цифр которых равна 15.";
	static String ex_120 = "Найдите наибольшую цифру в данном натуральном числе.";
	static String ex_121 = "Дано натуральное число. Найдите количество четных цифр.";
	static String ex_122 = "В данном натуральном числе найдите количество цифр, которые больше 3, но меньше 8.";
	static String ex_123 = "Для данного натурального числа найдите число, цифры которого записаны в обратном порядке.";
	static String ex_124 = "Найдите n-ое число Фибоначчи.";
	
	
	
	
	
	
	public static void print_108(int n ) {

		for(int i = 0;i<Math.abs(n);i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");	
			}
			System.out.print("\n");
		}
	}
	public static void print_109(int n) {
		for(int i = 0;i<n;i++){
			for(int j=0;j<(i%2==0?7:4);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void print_110(String s1,String s2,int[] arr) {
		for(int i =0;i<arr[0];i++) {
			for(int j=0;j<arr[1];j++) {
				System.out.print((i%2==0?(s1+s2):(s2+s1)));
			}
			System.out.println();
		}
	}
	public static void print_111(String s1,String s2,int n){
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<2*n;j++) {
				System.out.print( 
						( ((i==0)||(i==n-1)||(j==0)||(j==2*n-1)) 
								? s1
										: s2  )
						);
			}
			System.out.println();
		}
	}
	public static void print_112(String s1,String s2,int[] arr) {
		for(int i =0;i<arr[0];i++) {
			for(int j =0;j<arr[1];j++) {
				System.out.print(
						(i==j?s2:s1));
			}
			System.out.println();
		}
		
	}
	public static void print_112(String s1,String s2,int n,int m) {
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				System.out.print(
						(i==j?s2:s1));
			}
			System.out.println();
		}
		
	}	
	public static void print_113(String s1,int n,int m) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print((i%2==0)?i:s1);
			}
			System.out.println();
		}
	}
	public static void print_114(int s1,int n) {
		int m=0;
		for(int i =1;i<=n;i++) {
			m=i;
			for(int j=1;j<=m;j++) {
				m=i%2==0?5:i;
				System.out.printf("%3d",(i%2==0)?s1:j);
			}
			System.out.println();
		}
	}
	public static void print_115(int n) {
		for (int i = 1;i <= n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}
	}
	public static int ex_116(int a,int b) {
		if(a>b) {
			a+=(b-(b=a));
		}
		int cntr=0;
		for(int i = a;i<=b;i++)
		{
			if(i%12==0) {
				System.out.printf("%5d",i);
				cntr++;
				System.out.print(cntr%10==0?"\n":"");
			}
		}
		return cntr;
	}
	public static int ex_117() {
		Scanner in = new Scanner(System.in);
		int n = 1,sum=0,cntr=1;
		while(n!=0) {
			System.out.println("Число#"+cntr);
			if(in.hasNextInt()) {
				n = in.nextInt();
				sum+=n;
				cntr++;
			}	
			else {
				System.out.println(err_text_1);
				in.reset();
			}
			
		}
		in.close();
		System.out.println("Результат : Сумма чисел = "+sum);
		return sum;
	}
	public static int ex_118() {
		Scanner in = new Scanner(System.in);
		int n = 1,sum=0,cntr=1;
		while(n!=0) {
			System.out.println("Число#"+cntr);
			if(in.hasNextInt()) {
				n = in.nextInt();
				sum+=n%2==0?1:0;
				cntr++;
			}	
			else {
				System.out.println(err_text_1);
				in.reset();
			}
			
		}
		in.close();
		System.out.println("Результат : Четных чисел = "+sum);
		return sum;
	}
	public static int ex_119_1(int n) {
		int len = String.valueOf(n).length();
		double c=0,sum=0;
		for(int i = 1;i<=len;i++) {
			c=(int)(n % (int)Math.pow(10.0,(double)i)-sum)/Math.pow(10.0,(double)(i-1));
			sum+=c;
		}
		return (int)(sum==15.0?n:0.0);
	}
	public static void ex_119_2(int m) {
		for(int i = 0;i<m;i++) {
			int num = ex_119_1(i);
			if(num!=0) {
			System.out.println("Число : "+i+"имеет сумму цифр 15.");
			}
		}
	}
	public static void ex_120(int n) {
		int len = String.valueOf(n).length();
		double c=0.0,sum=0.0;
		int max=0;
		for(int i =1;i<=len;i++) {
			c=(int)((n % (int)Math.pow(10.0,(double)i)-sum)/Math.pow(10.0,(double)(i-1)));
			sum+=c;
			max=(int)Math.max(c, max);
		}
		System.out.println("Результат : наибольшая цифра в числе "+n+" : "+max);
	}
	public static void ex_121(int n) {
		int len = String.valueOf(n).length();
		double c=0.0,sum=0.0;
		int cntr=0;
		for(int i =1;i<=len;i++) {
			c=(int)((n % (int)Math.pow(10.0,(double)i)-sum)/Math.pow(10.0,(double)(i-1)));
			sum+=c;
			cntr+=c%2==0?1:0;;
		}
		String[] s= {" чётная цифра"," чётные цифры"," чётных цифр"};
		System.out.println("Результат : в числе "+n+" "+cntr+(
				cntr%10==1
				?s[0]
						:(cntr%10>1&&cntr%10<5)?s[1]:s[2]));
	}
	public static void ex_122(int n) {
		int len = String.valueOf(n).length();
		double c=0.0,sum=0.0;
		int cntr=0;
		for(int i =1;i<=len;i++) {
			c=(int)((n % (int)Math.pow(10.0,(double)i)-sum)/Math.pow(10.0,(double)(i-1)));
			sum+=c;
			cntr+=c<8&&c>3?1:0;
		}
		String[] s= {" цифра"," цифры"," цифр"};
		System.out.println("Результат : в числе "+n+" "+cntr+
				(cntr%10==1
				?s[0]
						:(cntr%10>1&&cntr%10<5)
						?s[1]
								:s[2])
				+ " больше 3 но меньше 8.");
	}
	public static void ex_123(int n) {
		int len = String.valueOf(n).length();
		double c=0.0,sum=0.0,b=0.0;
		for(int i =1;i<=len;i++) {
			c=(int)((n % (int)Math.pow(10.0,(double)i)-sum)/Math.pow(10.0,(double)(i-1)));
			sum+=c;
			b+=c*Math.pow(10.0,len-i);
		}
		
		System.out.println("Результат :  "+(int)b);
	}
	public static void ex_124(int n) {
		cache[0]=1;
		cache[1]=1;
		for(int i = 2;i<=n;i++) {
			cache[i%2]=cache[0]+cache[1];
		}
		System.out.println("Число Фибоначчи : "+cache[n%2]);
	}
	public static void ex_124_1(int n) {
		cache[0]=1;
		cache[1]=1;
		for(int i = 2;i<=n;i++) {
			cache[i]=cache[i-1]+cache[i-2];
		}
		System.out.println("Число Фибоначчи : "+cache[n]);
	}
	
	
	
	
	
	
	public static int[] read_n_m(String exercise_data) {
		Scanner in = new Scanner(System.in);
		System.out.print(exercise_data);
		int[] arr= {0,0};
		System.out.print("arr[0] =n = ");
		if(in.hasNextInt()) {
			arr[0] =in.nextInt();
			System.out.print("\narr[0] =m =  ");
			if(in.hasNextInt()) {
				arr[1]=in.nextInt();
				in.close();
				return arr; 
			}
			else {
				System.out.println(err_text_n);
				in.close();
				return arr;
			}
				}
		else {
			System.out.println(err_text_n);
			in.close();
			return arr; 
		}
		
	}
	public static int read_n(String exercise_data) {
		
		Scanner in = new Scanner(System.in);
		System.out.print(exercise_data);
		
		if(in.hasNextInt()) {
			int n =in.nextInt();
			in.close();
			return n; 
		}
		else {
			System.out.println(err_text_n);
			in.close();
			return 0; 
		}
		
	}
	public static void show_task(String s) {
		System.out.println(s);
	}
	public static int[] read_two(String s1,String s2) {
		Scanner in = new Scanner(System.in);
		int[] arr= {0,0};
		System.out.print(s1+" = ");
		if(in.hasNextInt()) {
			arr[0] =in.nextInt();
			System.out.print("\n"+s2+"=");
			if(in.hasNextInt()) {
				arr[1]=in.nextInt();
				in.close();
				return arr; 
			}
			else {
				System.out.println(err_text_n);
				in.close();
				return arr;
			}
				}
		else {
			System.out.println(err_text_n);
			in.close();
			return arr; 
		}
		
	}
	
	public static void main(String[] args) {
		
		//print_108(read_n(ex_108));
		//print_109(read_n(ex_109+"\n"+"n = "));
		//print_110("AAA","BBB",read_n_m(ex_110));
		//print_111("A","B",read_n(ex_111+"\n"+"n = "));
		//show_task(ex_112);	print_112("1","0",10,10);
		//show_task(ex_113);	print_113("1",20,10);
		//show_task(ex_114);	print_114(1,30);
		//show_task(ex_115);	print_115(10);
		//show_task(ex_116); 	int[] arr=read_two("a","b");System.out.printf("\nРезультат : %d",ex_116(arr[0],arr[1]));
		//show_task(ex_117);	int a=ex_117();
		//show_task(ex_118);	int a =ex_118();
		//show_task(ex_119);		ex_119_2(10000);
		//show_task(ex_120);	ex_120(1234567890);
		//show_task(ex_121);	ex_121(12422222);
		//show_task(ex_122);	ex_122(124292806);
		//show_task(ex_123); ex_123(1234567891);
		show_task(ex_124);	ex_124(10);
	}
}


