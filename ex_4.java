import java.util.Scanner;
import java.util.*;
public class ex_4 {
	public static String ex_4 = "Описать класс, реализующий десятичный счетчик, который может "
			+ "\nувеличивать или уменьшать свое значение на единицу в заданном диапазоне."
			+ "\nПредусмотреть инициализацию счетчика значениями по умолчанию и произвольными значениями. "
			+ "\nСчетчик имеет два метода: увеличения и уменьшения, — и свойство, позволяющее получить его текущее состояние. "
			+ "\nНаписать программу, демонстрирующую все возможности класса.";
public static class Counter{
	private int upLimit;
	private int downLimit;
	private int counterValue;
	
	Counter(){
		this.downLimit=0;
		this.upLimit=10;
		this.counterValue=this.downLimit;
	}
	Counter(int x,int y){
		this.downLimit=x;
		this.upLimit=y;
		this.counterValue=this.downLimit;
	}
	Counter(int x,int y,int z){
		this.downLimit=x;
		this.upLimit=y;
		this.counterValue=z;
	}

	public void set_upLimit(int upLimit) {
		this.upLimit=upLimit;
	}
	public void set_downLimit(int downLimit) {
		this.downLimit=downLimit;
	}
	public void set_conterValue(int counterValue) {
		this.counterValue=counterValue;
	}
	
	public int get_upLimit() {
		return this.upLimit;
	}
	public int get_downLimit() {
		return this.downLimit;
	}
	public int get_counterValue() {
		return this.counterValue;
	}
	
	public void Enlarge() {
		this.counterValue++;
		if(this.counterValue>this.upLimit){
			this.counterValue=this.downLimit;
		}
	}
	public void Reduce() {
		this.counterValue--;
		if(this.counterValue<this.downLimit){
			this.counterValue=this.upLimit;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter cnt = new Counter(0,10,5);
		Scanner in = new Scanner(System.in);
		System.out.println("'+' - увеличить, '-' - уменьшить, 'с' - узнать текущее значение , 'def' - сбросить на значение по умолчанию,'p' - выход");
		String tmp="";
		String[] vars = {"+","-","c","def","p"};
		Random rand = new Random();
		int cntr = 0;
		tmp=vars[rand.nextInt(2)];
		System.out.println(tmp);
		while(cntr<15) {
			if(tmp=="+") {
				cnt.Enlarge();
				System.out.println(cnt.get_counterValue());
			}
			else { 
				if(tmp=="-") {
				cnt.Reduce();
				System.out.println(cnt.get_counterValue());
				}
				else {
					if(tmp=="c"||tmp=="с") {
						System.out.println(cnt.get_counterValue());
					}
					else {
						if(tmp=="def") {
							cnt.set_conterValue(cnt.get_downLimit());
						}
						else{
							if(tmp=="p"||tmp=="р") {
								break;
							}
						}
					}
				}
			}
		
			System.out.println(	tmp=vars[rand.nextInt(2)]);
			cntr++;
		}
	
		
		in.close();
	}

}
