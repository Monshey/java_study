/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.*;
public class Ex_145 {
public static String ex_145= "������������ ������ ����. �����, ������� ��������� ��� �� ��������. "
		+ "\n���� ������� ����������, �� ������� �������� � ������ ��������, �� ���� ���� z, �� a b c. "
		+ "\n����� ������ ��������� ����. ������, ��� ������������ ����� ������ ���������";
public static String ex_146 = "������� ����. ������� �� 5 ���� � ������.";
public static String ex_147 = "������� ������� 7 �� 7 �� ��������� ����.";

public static void show_task(String task){
	System.out.println(task);
}

public static void ex_145(char ch){
	if(ch>='A'&&ch<='Z') {
		ch = Character.toLowerCase(ch);
	}
	for(int i = 0;i<3;i++)
	{
		if(ch+1<='z') {
			ch++;
			}
		else {
			ch='a';
		}
		System.out.println(ch+" ");
	

	}
}
public static void ex_146() {
	char ch='a';
	int i = 0;
	while(ch>='a'&&ch<='z') {
		System.out.print(((i++)%5==0?"\n":"\t")+Character.toUpperCase(ch)+" "+ch);
		ch++;
	}
}
public static void ex_147(int n,int m) {
	Random rand = new Random();
	for(int i =0;i<n*m;i++)
	{	
		char ch=(char)rand.nextInt(256);
		while(!(Character.isLowerCase(ch)||Character.isUpperCase(ch))) {
			ch=(char)rand.nextInt(256);
		}
	
		System.out.print(i%n==0?"\n":"\t"+ch);
	}
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		show_task(ex_147);
		ex_147(7,7);
	}

}
