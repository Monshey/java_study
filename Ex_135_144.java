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
public static String ex_135 = "�������� ��������� ����� ����� �� 0 � 1 �����, ��� ����� ����� � ��� ������ 10.";
public static String ex_136 = "���� n ��������. �� � ��������� ������ ����������. �� ��� ����� ����� 1, 2 ��� 3 �������.\n "
		+ "�������� ���, ���� ������ �����. ���������� ���� � �����������. ��������� ����� �������� (��� ������� ���������� ���������),\n "
		+ "������ ���� � ���� ���� ���, ������� �������� ��������� ��� ��� ��������, �� �� ��� ���������.";
public static String ex_137 = "���������� ����� �� n ��� \"������, �������, ������\" � �����������. "
		+ "\n� ���������� �������� ����������: ������� ��� ������� ������������, ������� ��� ������� ���� ����� ���� �������. \n"
		+ "��������� ���� �������� ���������� ����� ����� � ����� �������� ����������� ������ ��� ����.";
public static String ex_138 = "������������� ��������� ����� �� 15 �����, � ������� ����� 3 �������, ��������� ����.";
public static String ex_139 = "������������ ����� �� 10 ��������� ����� �� 1 �� 3 � �������: "
		+ "/n�) �� ������� ���������� ����� ������/������ ���������� �����,"
		+ "/n�) ���������� �����, ������� �� ������ ������, "
		+ "/n�)���������� ����� ����� ������ ���� ����� �����.";
public static String ex_140 = "C������������ 20 ����� �� 0, 1, 2 �����, ��� ����� ����� � ������ ����� ����� 12."
		+ "\n����� ���������� ������ � ������ �����, "
		+ "\n���������� ����� � ������ �����, ����� ������ �����, "
		+ "\n������� ���������� ����� � ������, ������� ����� ����� "
		+ "\n� ���������� ���������� ��������� ����� � ������.";
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
		System.out.printf("����� %d ����� %d%n",i,sum);
	}
}
public static void ex_136(int n) {
	int u=0,p=0,k=1;
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("� ������ "+n+" ��������.");
	while(n>=0) {
		if(n==0) {
			System.out.println("� ������ "+n+" ��������. ��������� �������." );
			break;
		}
		System.out.printf("%n��� %d : �������� 1,2,3 ������� �� ������ :  ",k++);
		u= in.nextInt();
		n-=u;
		System.out.printf("�� ����� %d ��������, � ������ �������� %d.%n",u,n);
		if(n<0) {
			System.out.println("� ������ "+n+" ��������. ��������� �������." );
			break;
		}
		p=rand.nextInt(3)+1;
		n-=p;
		if(n==0) {
			System.out.printf("��������� ���� %d ��������, � ������ �������� %d.%n",p,n);
			System.out.println("��������� �������.");
			break;
		}
	
		System.out.printf("��������� ���� %d ��������, � ������ �������� %d.",p,n);
	}
	in.close();
}
public static void ex_137(int n) {
	String[] game = {"������","�������", "������"};
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	String comp = "";
	String user = "";
	int u=0,c=0;
	while(n>0) {
		System.out.print("�����#"+n--+" : ��� ��� : ");
		user = in.nextLine();
		comp = game[rand.nextInt(3)];
		System.out.println("��� ���������� : "+ comp);
		if(user.equalsIgnoreCase(comp)) {
			System.out.println("�����");
		}
		else if(user.equalsIgnoreCase("������")) {
			if(comp==game[1]&&(game[1]!=null)) {
				u++;
				System.out.println("�� ��������." );
			}
			else {
				c++;
				System.out.println("�� ���������.");
			}
			
		}
		else if(user.equalsIgnoreCase("�������")){
			if(comp==game[2]&&(game[2]!=null)) {
				u++;
				System.out.println("�� ��������." );
			}
			else {
				c++;
				System.out.println("�� ���������.");
			}
		}
		else if(user.equalsIgnoreCase("������")){
			if(comp==game[0]&&(game[0]!=null)) {
				u++;
				System.out.println("�� ��������." );
			}
			else {
				c++;
				System.out.println("�� ���������.");
			}
		}
		else {
			System.out.println("�� ����� ������������ �������.");
		}
	}
	System.out.printf("���� %d : %d. ���� : %s %n",u,c,((u>c)?"������ ������!":((u==c)?"�����.":"������ ����������.")));
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
	System.out.println("\n\n�������� �������� ���������.");
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
	System.out.printf("%n����� �� %d %s �����",(int)Math.abs(count_2-count_3),(count_2>=count_3?"������":"������"));
	System.out.printf("%n���������� �����, ������� �� ������ ������ : %d",count_chetn_3);
	System.out.printf("%n���������� ����� ����� ������ ���� ����� ����� : %d", count_2_in_first_five);
}

public static void ex_140(int n,int m) {
	Serial[] mas = new Serial[m];
	for(int i = 0;i<m;i++) {
		System.out.printf("�����#%d:",i);
		
		mas[i].calculate(n);
		for(int j=0;j<mas[i].length;j++) {
			System.out.printf("%3d",mas[i].vector.get(j));
		}
		System.out.printf("%n���������� ������ � ����� : %d  ���������� ����� : %d ",mas[i].get_count_1(),mas[i].get_count_2());
	}
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show_task(ex_135);	ex_135(10);
		show_task(ex_140); ex_140(12,5);

		
	}

}
