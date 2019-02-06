import java.util.*;
public class ex_10 {
public static String ex_10 = "������� ����� ��������� ����������. "
		+ "\n������������� ����������� ������ � ������������ ������ ����, "
		+ "\n������ ����� �� ������-���� �������� (��������, �� ������ ��� �� ���� �������), "
		+ "\n���������� ���� � ����������, �������� ���� �� ���, ���������� ���� �� ������ �����.";
public static class Book{
	private	String author="Undefined";
	private	String name="Undefined";
	private	String type="Undefined";
	
	Book(String a,String n){
		this.author=a;
		this.name=n;
	}
	Book(String a,String n,String t){
		this.author=a;
		this.name=n;
		this.type=t;
	}
	public  String get_author() {
		return this.author;
	}	
	public  String get_name() {
		return this.name;
	}
	public String get_type() {
		return this.type;
	}
	
	public void set_author(String author) {
		this.author=author;
	}
	public void set_name(String name) {
		this.name=name;
	}
	public void set_type(String type) {
		this.type=type;
	}
	@Override
	public String toString() {
		return "�������� : \""+this.name+"\" \t\t����� :"+this.author+"\t ���� : "+this.type;
	}
}

public static class Libriary{
	private List<Book> books= new ArrayList<Book>();
	Libriary(){}
	Libriary(ArrayList<Book> edited){
		this.books= new ArrayList<Book>(edited);
	}
	public boolean add(Book book) {
		if(!books.contains(book)) {
			this.books.add(book);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean remove(Book book) {
		if(books.contains(book)|| !books.isEmpty()) {
			this.books.remove(book);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean contains(Book book) {
		if(books.contains(book)) {
			return true;
		}
		else return false;
	}
	public ArrayList<Book> find_by_author(String author) {
		ArrayList<Book> tmp = new ArrayList<Book>();
		for(Book b:this.books) {
			if(b.get_author()==author) {
		//		System.out.println(b.get_author()+" = "+author);
				tmp.add(b);
			}
		}
		return tmp;	
	}
	public ArrayList<Book> find_by_name(String name) {
		ArrayList<Book> tmp = new ArrayList<Book>();
		for(Book b:books) {
			if(b.get_name()==name) {
				tmp.add(b);
			}
		}
		return tmp;	
	}
	public ArrayList<Book> find_by_type(String type) {
		ArrayList<Book> tmp = new ArrayList<Book>();
		for(Book b:books) {
			if(b.get_type()==type) {
				tmp.add(b);
			}
		}
		return tmp;	
	}
	public void show_all() {
		for(Book b:books) {
			System.out.println(b.toString());
		}
	}
	public void show_authors() {
		for(Book b:books) {
			System.out.println(b.get_author());
		}
	}
	public void show_names() {
		for(Book b:books) {
			System.out.println(b.get_name());
		}
	}
	public void show_types() {
		for(Book b:books) {
			System.out.println(b.get_type());
		}
	}


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	ex_10 e= new ex_10();
		Libriary my_lib=new Libriary();
		Book b = new Book("�.�.�������","���� ��������","�����");
		my_lib.add(b);
		b = new Book("�.�.�������","����� � ���","�����");
		my_lib.add(b);
		b = new Book("A.�.������","������� ������","�����");
		my_lib.add(b);
		b = new Book("�.�.�����������","������ ����������","�����");
		my_lib.add(b);
		b = new Book("�.�.�����������","����","�����");
		my_lib.add(b);
		b = new Book("�.�.�����������","�����","�����");
		my_lib.add(b);
		b = new Book("���� ��������","��� �������� ������","����������");
		my_lib.add(b);
		b = new Book("�����-������","������ ��������","��������");
		my_lib.add(b);
		b = new Book("�.�.�������","� ������� �����","���������");
		my_lib.add(b);
	
		Libriary local = new Libriary( my_lib.find_by_type("�����") );
		local.show_all();
	}

}
