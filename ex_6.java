import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * —оздать класс, содержащий динамический массив и количество элементов в нем. 
 * ƒобавить конструктор, который выдел€ет пам€ть под заданное количество элементов, и деструктор.
 *  ƒобавить методы, позвол€ющие заполн€ть массив случайными числами, 
 * переставл€ть в данном массиве элементы в случайном пор€дке, 
 * находить количество различных элементов в массиве, выводить массив на экран.
 */
public class ex_6 {
public class dynamicArr{
	int[] val;
	dynamicArr(){
		this.val=new int[0];
	}
	dynamicArr(int size){
		size=Math.abs(size);
		this.val=new int[size];
	}
	dynamicArr(int[] arr) {
		int[] tmp=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			tmp[i]=arr[i];
		}
		tmp[tmp.length-1]=0;
		this.val=tmp;
	}
	public void add(int n){
		int[] tmp=new int[this.val.length+1];
		for(int i=0;i<this.val.length;i++) {
			tmp[i]=this.val[i];
		}
		tmp[tmp.length-1]=n;
		this.val=tmp;
	}
	public void randomize(int range) {
		Random rand = new Random();
		for(int i =  0; i< this.val.length;i++) {
			this.val[i]=rand.nextInt(range);
		}
	}
	public void shuffle() {
		Random rand = new Random();
		int size = this.val.length;
		for(int i = 0; i < size;i++) {
			int r1=rand.nextInt(size);
			int r2=rand.nextInt(size);
			while(r1==r2) {
				r1=rand.nextInt(size);
				r2=rand.nextInt(size);
			}
			int tmp = this.val[r1];
			this.val[r1]=this.val[r2];
			this.val[r2]=tmp;
		}
	}
	public int[] uniqueElements() {
		Set<Integer> tmp = new HashSet<Integer>();
		for(int i = 0 ; i < this.val.length;i++) {
			tmp.add(this.val[i]);
		}
		int[] retval = new int[ tmp.size()];
		int i = 0;
		for(int elem:tmp) {
			retval[i++]=elem;
		}
		return retval;
	}
	public int size() {
		return this.val.length;
	}
	@Override
	public String toString() {
		String retval="[";
		for(int i:this.val) {
			retval+=i+",";
		}
		retval=retval.substring(0,retval.length()-1);
		retval+="]";
		return retval;
	}
}
	public static void main(String[] args) {
		ex_6 e = new ex_6();
		dynamicArr a = e.new dynamicArr(10);
		a.randomize(10);
		
		System.out.println(a.toString()+" size : "+a.size());
		a.shuffle();
		System.out.println(a.toString()+" size : "+a.size());
	
		int[] u = a.uniqueElements();
		for(int un:u) {
			System.out.print(un+" ");
		}
		System.out.println();
		for(int i = 0 ; i< 5 ; i++) {
			a.add(i);
		}
		System.out.println(a.toString()+" size : "+ a.size());
		
	
	
	}
}
