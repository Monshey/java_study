/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.*;
public class Ex_140 {
	
public List<Integer> fill(int n){
	
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		int sum=0;
		while(sum<=n) {
			int r=rand.nextInt(3);
			list.add(r);
			sum+=r;
		}
		return list;
	
}

public class Seq{
	int count_1 = 0;
	int count_2 = 0;
	int count_not_0 = 0;
	int length = 0;
	List<Integer> list = fill(12);
	
	
	public int get_1() {return this.count_1;}
	public int get_2() {return this.count_2;}
	public int get_not_0() {return this.count_not_0;}
	public int get_length() {return this.length;}
	
};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seq s=new Seq();
	}

}
