/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.*;
public class Ex_1_40 {
public static String ex_1 = "Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.";
public static String ex_2 = "Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.";
public static String ex_3 = "Заполнить массив последовательными нечетными числами, начиная с единицы.";
public static String ex_5 = "Сформировать возрастающий массив из четных чисел.";
public static String ex_6 = "Сформировать убывающий массив из чисел, которые делятся на 3.";
public static String ex_7 = "Создать массив из n первых чисел Фибоначчи";
public static String ex_8 = "Заполнить массив заданной длины различными простыми числами. "
		+ "\nНатуральное число, большее единицы, называется простым, если оно делится только на себя и на единицу.";
public static String ex_9 = "Создать массив, каждый элемент которого равен квадрату своего номера";
public static String ex_10 = "Создать массив, на четных местах в котором стоят единицы,"
		+ " а на нечетных местах - числа, равные остатку от деления своего номера на 5.";
public static String ex_11 = "Создать массив, состоящий из троек подряд идущих одинаковых элементов.";
public static String ex_12 = "Cоздать массив, который одинаково читается как слева направо, так и справа налево.";
public static String ex_13 = "Сформировать массив из случайных чисел, в которых ровно две единицы, стоящие на случайных позициях.";
public static String ex_14 = "Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.";
public static String ex_15 = "Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек.";
public static String ex_16 = "Создайте массив, в котором количество отрицательных чисел равно количеству положительных "
		+ "\nи положительные числа расположены на случайных местах в массиве.";
public static String ex_17 = "Заполните массив случайным образом нулями, единицами и двойками так, "
		+ "\nчтобы первая двойка в массиве встречалась раньше первой единицы, "
		+ "\nколичество единиц было в точности равно суммарному количеству нулей и двоек.";
public static String ex_19 = "Определить, содержит ли массив данное число x";
public static String ex_20 = "Найти количество четных чисел в массиве.";
public static String ex_21 = "Найти количество чисел в массиве, которые делятся на 3, но не делятся на 7.";
public static String ex_22 = "Определите, каких чисел в массиве больше: "
		+ "\nкоторые делятся на первый элемент массива или которые делятся на последний элемент массива.";
public static String ex_23 = "Найдите сумму и произведение элементов массива.";
public static String ex_24 = "Найдите сумму четных чисел массива.";
public static String ex_25 = "Найдите сумму нечетных чисел массива, которые не превосходят 11.";
public static String ex_26 = "Найдите сумму чисел массива, которые расположены до первого четного числа массива."
		+ "\n Если четных чисел в массиве нет, то найти сумму всех чисел за исключением крайних.";
public static String ex_27 = "Найдите сумму чисел массива, которые стоят на четных местах.";
public static String ex_28 = "Найдите сумму чисел массива, которые стоят на нечетных местах и при этом превосходят сумму крайних элементов массива.";
public static String ex_29 = "Дан массив x из n элементов. Найдите x1−x2+x3−…−xn−1+xn.";
public static String ex_30 = "Дан массив x из n элементов. Найдите x1xn+x2xn−1+…+xnx1.";
public static String ex_31 = "Дан массив x из n элементов. Найдите xn(xn+xn−1)(xn+xn−1+xn−2)…(xn+…+x1).";
public static String ex_32 = "Найти наибольший элемент массива.";
public static String ex_33 = "Найдите сумму наибольшего и наименьшего элементов массива.";
public static String ex_34 = "Найдите количество элементов массива, которые отличны от наибольшего элемента не более чем на 10%.";
public static String ex_35 ="Найдите наименьший четный элемент массива.";
public static String ex_36 = "Среди элементов с нечетными номерами найдите наибольший элемент массива, который делится на 3.";
public static String ex_37 ="Дан массив и число p. Найдите два различных числа в массиве, сумма которых наиболее близка к p";
public static String ex_38 = "Дан массив. Найдите два соседних элемента, сумма которых минимальна.";
public static String ex_39 = "Дан массив. Найдите три последовательных элемента в массиве, сумма которых максимальна.";
public static String ex_40 = "В данном массиве найдите количество чисел, соседи у которых отличаются более чем в 2 раза.";


public void show_task(String task) {
	System.out.println(task);
}
public static void ex_1(int n) {
	int[] a = new int [n];
	a[0]=1;
	a[n-1]=1;
	for(int i = 1 ;i <n-1;i++ ) {
		a[i] = 0;

	}
	for(int i = 0 ;i <n;i++ ) {

		System.out.print(a[i]);
	}
}
public static void ex_2(int n) {
	int[] a = new int[n];
	for(int i = 0;i<n;i++) {
		a[i]=i%2;
		System.out.print(a[i]);
	}
}
public static void ex_3(int n) {
	int[] a = new int [n];
	int j = 0;
	for(int i=1;i<2*n;i+=2) {
		a[j++]=i;
	}
	for(int i=0;i<n;i++) {
		System.out.printf("%3d",a[i]);
	}
}
public static void ex_5(int n) {
	int[] a = new int [n];
	int j = 0;
	for(int i=2;i<2*n;i+=2) {
		a[j++]=i;
	}
	for(int i=0;i<n;i++) {
		System.out.printf("%3d",a[i]);
	}
}
public static void ex_6(int n) {
	int j = n-1;
	int[] a = new int [n];
	for(int i =0;i<n*3;i=i+3) {
		if(j>=0) {
			System.out.printf("%3d",a[j--]=i);
			}
		else {
			break;
		}
	}
	System.out.println();
	for(int i = 0;i<n;i++) {
		System.out.printf("%3d",a[i]);
	}
}
public static void ex_7(int n) {
	int[] a = new int[n];
	a[0]=1;
	a[1]=1;
	for(int i=2;i<n;i++) {
		a[i] =a[i-2]+a[i-1];
	}
	
	for(int i = 0;i<n;i++) {
		System.out.printf("a[%d] ",i);
	}
	System.out.println();
	for(int i = 0;i<n;i++) {
		System.out.printf("%5d ",a[i]);
	}
}
public static void ex_8(int n) {
	int[] a = new int [n];
	a[0]=3;
	a[1]=5;
	a[2]=7;
	int j = 3;
	
	for(int i = 2;i<n*10;i++) {
		if(j<n) {
			if( (i%2!=0) && (i%3!=0)&&(i%5!=0)&&(i%7!=0) ) {
				a[j++]=i;
			}
		}
		else break;
	}
	for(int i = 0; i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
public static void ex_9(int n) {
	int[] a = new int[n];
	for(int i = 0;i<n;i++) {
		a[i]=i*i;
	}
	
	for(int i = 0 ;i<n;i++) {
		System.out.printf("%4d",a[i]);
	}
}
public static void ex_10(int n) {
	int[] a = new int [n];
	for(int i = 0;i<n;i++) {
		a[i]=(i%2!=0?i%5:1);
	}
	
	for(int i = 0;i<n;i++) {
		System.out.printf("%3d", a[i]);
	}
}
public static void ex_11(int size,int rep) {
	int [] a = new int[size];
	int index =0;
	int  i =0;
	while( i<(size/rep) ) {
		int j = 0;
		while(j<rep) {
			a[index]=i;
			j++;
			System.out.printf("%3d",a[index++]);
		}
		i++;
	}
}
public static void ex_12(int size) {
	int [] a = new int [size];
	int j =size-1;
	for(int i = 0;i<size/2;i++) {
		a[i]=i;
		a[j--]=i;
		
	}
	for(int i = 0;i<size;i++) {
		System.out.printf("%3d",a[i]);
	}
}
public static void ex_13(int size) {
	int [] a = new int[size];
	Random rand = new Random();
	for(int i = 0;i<a.length;i++) {
		a[i]=rand.nextInt(a.length);
		while(a[i]==1) {
			a[i]=rand.nextInt(a.length);
		}
	}
	int index = rand.nextInt(a.length);
	a[index]=1;
	while(a[index]==1) {
		index=rand.nextInt(a.length);
	}
	a[index]=1;
	for(int i = 0;i<a.length;i++) {
		System.out.printf("%3d", a[i]);
	}
	
}
public static void ex_14(int size) {
	int[] a = new int[size];
	Random rand = new Random();
	for(int i = 0;i<size;i++) {
		a[i]=0;
	}
	int count = 0;
	while(count<(int)(size-(size/3))) {
		int index=rand.nextInt(a.length);
		if(a[index]==0) {
			a[index]=1;
			count++;
		}
	}
	int c0=0,c1=0;
	for(int i = 0;i<a.length;i++) {
		System.out.printf("%3d",a[i]);
		if(a[i]==0) {
			c0++;
		}
		else {
			c1++;
		}
	}
	System.out.printf("%nНулей : %d , Единиц : %d", c0,c1);
}
public static void ex_15(int size) {
	int[] a = new int[size];
	int c2=0,c3=0,c1=0;
	int index =0;
	Random rand = new Random();
	
	for(int i = 0;i<a.length;i++) {
		a[i]=rand.nextInt(10);
		
		c1+=a[i]==1?1:0;
		if(c1>5) {
			while(a[i]==1) {
				a[i]=rand.nextInt(a.length);
			}
		}
		
		c2+=a[i]==2?1:0;
		c3+=a[i]==3?1:0;
	}
	
	while(c1<3) {//можно объединить с последующим циклом
		index=rand.nextInt(a.length);
		a[index]=(a[index]!=1&&a[index]!=2&a[index]!=3?1:a[index]);
		c1++;
	}
	while(c2<=c3) {
		index = rand.nextInt(a.length);
		if(a[index]!=1&&a[index]!=2) {
			a[index]=2;
			c2++;
		}
	}
	c1=c2=c3=0;
	for(int i = 0;i < a.length; i++) {
		System.out.printf("%3d",a[i]);
		c1+=a[i]==1?1:0;
		c2+=a[i]==2?1:0;
		c3+=a[i]==3?1:0;
	}
	System.out.printf("%nЕдиниц : %d , двоек %d , троек %d", c1,c2,c3);
}
public static void ex_16(int size) {
	int[] a = new int[size];
	Random rand = new Random();
	for(int i = 0;i<a.length;i++) {
		a[i]=0-rand.nextInt(a.length);
		while(a[i]==0) {
			a[i]=0-rand.nextInt(a.length);
		}
	}

	int pos=0,neg=a.length;
	while(pos!=neg) {
		int index = rand.nextInt(a.length);
		while(a[index]>=0) {
			index=rand.nextInt(a.length);
		}
			a[index]=rand.nextInt(a.length);
			pos++;
			neg--;
	}
	
	 pos=neg=0;
	for(int i = 0;i<a.length;i++) {
		pos+=a[i]>=0?1:0;
		neg+=a[i]<0?1:0;
		System.out.printf("%3d",a[i]);
	}
	System.out.printf("%nПоложительных чисел %d, отрицательных %d", pos,neg);
}
public static void ex_17(int size) {
	int[] a = new int [size];
	int c1=0,index2=-1,sum=0;
	Random rand = new Random();
	
	for(int i = 0 ;i < a.length; i++) {
		a[i]=rand.nextInt(3);
		c1+=a[i]==1?1:0;
		sum+=(a[i]==2||a[i]==0?1:0);
	}
	while(sum!=c1) {
		int index = rand.nextInt(a.length);
		if(c1<sum) {
			while(a[index]!=1) {
				a[index]=rand.nextInt(3);
			}
			c1++;
			sum--;
		}
		else {
			while(a[index]==1) {
				a[index]=rand.nextInt(3);
			}
			c1--;
			sum++;
		}
	}
	int index1=-1;
	for(int i = 0 ;i < a.length; i++) {
		if(a[i]==2&&index2==-1) {
			index2=i;
		}
		if(a[i]==1&&index1==-1) {
			index1=i;
		}
	}
	if(index1<index2) {
		a[index1]=2;
		a[index2]=1;
	}
	
	for(int i =0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
	}
	System.out.printf("%nПозиция первой единицы была [%d], позиция первой двойки была [%d] %n Количество единиц : %d количество двоей и нулей : %d",
			index1,index2,c1,sum);
	
}
public static int[] random_array(int size) {
	int[] a = new int[size];
	Random rand = new Random();
	for(int i = 0;i<a.length;i++) {
		a[i]=rand.nextInt(a.length);
	}
	return a;
}
public static void show_array(int[] a) {
	for(int i=0;i<a.length;i++) {
		System.out.printf("%s%3d",(i%8==0?"\n":"\t"),a[i]);
	}
}
public static void ex_19(int size,int x) {
	int[] a = random_array(size);
	for(int i = 0;i<a.length;i++) {
		if(a[i]==x) {
			System.out.println("Массив содержит "+x);
			break;
		}
		if(i==a.length-1) {
			System.out.println("Массив не содержит "+x);
		}
	}
	show_array(a);
}
public static void ex_20(int size) {
	int[] a = random_array(size);
	int cntr=0;
	for(int i = 0;i< a.length;i++) {
		cntr+=a[i]%2==0?1:0;
	}
	show_array(a);
	System.out.printf("%nЧетных чисел в массиве : %d",cntr);
}
public static void ex_21(int size,int n1,int n2) {
	int[] a = random_array(size);
	int cntr=0;
	for(int i = 0;i< a.length;i++) {
		cntr+=( a[i]%n1==0 && a[i]%n2!=0)?1:0;
	}
	show_array(a);
	System.out.printf("%nКоличество чисел в массиве,которые делятся на %d и не делятся на %d = %d",n1,n2,cntr);
}
public static void ex_22(int size) {
	int[] a = random_array(size);
	int ctr1=0;
	int ctr2=0;
	for(int i = 0;i< a.length;i++) {
		if(a[0]!=a[a.length-1]) {	
			ctr1+=( a[i]%a[0]==0)?1:0;
			ctr2+=(a[i]%a[a.length-1]==0)?1:0;
		}
		else {
			System.out.println("\nОдинаково!");
			break;
		}
	}
	show_array(a);
	System.out.printf("%nКоличество чисел в массиве,которые делятся на первый элемент %d%n на последний элемент %d.%nОтвет:  "
			+ "%s",ctr1,ctr2,(ctr1>ctr2?"Первых больше."
					:(ctr1<ctr2?"Вторых больше."
							:"Поровну.") )  );
}
public static void ex_23(int size) {
	int[] a = random_array(size);
	int sum=0;
	double mul=1;
	for(int i = 0;i< a.length;i++) {
		sum+=a[i];
		mul*=a[i];
	}
	show_array(a);
	System.out.printf("%nСумма элементов : %d . Произведение : %.0f.",sum,mul);

}
public static void ex_24(int size){
	int [] a = random_array(size);
	int sum =0 ;
	for(int i = 0;i<a.length;i++) {
		sum+=a[i]%2==0?a[i]:0;
	}
	show_array(a);
	System.out.println("\nСумма четных элементов массива " + sum);
}
public static void ex_25(int size,int n1){
	int [] a = random_array(size);
	int sum =0 ;
	for(int i = 0;i<a.length;i++) {
		sum+=( a[i]%2!=0 && a[i]<=n1 )?a[i]:0;
	}
	show_array(a);
	System.out.printf("%nСумма нечетных чисел массива, которые не превосходят %d = %d",n1,sum);
}
public static int first_even_index(int[] a) {
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			return i;
		}
	}
	return -1;
}
public static int[] make_not_even(int[] a) {
for(int i =0;i<a.length;i++) {
	a[i]=a[i]%2==0?a[i]+1:a[i];
}
	return a;
}
public static void ex_26(int size) {
	int[] a = random_array(size);
	show_array(a);
	System.out.println();
	//a=make_not_even(a);
	//show_array(a);
	int index = first_even_index(a);
	int sum = 0;
	if(index!=-1) {
		for(int i = 0;i<index;i++) {
			sum+=a[i];
		}
		System.out.printf("%nВ массиве есть четный элемент a[%d] = %d ,сумма элементов до него : %d",index,a[index],sum);
	}
	else {	
		for(int i = 1;i<a.length-1;i++) {
			sum+=a[i];
		}
		System.out.printf("%nВ массиве нет четных элементов  ,сумма элементов кроме крайних : %d",sum);
	}
	
}
public static void ex_27(int size) {
	int[] a = random_array(size);
	show_array(a);
	int sum =0 ;
	for(int i =0;i<a.length;i+=2) {
		sum+=a[i];
	}
	System.out.printf("%nСумма чисел массива, стоящих на четных позициях : %d.",sum);
}
public static void ex_28(int size) {
	int[] a = random_array(size);
	show_array(a);
	int sum =0 ;
	for(int i =0;i<a.length;i+=2) {
		sum+= a[i] > (a[0]+a[a.length-1])  ? a[i] : 0;
	}
	System.out.printf("%nСумма чисел массива, которые стоят на нечетных местах и при этом превосходят сумму крайних элементов массива : %d.",sum);
}
public static void ex_29(int size) {
	int[] a = random_array(size);
	show_array(a);
	System.out.println();
	int sum = 0;
	for(int i = 0;i < a.length; i+=2) {
		sum+=a[i];
		System.out.print(sum+" ");
		sum-=(i+1<a.length)?a[i+1]:0;	
		System.out.print(sum+" ");
	}
	System.out.printf("%n Найдите x1−x2+x3−…−xn−1+xn. = %d",sum);
}
public static void ex_30(int size) {
	int[] a = random_array(size);
	show_array(a);
	System.out.println();
	int sum = 0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i]*a[a.length-1-i];
		System.out.print(sum+" ");
	}
	System.out.printf("%n Найдите x1xn+x2xn−1+…+xnx1 = %d",sum);
}
public static int sum(int[] a,int i) {
	int sum=0;
	for(int j=a.length-1;j>=a.length-1-i;j--) {
		sum+=a[j];
	}
	return sum;
}
public static void ex_31(int size) {
	int[] a = random_array(size);
	show_array(a);
	System.out.println();
	int res = 1;
	for(int i=0;i<a.length;i++) {
		res*=sum(a,i);
		System.out.println(sum(a,i));
	}
	System.out.println("\nНайдите xn(xn+xn−1)(xn+xn−1+xn−2)…(xn+…+x1) = "+res);
	
}
public static int get_min(int[] a) {
	int min = a[0];
	for(int i =0;i<a.length;i++) {
		min=a[i]<min?a[i]:min;
	}
	return min;
}
public static int get_even_min(int[] a) {
	int min = a[first_even_index(a)];
	for(int i =0;i<a.length;i++) {
		min=(a[i]<min && a[i]%2==0)?a[i]:min;
	}
	return min;
}
public static int get_max(int[] a) {
	int max = a[0];
	for(int i =0;i<a.length;i++) {
		max=a[i]>max?a[i]:max;
	}
	return max;
}
public static void ex_32(int size) {
	int[] a = random_array(size);
	show_array(a);
	System.out.println("\nНаибольший элемент массива = "+get_max(a));
}
public static void ex_33(int size) {
	int[] a =random_array(size);
	show_array(a);
	System.out.println("\nСумма наибольшего и наименьшего элементов массива = "+( get_max(a)+get_min(a) ) );
}
public static void ex_34(int size,int difference) {
	int[] a =random_array(size);
	show_array(a);
	double dif = (double)get_max(a)*(double)(difference)/100;
	int max = get_max(a);
	System.out.printf("\nmax = %d dif = %.2f%n",get_max(a),dif);
	
	int ctr=0;
	
	for(int i = 0;i<a.length;i++) {
		ctr+=( (double)a[i]-max<=dif)?1:0;
		if (max - (double)a[i]<=dif){
			System.out.print(a[i]+" ");
			}
	}
	System.out.println("\nКоличество элементов массива, которые отличны от наибольшего элемента не более чем на 10% = "+ctr);
}
public static void ex_35(int size) {
	int [] a = random_array(size);
	show_array(a);
	System.out.println("\nНаименьший четный элемент массива : "+get_even_min(a));
}
public static int get_special_min(int[] a,int chetnost ,int del) {

	int min=0;
	for(int i= chetnost;i<a.length;i+=2) {
		if(a[i]%del==0) {
			min=a[i];
			break;
		}
	}
	for(int i = chetnost;i<a.length;i+=2) {
		min=(a[i]%del==0 && a[i]<min)?a[i]:min;
	}
	return min;
}
public static int get_special_max(int[] a,int chetnost ,int del) {
	int max=0;
	for(int i= chetnost;i<a.length;i+=2) {
		if(a[i]%del==0) {
			max=a[i];
			break;
		}
	}
	for(int i = chetnost;i<a.length;i+=2) {
		max=(a[i]%del==0 && a[i]>max)?a[i]:max;
	}
	return max;
}
public static void  ex_36(int size) {
	int [] a = random_array(size);
	show_array(a);
	System.out.println("\nСреди элементов с нечетными номерами найдите наибольший элемент массива, который делится на "+3+" ="
			+ " "+get_special_max(a, 1, 3) +" ,а максимальный элемент = "+get_max(a));
	
}
public static void ex_37(int size,int p) {
	int [] a = random_array(size);
	show_array(a);
	System.out.println();
	
	int min=Math.abs(p-a[0]-a[1]);
	int index1=0,index2=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			int dif=Math.abs(p-a[i]-a[j]);
			if(dif<min) {
				min=dif;
				index1=i;
				index2=j;
			}
			
		}
	}
	System.out.printf("Найдите два различных числа в массиве, сумма которых наиболее близка к %d.%nОтвет: %d , %d", p,a[index1],a[index2]);
}
public static void ex_38(int size) {
	int [] a = random_array(size);
	show_array(a);
	System.out.println();
	
	int min=a[0]+a[1];
	int index1=0,index2=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			if(a[i]+a[j]<min) {
				min = a[i]+a[j];
				index1=i;
				index2=j;
			}
		}
	}
	System.out.printf("Дан массив. Найдите два соседних элемента, сумма которых минимальна.\nОтвет : %d + %d = %d",a[index1],a[index2],min);
	List<Integer> list = new ArrayList<Integer>();
	for(int i =0;i<a.length;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			if( !(list.contains(a[i]+a[j]) ) ) {
				list.add(a[i]+a[j]);
			}
		}
	}
	System.out.println();
	list.sort(null);
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
}
public static void ex_39(int size) {
	int [] a = random_array(size);
	show_array(a);
	System.out.println();
	
	int max=a[0]+a[1]+a[2];
	int index1=2;
	for(int i=3;i<a.length;i++) {
		int sum=a[i]+a[i-1]+a[i-2];
		if(max<sum) {
			max=sum;
			index1=i;
		}
	
	}
	System.out.printf("Найдите три последовательных элемента в массиве, сумма которых максимальна.\nОтвет : %d + %d +%d= %d",a[index1],a[index1-1],a[index1-2],max);
	
	List<Integer> list = new ArrayList<Integer>();
	for(int i =0;i<a.length-2;i++) {
			int sum = a[i]+a[i+1]+a[i+2];
			if( !(list.contains(sum) ) ) {
				list.add(sum);
		}
	}
	System.out.println();
	list.sort(null);
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
}
public static void ex_40(int size) {
	int [] a = random_array(size);
	show_array(a);
	System.out.println();
	int ctr=0;
	List<Integer> temp = new ArrayList<Integer>();
	for(int i=1;i<a.length-2;i++) {
		if( (a[i+1]/a[i-1]) >=2) {
			ctr++;
			temp.add(a[i]);
		}
	}
	System.out.printf("%nВ данном массиве найдите количество чисел, соседи у которых отличаются более чем в 2 раза. "
			+ "%nОтвет : %d%nТакие элементы : ",ctr);
	for(int i = 0;i<temp.size();i++) {
		System.out.print(temp.get(i)+" ");
	}
}

public static void main(String[] args) {
//show_task(ex_34); ex_34(80,10);
	Ex_1_40 exmpl=new Ex_1_40();
	exmpl.show_task(ex_40); ex_40(15);
}

}
