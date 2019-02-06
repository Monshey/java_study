
import java.util.*;
public class ex_2 {
public static String ex_2 = "Создать класс с двумя переменными. \n"
		+ "Добавить функцию вывода на экран и функцию изменения этих переменных. "
		+ "'nДобавить функцию, которая находит сумму значений этих переменных, и функцию которая находит наибольшее значение из этих двух переменных";

public static class point{
	private int x;
	private int y;
	point(){
		this.x=0;
		this.y=0;
	}
	point(int x){
		this.x=x;
	}
	point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void generate(int range,boolean flg) {
		Random rand = new Random();
		if(!flg) {
		this.x=rand.nextInt(range);
		this.y=rand.nextInt(range);
		}
		else {
			int dbl=range*2;
			this.x=rand.nextInt(dbl)-range;
			this.y=rand.nextInt(dbl)-range;
		}
	}
	@Override
	public String toString() {
		return "[x="+this.x+",y="+this.y+"]";
	}
	public int max() {
		return this.x>this.y?this.x:this.y;
	}
	public int sum() {
		return this.x+this.y;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p = new point();
		p.generate(10, true);
		System.out.println(p.toString());
		System.out.println("max = "+p.max());
		System.out.println("sum = "+p.sum());
	}

}
