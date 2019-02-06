/**
 * 
 */

/**
 * @author mindybaev
 *
 */
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;;
public class ex_1 {
	public static String ex_1 = "Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер группы, успеваемость "
			+ "\n(массив из пяти элементов). "
			+ "\nСоздать массив из десяти элементов такого типа, упорядочить записи по возрастанию среднего балла."
			+ "\nДобавить возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.";

	public static class Student{
	private String surname;
	private String name;
	private int group;
	private ArrayList<Integer> progress = new ArrayList<Integer>(); 
	Student() {
		this.surname="Undefined";
		this.name = "Undefined";
		this.group = -1;
		Collections.addAll(this.progress, 0,0,0,0,0);
	}
	Student(String surname){
		this.surname = surname;
		this.name = "Undefined";
		this.group = -1;
	}
	Student(String surname,String name){
		this.surname=surname;
		this.name=name;
		this.group = -1;
	}
	Student(String surname,String name,int group){
		this.surname=surname;
		this.name=name;
		this.group = group;
	}
	Student(String surname,String name,int group,int[] evaluation){
		this.surname=surname;
		this.name=name;
		this.group = group;
		this.progress.clear();
		for(int i =0 ;i<evaluation.length;i++) {
			this.progress.add(evaluation[i]);
		}
	}
	Student(String surname,String name,int group,int qty,boolean flg){
		this.surname=surname;
		this.name=name;
		this.group = group;
		this.progress.clear();
		Random rand = new Random();
		for(int i =0 ;i<qty;i++) {
			this.progress.add(2+rand.nextInt(4));
		}
	}
	
	public void set_name(String name) {
		this.name=name;
	}
	public void set_surname(String surname) {
		this.surname=surname;
	}
	public void set_group(int group) {
		this.group=group;
	}
	public void add_progress(int[] evaluation) {
			for(int i =0 ;i<evaluation.length;i++) {
				this.progress.add(evaluation[i]);
			}
	}
	public void set_progress(int[] evaluation) {
		this.progress.clear();
		for(int i =0 ;i<evaluation.length;i++) {
			this.progress.add(evaluation[i]);
		}
	}
	
	public String get_surname() {
		return this.surname;
	}
	public String get_name() {
		return this.name;
	}
	public int get_group() {
		return this.group;
	}
	public ArrayList<Integer> get_progress() {
		return this.progress;
	}
	public  double get_average_mark() {
		double avg=0;
		for(int i :this.progress) {
			avg+=i;
		}
		return (avg/this.progress.size());
	}
	public boolean check_mark(int[] marks) {

		ArrayList<Integer> progr = new ArrayList<Integer>(this.progress);
		ArrayList<Integer> evaluation = new ArrayList<Integer>();
		
		for(int i = 0;i<marks.length;i++) {
			evaluation.add(marks[i]);
		}
		
		progr.retainAll(evaluation);
		progr.trimToSize();
		if(progr.size()==this.progress.size()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void print() {
		System.out.print("\nФамилия : "+this.surname+" Имя : "+this.name+" Группа : №"+this.group+"\n");
		System.out.print("Успеваемость : {");
		for(int i :this.progress) {
			System.out.print(i+" ");
		}
		System.out.print("}\nСредний бал : "+this.get_average_mark());
	}

	};
	  public static Comparator<Student> AvgMarkComparator = new Comparator<Student>() {
		  
	        @Override
	        public int compare(Student st1, Student st2) {
	            return (int)( st1.get_average_mark()-st2.get_average_mark() );
	        }
	    };	

	
	
	public static void show_all_students(ArrayList<Student> tmp) {
		for (Student foo:tmp){
			foo.print();
		}
	}
	public static void show_only_if_marks(ArrayList<Student> tmp,int[] marks) {
		for(Student foo:tmp) {
			if(foo.check_mark(marks)) {
				foo.print();
			}
		}
	}
	public static boolean compare_avg(Student st1,Student st2) {
		return st1.get_average_mark()>st2.get_average_mark()?true:false;
	}
//	public static ArrayList<Student> sort_students(ArrayList<Student> tmp) {
	//	Collections.sort(tmp, AvgMarkComparator);
		//return tmp;
//	}
	public static void sort_students(ArrayList<Student> tmp) {
		Collections.sort(tmp, AvgMarkComparator);
		show_all_students(tmp);
	}
	public static ArrayList<Student> generate_group_of_students(int qnty) {
		ArrayList<Student> group= new ArrayList<Student>();
		for(int i = 0;i<qnty;i++) {
			String snm = String.format("Фамилия#%d",i);
			String nm = String.format("Имя#%d", i);
			int number = 123;
			int qty=5;
			Student tmp = new Student(snm,nm,number,qty,true);
			group.add(tmp);
		}
		return group;
	}
	public static ArrayList<Student> generate_group_of_students(int qnty,int qnty_of_marks) {
		ArrayList<Student> group= new ArrayList<Student>();
		for(int i = 0;i<qnty;i++) {
			String snm = String.format("Фамилия#%d",i);
			String nm = String.format("Имя#%d", i);
			int number = 123;
			int qty=qnty_of_marks;
			Student tmp = new Student(snm,nm,number,qty,true);
			group.add(tmp);
		}
		return group;
	}

	
	public static void main(String[] args) {
	//Student foo = new Student("Jackson","Tom",1234,5,true);
	//foo.print();
	int[] marks = {4,5};
	//System.out.println("\n"+foo.check_mark(marks));
	ArrayList<Student> group= new ArrayList<Student>();
	group.addAll(generate_group_of_students(10,5));
	sort_students(group);
//	show_all_students(group);
//	show_only_if_marks(group,marks);
	}
}
