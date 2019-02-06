/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.*;
public class Ex_41 {
public static Ex_1_40 exmpl = new Ex_1_40();
public static String ex_41 = "Найдите количество чисел, каждое из которых равно сумме квадратов своих соседей и при этом не является наибольшим в массиве.";
public static String ex_42 = "Проверьте, содержит ли данный массив из n чисел, все числа от 1 до n.";
public static String ex_48 = "Найти наиболее часто встречающийся элемент в массиве целых чисел.";
public static String ex_49 = "В одномерном массиве, состоящем из n вещественных элементов,"
		+ "\nвычислите номер минимального элемента массива и сумму элементов массива, "
		+ "\nрасположенных между первым и вторым отрицательными элементами.";
public static String ex_50 = "Напишите программу, которая вводит с клавиатуры непустой массив целых чисел, "
		+ "и выводит число локальных максимумов (элемент является локальным максимумом, "
		+ "если он не имеет соседей, больших, чем он сам).";
public static String ex_51 = "В данном массиве найдите два наименьших элемента.";
public static String ex_52 = "Определите, есть ли в массиве повторяющиеся элементы.";
public static String ex_56 ="В массиве заменить все числа, большие данного числа, на среднее арифметическое всех чисел массива.";
public static String ex_57 = "Дан массив. Заменить все числа, меньшие последнего элемента массива, на первый элемент";
public static String ex_58 = "Поменять местами наибольший и наименьший элементы массива.";
public static String ex_59 = "Найти наибольший четный элемент массива и поменять его местами с наименьшим нечетным элементом."
		+ "\n Если одного из таких элементов нет, то всем элементам массива присвоить значение, равное нулю.";
public static String ex_60 = "Заменить каждый элемент массива с четным номером на соседний слева элемент.";
public static String ex_61 = "Удалить в массиве первый и последний элементы";
public static String ex_62 = "Удалить в массиве все числа, которые повторяются более двух раз.";
public static String ex_63 = "Найти в массиве все серии подряд идущих одинаковых элементов и удалить из них все элементы кроме одного.";
public static String ex_64 = "Удалить в массиве все наибольшие элементы.";
public static String ex_65 = "Переставить элементы массива в обратном порядке.";
public static String ex_66 = "Дан массив a из n элементов. "
		+ "Сформировать новый массив b такого же размера так, "
		+ "что элемент bk равен сумме элементов первых элементов массиваa до номера k включительно.";
public static String ex_67 = "В данном массиве найти все нулевые элементы и заменить их вместе с соседними элементами на 3.";
public static String ex_68 = "Преобразовать массив таким образом, чтобы сначала располагались все элементы, "
		+ "\nмодуль которых не превышает единицу, а потом – все остальные.";
public static String ex_69 = "Даны два массива. Сформировать третий массив, состоящий из тех элементов, которые: "
		+ "\nа) присутствуют в обоих массивах; "
		+ "\nб) присутствуют только в одном из массивов.";
public static String ex_70 = "Дан массив. Осуществите циклический сдвиг массив на k единиц вправо, "
		+ "\nесли первый наименьший элемент массива расположен раньше последнего наибольшего элемента массива, и влево, если иначе.";
public static String ex_71 ="Даны два массива. Определите, существуют ли в первом массиве такие два элемента, "
		+ "\nчто их сумма равна сумме каких-либо трех элементов второго массива.";
public static String ex_72 = "Дана упорядоченная последовательность an чисел от 1 до N. "
		+ "Из копии данной последовательности bn удалили одно число, а оставшиеся перемешали. Найти удаленное число.";
public static String ex_74 = "Удалите в целочисленном массиве все положительные числа, которые являются палиндромами.";
public static String ex_75 = "Дан массив. Сформировать новый массив, в котором идут сначала отрицательные элементы, затем нули, затем положительные.";
public static String ex_76 = "";
public static String ex_77 = "Дан массив из n элементов. Переставьте его элементы случайным образом.";
public static String ex_78 = "В данном массиве каждый элемент равен 0, 1  или 2. Переставить элементы массива так, чтобы сначала располагались все нули, затем все единицы и, наконец, все двойки."
		+ " Дополнительный массив не использовать.";
public static String ex_79 ="Даны два упорядоченных по возрастанию массива. Образовать из этих двух массивов единый упорядоченный по возрастанию массив.";
public static String ex_80 = "Осуществить поиск данного числа в упорядоченном по возрастанию массиве методом бинарного поиска.";

public static void ex_41(int size) {
	int[] a = Ex_1_40.random_array(size);
	for(int i =0;i<a.length;i++) {
		Random rand =  new Random();
		a[i] = rand.nextInt(4);
	}
	Ex_1_40.show_array(a);
	System.out.println();
	
	int ctr=0;
	int max=exmpl.get_max(a);
	List<Integer> l = new ArrayList<Integer>();
	for(int i = 1;i<a.length-2;i++) {
		int sum= (a[i-1]*a[i-1])+(a[i+1]*a[i+1]);
		ctr+=(sum==a[i] && a[i]<max)?1:0;
		if(sum==a[i] && a[i]<max) {
			l.add(a[i]);
		}
	}

	
	System.out.println("\nОтвет: "+ ctr+"\nМаксимум : "+max +"\nЭти числа : ");
	
	for(int i = 0;i<l.size();i++) {
		System.out.print(l.get(i)+" ");
	}
	
}
public static void ex_42(int size,int n) {
	int[] a = Ex_1_40.random_array(size);
	Ex_1_40.show_array(a);
	System.out.println();
	
	boolean flag = false;

	for(int i =1;i<=n;i++) {
		for(int j =0;j<a.length;j++) {
			if(a[j]==i) {
				flag = true;
				System.out.println(i + " - yep");
				break;
			}
			if(j==a.length-1) {
				System.out.println("Nope!");
				i=n;
				break;
			}
		}
	}
}
public static void ex_48(int size) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random rand = new Random();
	int dbl_size=size*2;
	//int hlf_size=size/2;
	for(int i =0;i<size;i++) {
		int addresult = rand.nextInt(dbl_size)-size;
		a.add(addresult);
	}
	for(int i:a) {
		System.out.print(i+" ");
	}
	System.out.println();
	Set<Integer> uniq = new HashSet<Integer>(a);
	int max=0;
	for(int x:uniq) {
		System.out.print("Число "+x+" : "+Collections.frequency(a, x)+"|");
		max+=Collections.frequency(a, x)>max?1:0;
	}//
	System.out.println("Максимальное число повторений : "+max);
}
public static void ex_49(int size) {
	ArrayList<Double> a = new ArrayList<Double>();
	Random rand = new Random();
	double dbl_size = size*2;
	for(int i = 0;i<size;i++) {
		double elmnts=rand.nextDouble()-0.5;
		a.add(elmnts);
	}
	
	for(double d:a) {
		System.out.print(d+" ");
		
	}
	int min = a.indexOf(Collections.min(a));
	System.out.print("\nИндекс минимального : [ "+min +" ] = "+Collections.min(a) );
	
	int first_neg=-1,sec_neg=-1;
	double sum=0;
	for(double d:a) {
		if(first_neg==(-1) && d<0 ) {
			first_neg=a.indexOf(d);
		}
		if(first_neg!=-1 && a.indexOf(d)>first_neg &&d>0) {
			sum+=d;
		}
		if(a.indexOf(d)>first_neg && d<0) {
			sec_neg=a.indexOf(d);
			break;
		}
		if( ( (a.indexOf(d)==(a.size()-1) ) && (d>=0) ) ){
			sum=0;
		}
	}
	
	System.out.println("\n1st = "+first_neg+" 2nd = "+sec_neg + "\nСумма : " +sum);
}
public static void ex_50(int size) {
	ArrayList<Integer> a  = new ArrayList<Integer>();
	Random rand = new Random();
	int dbl=size*2;
	for(int i =0;i<size;i++) {
		a.add(rand.nextInt(dbl)-size);
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
	ArrayList<Integer> local_min = new ArrayList<Integer>();
	ArrayList<Integer> local_max = new ArrayList<Integer>();
	
	for(int i = 1;i<=a.size()-2;i++) {
		if(a.get(i)<a.get(i-1)&&a.get(i)<a.get(i+1)) {
		local_min.add(a.get(i));
		}
		if(a.get(i)>a.get(i-1) && a.get(i)>a.get(i+1)) {
			local_max.add(a.get(i));
		}
	}
	System.out.println("\nКоличество локальных минимумов : "+local_min.size()+"\t"+local_min);

	System.out.println("\nКоличество локальных максимумов : "+local_max.size()+"\t"+local_max+"\n");

}
public static ArrayList<Integer> create_array(int size){
ArrayList<Integer> a  = new ArrayList<Integer>();
Random rand = new Random();
int dbl=size*2;
for(int i =0;i<size;i++) {
	a.add(rand.nextInt(dbl)-size);
	System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
}
return a;
}
public static void ex_51(int size) {
	ArrayList<Integer> a  = create_array(size);
	int first_min = Collections.min(a);
	a.remove(a.indexOf(first_min));
	int second_min = Collections.min(a);
	System.out.println("\nПервый минимальный = "+first_min+"\nВторой минимальный = "+second_min);
}
public static void ex_52(int size) {
	ArrayList<Integer> a = create_array(size);
	
	Set<Integer> uniq =new HashSet<Integer>(create_array(size));
	System.out.println(uniq.size()==a.size()?"\nПовторяющихся элементов нет.\n":"\nЕсть повторяющиеся элементы.\n");
	if(uniq.size()!=a.size()) {
		for(int x:uniq) {
			if(Collections.frequency(a, x)>=1) {
				System.out.print("Число "+x+" : Повторов : "+(Collections.frequency(a, x)+1)+"|");//количество повторов+1 = сколько раз встречается
			}
		}
	}
}
public static void ex_56(int size,int num) {
	ArrayList<Integer> a = create_array(size);
	int avg_sum = 0;
	for(int i:a) {
		avg_sum+=i;
	}
	avg_sum/=a.size();
	
	for(int i:a) {
		if(i>num) {
			a.set(a.indexOf(i), avg_sum);
		}
	}
	System.out.println("\nСреднее арифметическое всех элементов : "+avg_sum+"\nРезультирующий массив : c заменой всех элементов > "+num);
	for(int i =0;i<size;i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
}
public static void ex_57(int size) {
	ArrayList<Integer> a = create_array(size);
	for(int i:a) {
		if(i<a.get(a.size()-1)) {
			a.set(a.indexOf(i), a.get(0));
		}
	}
	System.out.println("\nПоследний элемент : "+a.get(a.size()-1)+" Первый элемент : "+a.get(0)+
			"\nРезультирующий массив :");
	for(int i =0;i<size;i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
}
public static void ex_58(int size){
	ArrayList<Integer> a = create_array(size);
	int min = Collections.min(a);
	int max = Collections.max(a);
	Collections.swap(a,a.indexOf(min), a.indexOf(max));
	//Collections.swap(a, Collections.max(a), Collections.min(a));
	System.out.println("\nmin = "+min+" max = "+max+"\nМеняем местами. Получилось : ");
	for(int i =0;i<size;i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
	System.out.println((char)27 + "[31mThis text would show up red" + (char)27 + "[0m");
}
public static void show(ArrayList<Integer> a) {
	System.out.println();
	for(int i =0;i<a.size();i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
}
public static ArrayList<Integer> take_even(ArrayList<Integer> a){
	ArrayList<Integer> retVal = new ArrayList<Integer>();
	for(int i:a) {
		if(i%2==0) {
			retVal.add(i);
		}
	}
	return retVal;
}
public static ArrayList<Integer> take_not_even(ArrayList<Integer> a){
	ArrayList<Integer> retVal = new ArrayList<Integer>();
	for(int i:a) {
		if(i%2!=0) {
			retVal.add(i);
		}
	}
	return retVal;
}
public static void ex_59(int size) {
	ArrayList<Integer> a = create_array(size);
//	Collections.fill(a, 1);
	System.out.println();
	show(take_even(a));
	System.out.println("\nSize = "+take_even(a).size());
	show(take_not_even(a));
	System.out.println("\nSize = "+take_not_even(a).size());
	
	if(!take_even(a).isEmpty() && !take_not_even(a).isEmpty()) {
		Collections.swap(a,
				a.indexOf( Collections.min(take_even(a) ) ), 
				a.indexOf( Collections.max(take_not_even(a) ) )
				);
		System.out.printf("%nНаименьший четный = %d\tНаибольший нечетный = %d%nМеняем местами.%n",
				 Collections.min(take_even(a)),
				 Collections.max(take_not_even(a) )
				 );
	}
	else {
		if(take_even(a).isEmpty()) {
			System.out.println("Наименьшего четного нет.");
		}
		if(take_not_even(a).isEmpty()) {
			System.out.println("Наибольшего нечетного нет.");
		}
		System.out.println("Заполняем все нулями.");
		Collections.fill(a, 0);
	}
	
	System.out.println("");
	show(a);
}
public static void ex_60(int size) {
	ArrayList<Integer> a = create_array(size);
	System.out.println();
	for(int i=2;i<a.size()-1;i+=2) {
		
		a.set(i, a.get(i-1));
		show(a);
		System.out.println();
	}
	show(a);
}
public static void ex_61(int size) {
	ArrayList<Integer> a = create_array(size);
	System.out.println("\n"+a.size());
	a.remove(0);
	a.remove(a.size()-1);
	a.trimToSize();
	System.out.print(a.size());
	show(a);
}
public static void ex_62(int size) {
	ArrayList<Integer> a = create_array(size);
	List<Integer> deleted = new ArrayList<Integer>();
	System.out.println("\nSize before = " +a.size());
	for(int i =0;i<a.size();i++) {
		if( Collections.frequency(a, a.get(i) )>=2) {
			System.out.println("Удаляем : " + a.get(i) +" : "+Collections.frequency(a, a.get(i))+" повторений");
			deleted.add(a.get(i));
			for(int j=0;j<a.size();j++) {
				if(a.get(i)==a.get(j)) {
					a.remove(j);
					a.trimToSize();
				}
			}
		
		}
	}
	//Collections.reverse(deleted);
	System.out.println("Из массива удалены : "+deleted );
	
	a.trimToSize();
	show(a);
	System.out.print("\nSize after = " +a.size());
}
public static void ex_63(int size) {
	ArrayList<Integer> a = create_array(size);
	for(int i =0;i<a.size()/2;i++) {
		a.set(i,1);
	}
	show(a);
	for(int i =1;i<a.size();i++) {
		if(a.get(i)==a.get(i-1)) {
			a.remove(i);
			a.trimToSize();
			i--;
		}
	}
	show(a);
}
public static void ex_64(int size) {
	ArrayList<Integer> a = create_array(size);

	for(int i = 0;i<a.size()/4;i++) {
		a.set(i, 50);
	}
	show(a);
	
	int max = Collections.max(a);
	System.out.println("\nmax = "+max);
	for(int i = 0;i<a.size();i++) {
		if(a.get(i)==max) {
			a.remove(i--);
		}
	}
	
	a.trimToSize();
	show(a);
}
public static void ex_65(int size) {
	ArrayList<Integer> a = create_array(size);
	Collections.reverse(a);
	System.out.print("\n\nReverse : ");
	show(a);
}
public static int  elements_sum(ArrayList<Integer> arr,int k){
	int sum=0;
	if(k<arr.size()) {
		for(int i =0;i<=k;i++) {
			sum+=arr.get(i);
		}
		return sum;
	}
	
	else {
		return 0;
		}
	
	
}
public static void ex_66(int size) {
	ArrayList<Integer> a = create_array(size);
	ArrayList<Integer> b = new ArrayList<Integer>();
	for(int i = 0;i<a.size();i++) {
		int sum = elements_sum(a,i);
	//	System.out.print(i%10==0?"\n":"  " +sum+"|");
		b.add(sum);
	}
	show(b);
 }
public static void ex_67(int size,int oldval,int newval) {
	ArrayList<Integer> a = create_array(size);
	if(a.contains(oldval)) {
		System.out.println("\nМеняю значения "+oldval + " на " + newval);
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==oldval) {
				if(a.size()>=1) {
					if(i==0) {
						a.set(i, newval);
						a.set(i+1, newval);
					}
					if(i==a.size()-1) {
						a.set(i, newval);
						a.set(i-1, newval);
					}
					if(i>0&&i<a.size()-1) {
						a.set(i, newval);
						a.set(i-1, newval);
						a.set(i+1, newval);
					}
				}
				i++;
			}
		}
	
	}
	else {
		System.out.println("\nЗначений "+oldval+" не найдено.");
	}
	show(a);
}
public static void ex_68(int size,int val) {
	ArrayList<Integer> a = create_array(size);
	
	int temp=0;
	int index= 0;
	for(int i =0;i<a.size();i++) {
		if(Math.abs(a.get(i))<=val) {
			temp=a.get(i);
			a.set(index++, a.get(i));
			a.set(i,temp);
		}
	}
	
//	Collection
	show(a);
}
public static void ex_69(int size) {
	ArrayList<Integer> a = create_array(size);
	ArrayList<Integer> b = create_array(size);
	
	Set<Integer> distinction = new HashSet<Integer>();

	for(int i:a) {
		if(b.contains(i)) {
			distinction.add(i);
		}
	}
	
	System.out.println("\nA = "+a);
	System.out.println("B = "+b);
	System.out.println("Dist = "+distinction);
	a.removeAll(distinction);
	b.removeAll(distinction);
	System.out.println();

	System.out.println("A ="+a);
	System.out.println("B ="+b);

	Set<Integer> unique = new HashSet<Integer>(a);
	unique.addAll(b);
	System.out.println("Unique = "+unique);
	
	
}
public static void ex_71(int size) {
	ArrayList<Integer> a = create_array(size);
	ArrayList<Integer> b = create_array(size);

 class rowA{
	public 	int sum=0;
	public 	int a1=0;
	public 	int a2=0;
	}
 
 class rowB{
	public 	int sum=0;
	public 	int b1=0;
	public 	int b2=0;
	public 	int b3=0;
	}
 
	ArrayList<rowA> tableA=new ArrayList<rowA>();
	for(int i=0;i<a.size();i++) {
		for(int j=i+1;j<a.size();j++) {
			rowA tmp = new rowA();
			tmp.a1=a.get(i);
			tmp.a2=a.get(j);
			tmp.sum=tmp.a1+tmp.a2;
			tableA.add(tmp);
		}
	}
/*	System.out.println("\nTable A: ");
	for(rowA it:tableA) {
		System.out.print(it.a1+" + "+it.a2+" = "+it.sum+"\n");
	}*/
	ArrayList<rowB> tableB= new ArrayList<rowB>();
	for(int i=0;i<b.size();i++) {
		for(int j =i+1;j<b.size();j++) {
			for(int k = j+1;k<b.size();k++) {
				rowB tmp = new rowB();
				tmp.b1=b.get(i);
				tmp.b2=b.get(j);
				tmp.b3=b.get(k);
				tmp.sum=tmp.b1+tmp.b2+tmp.b3;
				tableB.add(tmp);
			}
		}
	}
/*	System.out.println("\nTable B: ");
	for(rowB it:tableB) {
		System.out.print(it.b1+" + "+it.b2+" + " + it.b3+" = "+it.sum+"\n");
	}*/
	
	for(rowA i:tableA) {
		for(rowB j:tableB) {
			if(i.sum==j.sum) {
				System.out.printf("\nНайдены такие элементы : %d+%d=%d+%d+%d=%d",i.a1,i.a2,j.b1,j.b2,j.b3,j.sum);
			}
			else {
				System.out.print("\nТаких элементов не найдено.");
			}
		}
	}
}
public static void ex_72(int size) {
	ArrayList<Integer> a = create_array(size);
	ArrayList<Integer> b = new ArrayList<Integer>(a);
	System.out.println("\nУдаляем случайное число...");
	

	Random rand = new Random();
	int del = rand.nextInt(a.size()-1);
	b.remove( del);
	show(b);
	for(int i:a) {
		if(!(b.contains(i))) {
			System.out.println("\nАга!Это было число : "+i);
		}
	}

}
public static boolean isPalindrom(int num) {
	String str = String.valueOf(num);
	return str.equals(new StringBuilder().append(str).reverse().toString());
}
public static void ex_74(int size) {
	ArrayList<Integer> a= create_array(size);
	ArrayList<Integer> palindroms = new ArrayList<Integer>();
	for(int i=0;i<a.size();i++) {
		if(a.get(i)>10) {
			if( isPalindrom(a.get(i)) ) {
				palindroms.add(a.get(i));
				a.remove(i);
			}
		}
	}
	a.trimToSize();
	System.out.println("\nУдаляем все палиндромы."+palindroms.toString()+"\nРазмер массива до :"+size+", после : "+a.size());
	for(int i =0;i<a.size();i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
}
public static void ex_75(int size) {
	ArrayList<Integer> a = create_array(size);
	ArrayList<Integer> res = new ArrayList<Integer>();
	for(int i = 0; i < a.size();i++) {
		if(a.get(i)<0) {
			res.add(a.get(i));
		//	a.remove(i);
		}
	}
	a.trimToSize();
	if(a.contains(0)) {
		for(int i = 0; i < a.size();i++) {
			if(a.get(i)==0) {
				res.add(a.get(i));
			//	a.remove(i);
			//	a.trimToSize();
			}
		}
	}
	
	for(int i = 0; i < a.size();i++) {
		if(a.get(i)>0) {
			res.add(a.get(i));
		//	a.remove(i);
		}
	}
	//a.trimToSize();
	System.out.println("\nФормируем новый массив и упорядочиваем. Размер нового массива : "+res.size()+" ,а старого "+a.size());
	
	for(int i =0;i<res.size();i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",res.get(i));
	}
 }

public static void ex_77(int size) {
	ArrayList<Integer> a = create_array(size);
	Collections.shuffle(a);
System.out.println();
	for(int i =0;i<a.size();i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
	
}
public static void ex_78(int size) {
	ArrayList<Integer> a  = new ArrayList<Integer>();
	Random rand = new Random();
	for(int i =0;i<size;i++) {
		a.add(rand.nextInt(3));
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
	a.sort(Comparator.naturalOrder());
	System.out.println("\nСортируем массив...");
	for(int i =0;i<size;i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
}
public static void ex_79(int size1,int size2) {
	ArrayList<Integer> a1 = create_array(size1);
	System.out.println();
	ArrayList<Integer> a2 = create_array(size2);
	a1.sort(Comparator.naturalOrder());
	a2.sort(Comparator.naturalOrder());
	ArrayList<Integer> res = new ArrayList<Integer>(a1);
	res.addAll(a2);
	res.sort(Comparator.naturalOrder());
	System.out.println();
	for(int i =0;i<res.size();i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",res.get(i));
	}
}
public static int binary_search(ArrayList<Integer> a,int key) {
	int left=0,right=a.size(),mid;
	while(left<=right) {
		mid=left+(right-left)/2;
		if( key<a.get(mid) ) {
			right=mid - 1;
		}
		else {
			if(key>a.get(mid)) {
				left=mid+1;
			}
			else {
				return mid;
			}
		}
	}
	return -1;
}
public static void ex_80(int size,int key) {
	ArrayList<Integer> a = create_array(size);
	System.out.println("\nСортируем массив.\n");
	a.sort(Comparator.naturalOrder());
	for(int i =0;i<a.size();i++) {
		System.out.printf("%s%4d",i%10==0?"\n":" ",a.get(i));
	}
	System.out.println();
	key = a.get(key);
	int result = binary_search(a,key);
	String response_1 = String.format("Элемент ( %d ) не найден.", key);
	String response_2 = String.format("Элемент ( %d ) найден.Номер элемента = %d", key,result);
	
	System.out.println(result==-1?response_1:response_2);
	
}


public static void main(String[] args) {
	Random rand = new Random();
	//exmpl.show_task(ex_42);ex_42(41,25);
//	exmpl.show_task(ex_72); ex_72(10);
	//exmpl.show_task(ex_78);ex_78(25);
	exmpl.show_task(ex_80);ex_80(20,rand.nextInt(20));
}

}
