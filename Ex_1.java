import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;

public class Ex_1 {
public static String ex_1 = "Дан текстовый файл, содержащий целые числа. Удалить из него все четные числа.";
public static String ex_2 = "В данном текстовом файле удалить все слова, которые содержат хотя бы одну цифру.";
public static String ex_3 = "Дан текстовый файл. Создать новый файл, каждая строка которого получается из соответствующей строки исходного файла перестановкой слов в обратном порядке.";
public static String ex_6 = "Создать и заполнить файл случайными целыми значениями. Выполнить сортировку содержимого файла по возрастанию.";
public static String ex_5 = "Даны два текстовых файла, содержащие целые числа. "
		+ "Создать файл из различных чисел, которые содержатся:"
		+ "а) в каждом исходном файле; "
		+ " б) только в одном из двух исходных файлов;"
		+ " в) только в первом исходном файле; "
		+ "г) хотя бы в одном из двух исходных файлов.";
public static String ex_8 = "В текстовый файл занесены пары чисел, разделенных пробелом (каждая пара чисел – в новой строке). "
		+ "Рассматривая каждую пару как координаты точек на плоскости, найти наибольшее и наименьшее расстояния между этими точками.";
public static String ex_9 = "Имеется файл с текстом. Осуществить шифрование данного текста в новый файл путем записи текста в матрицу символов по строкам,"
		+ " а затем чтение символов из этой матрицы по столбцам. Осуществить расшифровку полученного текста.";
public static String ex_11 = "В файле, содержащем фамилии студентов и их оценки, изменить на прописные буквы фамилии тех студентов, "
		+ "которые имеют средний балл за национальной шкалой более «4».";
public static String ex_10 ="Создать программу, переписывающую в текстовый файл g содержимое файла f,"
		+ " исключая пустые строки, а остальные дополнить справа пробелами или ограничить до n символов.";
public static String ex_14="Получить файл g, в котором текст выровнен по правому краю путем равномерного добавления пробелов.";
public static String ex_15="Из текста программы выбрать все числа (целые и вещественные) и записать их в файл g в виде: "
		+ "число 1 – номер строки, число 2 – номер строки и так далее.";
public static String ex_17="Текстовый файл содержит записи о телефонах и их владельцах. "
		+ "Переписать в другой файл телефоны тех владельцев, фамилии которых начинаются с букв К и С.";
public static String ex_18="Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка файла – одна строка матрицы."
		+ " Необходимо построить двухмерный массив и вывести на экран исходную матрицу и результат ее транспонирования";
public static String ex_21 = "Дан текстовый файл со статистикой посещения сайта за неделю."
		+ " Каждая строка содержит ip адрес, время и название дня недели (например, 139.18.150.126 23:12:44 sunday). "
		+ "Создайте новый текстовый файл, который бы содержал список ip без повторений из первого файла."
		+ " Для каждого ip укажите количество посещений в неделю, наиболее популярный день недели, наиболее популярный отрезок времени длиной в один час. "
		+ "Последней строкой в файле добавьте наиболее популярный отрезок времени в сутках длиной один час в целом для сайта.";
public static String ex_19 ="Текстовый файл содержит квадратную матрицу, которая записана по принципу: "
		+ "одна строка – один элемент матрицы. Необходимо определить размерность матрицы и построить двухмерный массив. "
		+ "Вывести на экран исходную матрицу и результат ее поворота на 90º по часовой стрелке.";


public class ip_stat{
	public String ip="0.0.0.0";
	public String frqDate="";
	public int connections=0;
	public String frqTime="";
	
	@Override
	public String toString() {
		String retval = "[IP:"+this.ip+"||Connections:"+this.connections+"|Most frequent day:"+this.frqDate+"|Most frequent time:"+this.frqTime+"]";
		return retval;
	}
}

private static void exists(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if (!file.exists()){
        throw new FileNotFoundException(file.getName());
    }
}
public static void write(String fileName, String text) {
    //Определяем файл
    File file = new File(fileName);

    try {
        //проверяем, что если файл не существует то создаем его
        if(!file.exists()){
            file.createNewFile();
        }

        //PrintWriter обеспечит возможности записи в файл
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());

        try {
            //Записываем текст у файл
        	
            //out.println(text);
            out.write(text);
        } finally {
            //После чего мы должны закрыть файл
            //Иначе файл не запишется
            out.close();
            System.out.println("\n***********File:"+fileName+" - creation success...***********");
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
}
public static void write(String fileName, String[] text) {
    //Определяем файл
    File file = new File(fileName);

    try {
        //проверяем, что если файл не существует то создаем его
        if(!file.exists()){
            file.createNewFile();
        }

        //PrintWriter обеспечит возможности записи в файл
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());

        try {
            //Записываем текст у файл
        	for(String w:text) {
            out.println(w);
        	}
        } finally {
            //После чего мы должны закрыть файл
            //Иначе файл не запишется
            out.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
}
public static String read(String fileName) throws FileNotFoundException {
    //Этот спец. объект для построения строки
    StringBuilder sb = new StringBuilder();
    File file = new File(fileName);
    exists(fileName);

    try {
        //Объект для чтения файла в буфер
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        try {
            //В цикле построчно считываем файл
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } finally {
            //Также не забываем закрыть файл
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }

    //Возвращаем полученный текст с файла
    return sb.toString();
}
public static void update(String nameFile, String newText) throws FileNotFoundException {
    exists(nameFile);
    StringBuilder sb = new StringBuilder();
    String oldFile = read(nameFile);
    
    sb.append(oldFile);
    sb.append(newText);
    
    write(nameFile, sb.toString());
}
public static void delete(String nameFile) throws FileNotFoundException {
    exists(nameFile);
    new File(nameFile).delete();
}
public static void ex_1() {
	String fileName = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex1.txt";
	
	try {
		String text = read(fileName);
		System.out.println(text);
		String[] tokens = text.split("\\n");
		String retVal ="";
		System.out.println(retVal);
		write(fileName,"");
		for(String t:tokens) {
			if(!t.isEmpty()) {
			if(Integer.parseInt(t)%2>0) {
				//t+="\n";
				update(fileName,t);
			}
			}
		}
		System.out.println(retVal);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
}
public static boolean contains_digits(String s) {
	if(!s.isEmpty()) {
		for(char ch:s.toCharArray()) {
			if(Character.isDigit(ch)) return true;
		}
	}
	return false;
}
public static void ex_2() {
	String fileName = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex2.txt";
	try {
		String text = read(fileName);
		System.out.println(text);
		String[] tokens = text.split("\\n");
		
		write(fileName,"");
		for(String t:tokens) {
			if(!t.isEmpty()) {
				if(!contains_digits(t)) {
					update(fileName,t);
				}
			}
		}
		text = read(fileName);
		System.out.println(text);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
public static String reverse_(String[] words) {
	String retVal = "";
	for(int i =words.length-1; i>=0; i--) {
		retVal+=words[i]+" ";
	}
	return retVal;
}
public static void ex_3() {
	String fileName = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex3.txt";
	String res_fileName = "D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex3Result.txt";
	File file = new File(fileName);
	
	if(file.exists()) {
		String text="";
	 try {
	        //Объект для чтения файла в буфер
	        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
	        try {
	            //В цикле построчно считываем файл
	            String s;
	            while ((s = in.readLine()) != null) {
	            	String[] words = s.split("\\s+");
	            	System.out.println(reverse_(words));
	            	text+=reverse_(words)+"\n";
	            }
	            write(res_fileName,text);
	        } finally {
	            //Также не забываем закрыть файл
	            in.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	
}
public static int[] generate_rand(int size,int range,boolean negative) {
	int[] retVal = new int[size];
	Random rand = new Random();
	int dbl = range*2;
	for(int i = 0; i < retVal.length; i++) {
		retVal[i]=negative?(rand.nextInt(dbl)-range):rand.nextInt(range);
	}
	return retVal;
}
public static void ex_6(int size,int range,boolean negative) {
	String fileName = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex6.txt";
	File file = new File(fileName);
	
	try {
		int[] vals = generate_rand(size,range,negative);
		String text="[";
		for(int i:vals) {
			text+=String.valueOf(i)+",";
		}
		text=text.substring(0,text.length()-1);
		text+="]";
		write(fileName,text);
		System.out.printf("File %s creation success!",fileName);
	}catch(Exception e) {
		throw new RuntimeException(e);
	}
	ArrayList<Integer> a = new ArrayList<Integer>();
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				
				while((s=in.readLine())!=null) {
				//	s=s.replaceAll("[^a-zA-Z0-9,]", "");
					s=s.replaceAll("[\\[\\]]","");
					String[] tokens = s.split(",");
					for(String t:tokens) {
						a.add(Integer.parseInt(t));
					}
				}
				
			}finally {
				in.close();
			}
		
		a.sort(Comparator.naturalOrder());
		System.out.println("\nSorting vals...");
		String res="[";
		for(int i:a) {
			res+=String.valueOf(i)+",";
		}
		res+="]";
		write("D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex6_sorted.txt",res);
		System.out.println("File : D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex6_sorted.txt - creation success!");
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
public static void generate_random_numbers_file(String fileName,int size,int range,boolean negative) {
	
	try {
		int[] vals = generate_rand(size,range,negative);
		String text="[";
		for(int i:vals) {
			text+=String.valueOf(i)+",";
		}
		text=text.substring(0,text.length()-1);
		text+="]";
		write(fileName,text);
		System.out.printf("%nFile %s creation success!%n",fileName);
	}catch(Exception e) {
		throw new RuntimeException(e);
	}
}
public static ArrayList<Integer> readFileIntoIntArray(String fileName){
	File file = new File(fileName);
	ArrayList<Integer> retVal = new ArrayList<Integer>();
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				
				while((s=in.readLine())!=null) {
				//	s=s.replaceAll("[^a-zA-Z0-9,]", "");
					s=s.replaceAll("[\\[\\]]","");
					String[] tokens = s.split(",");
					for(String t:tokens) {
						retVal.add(Integer.parseInt(t));
					}
				}
				
			}finally {
				in.close();
			}
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
	return retVal;
}
public static void ex_5(int size1,int range1,boolean negative1,int size2,int range2,boolean negative2) {
	String fileName1 = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex5_1.txt";
	String fileName2 = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex5_2.txt";
	String fileName_res1 = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex5_res1.txt";
	String fileName_res2 = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex5_res2.txt";
	String fileName_res3 = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex5_res3.txt";
	String fileName_res4 = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex5_res4.txt";
	generate_random_numbers_file(fileName1,size1,range1,negative1);
	generate_random_numbers_file(fileName2,size2,range2,negative2);
	
	ArrayList<Integer> a = new ArrayList<Integer>(readFileIntoIntArray(fileName1));
	ArrayList<Integer> b = new ArrayList<Integer>(readFileIntoIntArray(fileName2));
	ArrayList<Integer> res = new ArrayList<Integer>();
//******************************в каждом исходном файле********************************************************************//
	for(int i:a) {
		if(b.contains(i)) {
			if(!res.contains(i)) res.add(i);
		}
	}
	for(int i:b) {
		if(a.contains(i)) {
			if(!res.contains(i)) res.add(i);
		}
	}
	String text="[";
	for(int i:res) {
		text+=String.valueOf(i)+",";
	}
	text=text.substring(0,text.length()-1);
	text+="]";
	write(fileName_res1,text);
//***************************только в одном из двух исходных файлов***********************************************************************//
	res.clear();
	for(int i:a) {
		if(!b.contains(i) && !res.contains(i)) res.add(i);
	}
	for(int i:b) {
		if(!a.contains(i) && !res.contains(i)) res.add(i);
	}
	text="[";
	for(int i:res) {
		text+=String.valueOf(i)+",";
	}
	text=text.substring(0,text.length()-1);
	text+="]";
	write(fileName_res2,text);
//***************************только в первом исходном файле;***********************************************************************//	
	res.clear();
	for(int i : a) {
		if(!b.contains(i) && !res.contains(i)) res.add(i);
	}
	text="[";
	for(int i : res) {
		text+=String.valueOf(i)+",";
	}
	text=text.substring(0,text.length()-1);
	text+="]";
	write(fileName_res3,text);
	//***************************хотя бы в одном из двух исходных ***********************************************************************//	
	res.clear();
	for(int i : a) {
		if(!res.contains(i)) res.add(i);
	}
	for(int i:b) {
		if(!res.contains(i)) res.add(i);
	}
	text="[";
	for(int i : res) {
		text+=String.valueOf(i)+",";
	}
	text=text.substring(0,text.length()-1);
	text+="]";
	write(fileName_res4,text);
}
public class Point{
	public int x;
	public int y;
	Point(){
		this.x=0;
		this.y=0;
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	Point(Point p){
		this.x=p.x;
		this.y=p.y;
	}
	public void Copy(Point p){
		this.x=p.x;
		this.y=p.y;
	}
	@Override
	public String toString() {
		return "["+this.x+","+this.y+"]";
	}
}
public static void generate_file(String fileName,int quantity,int range) {
	Random rand = new Random();
	String text ="";
	try {
		for(int i =0;i<quantity;i++) {
			text+="["+rand.nextInt(range)+","+rand.nextInt(range)+"]"+"\n";
		}
		write(fileName,text);
		System.out.println(fileName+" CREATION SUCCESS!");
	}catch(Exception e) {
		throw new RuntimeException(e);
	}
}
public static ArrayList<Point> read_points(String fileName) {
	ArrayList<Point> points = new ArrayList<Point>();
	File file = new File(fileName);
	Ex_1 e=new Ex_1();
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				while((s=in.readLine())!=null) {
					s=s.replaceAll("[\\[\\]]","");
					String[] vals = s.split(",");
					Point p = e.new Point(Integer.parseInt(vals[0]),
							Integer.parseInt(vals[1])
							);
					points.add(p);
				}
				for(Point p:points) {
					System.out.println(p.toString());
				}
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	return points;
}
public static double get_distance(Point p1,Point p2) {
	double distance =0.0;
	double x=(double)(p2.x-p1.x);
	double y=(double)(p2.y-p1.y);
	distance = Math.sqrt(x*x + y*y);
	return distance;
}
public class Distance{
	public Point p1;
	public Point p2;
	double distance;
	Distance(){}
	Distance(Point p1,Point p2){
		this.p1=p1;
		this.p2=p2;
		this.distance = get_distance(p1,p2);
	}
}
public static Point nearest_point(ArrayList<Point> points) {
	Ex_1 e = new Ex_1();
	Point p1_min = e.new Point();
	double min_d=-1;
	Point center = e.new Point(0,0);
	for(int i =0;i<points.size();i++) {
		Point p = e.new Point(points.get(i));
		double cur_d = get_distance(center,p);
		if(min_d<0||cur_d<min_d) {
			min_d=cur_d;
			p1_min.Copy(p);
		}
	}
	return p1_min;
}
public static Point farest_point(ArrayList<Point> points) {
	Ex_1 e = new Ex_1();
	Point p1_max = e.new Point();
	double max_d=-1;
	Point center = e.new Point(0,0);
	for(int i =0;i<points.size();i++) {
		Point p = e.new Point(points.get(i));
		double cur_d = get_distance(center,p);
		if(max_d<0||cur_d>max_d) {
			max_d=cur_d;
			p1_max.Copy(p);
		}
	}
	return p1_max;
}
public static void ex_8() {
	Ex_1 e = new Ex_1();
	String fileName = "D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\bin\\ex8.txt";
	ArrayList<Point> points = new ArrayList<Point>(read_points(fileName));
	Point p1_min = e.new Point();
	Point p2_min = e.new Point();
	Point p1_max = e.new Point();
	Point p2_max = e.new Point();
	double min_d = -1;
	double max_d = -1;
	for(int i = 0; i < points.size()-1;i++) {
		Point p1=e.new Point(points.get(i));
		for(int j = i;j<points.size();j++) {
			Point p2=e.new Point(points.get(i+1));
			double cur_d = get_distance(p1,p2);
			if(min_d<0||cur_d<min_d) {
				min_d=cur_d;
				p1_min.Copy(p1);
				p2_min.Copy(p2);
			}
			if(max_d<0||cur_d>max_d) {
				max_d=cur_d;
				p1_max.Copy(p1);
				p2_max.Copy(p2);
			}
		}
		
	}
	Point p0 = e.new Point(0,0);
	System.out.println("Минимальная дистанция между точками : ("+p1_min.toString() +" , "+p2_min.toString()+") = "+min_d);
	System.out.println("Максимальная дистанция между точками : ("+p1_max.toString() +" , "+p2_max.toString()+") = "+max_d);
	System.out.println("Самая дальняя точка от начала координат : ("+farest_point(points).toString()+") = "+get_distance(p0,farest_point(points)));
	System.out.println("Самая ближняя точка к началу координат : ("+nearest_point(points).toString()+") = "+get_distance(p0, nearest_point(points)));
	
}
public static char[][] text_to_matrix(ArrayList<String> text){
	char[][] matrix = new char[text.size()][Collections.max(text).length()+1];
	int m = Collections.max(text).length();
	for(int i =0; i < matrix.length;i++) {
		for(int j = 0; j < matrix[0].length;j++) {
			matrix[i][j]=' ';
		}
	}
	for(int i =0;i<text.size();i++) {
		char[] tmp = text.get(i).toCharArray();
		for(int j =0;j<tmp.length;j++) {
			matrix[i][j]=tmp[j];
		}
	}
	
	for(int i =0; i < matrix.length;i++) {
		for(int j = 0; j < matrix[0].length;j++) {
			System.out.print(matrix[i][j]+"|");
		}
		System.out.println();
	}
	
	return matrix;
}
public static char[][] crypt(char[][] matrix){
	char[][] retVal = new char[matrix[0].length][matrix.length];
	for(int i = 0;i<matrix.length;i++) {
		for(int j = 0; j < matrix[0].length;j++) {
			retVal[j][i]=matrix[i][j];
		}
	}
	System.out.println();
	for(int i = 0 ; i < retVal.length; i++) {
		for(int j = 0; j < retVal[0].length;j++) {
			System.out.print(retVal[i][j]+"|");
		}
		System.out.println();
	}
	return retVal;
}
public static ArrayList<String> matrix_to_text(char[][] matrix){
	ArrayList<String> retVal = new ArrayList<String>();
	for(int i = 0 ; i < matrix.length;i++) {
		String str = "";
		for(int j = 0; j < matrix[0].length;j++) {
			str+=matrix[i][j];
		}
		str.trim();
		retVal.add(str);
	}
	System.out.println();
	for(String s:retVal) {
		System.out.println(s);
	}
	return retVal;
}
public static ArrayList<String> read_text(String fileName){
	ArrayList<String> retval = new ArrayList<String>();
	File file = new File(fileName);
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				while((s=in.readLine())!=null) {
	
					retval.add(s);
				}
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	return retval;
}
public static String create_crypt_file(String fileName) {
	ArrayList<String> text=read_text(fileName);
	char[][] matrix = text_to_matrix(text);
	matrix=crypt(matrix);
	text=matrix_to_text(matrix);
	String arg_fileName = fileName;
	String[] path = fileName.split("\\\\");
	String name = path[path.length-1];
	name=name.substring(0, name.length()-4);
	path[path.length-1]=name+"-crypted.txt";
	fileName="";
	for(String p:path) {
		fileName+=p+"\\";
	}
	
	String result = "";
	for(String line:text) {
		result+=line+"\n";
	}
	write(fileName,result);
	System.out.printf("Файл : %s успешно зашифрован.%nЗашифрованный файл :%s",arg_fileName,fileName);
	return fileName;
}
public static String create_encrypt_file(String fileName) {
	ArrayList<String> text=read_text(fileName);
	char[][] matrix = text_to_matrix(text);
	matrix=crypt(matrix);
	text=matrix_to_text(matrix);
	
	String arg_fileName = fileName;
	String[] path = fileName.split("\\\\");
	String name = path[path.length-1];
	name=name.substring(0, name.length()-4);
	path[path.length-1]=name+"-encrypted.txt";
	fileName="";
	for(String p:path) {
		fileName+=p+"\\";
	}
	
	String result = "";
	for(String line:text) {
		result+=line+"\n";
	}
	write(fileName,result);
	System.out.printf("Файл : %s успешно расшифрован.%nРасшифрованный файл :%s",arg_fileName,fileName);
	return fileName;
}
public static void ex_9(String fileName) {
	String crypted_file=create_crypt_file(fileName);
	String encrypted_file = create_encrypt_file(crypted_file);
	
}
public class Student{
	public String name;
	public ArrayList<Integer> evaluation;
	public double average_evaluation;
	
	Student(){
		this.name = "UNDEFINED";
		this.evaluation=new ArrayList<Integer>();
		this.average_evaluation=0.0;
	}
	Student(String name,ArrayList<Integer> marks){
		this.name=name;
		this.evaluation.addAll(marks);
		for(int i:this.evaluation) {
			this.average_evaluation+=(double)i;
		}
		this.average_evaluation=this.average_evaluation/((double)this.evaluation.size());
	}
	Student(Student newStudent){
		this.name=newStudent.name;
		this.evaluation.addAll(newStudent.evaluation);
		this.average_evaluation=newStudent.average_evaluation;
	}
}
public static void good_student(Student st) {
	if(st.average_evaluation>=4.0) {
		st.name=st.name.toLowerCase();
	}
}
public void read_students(String fileName) {
	
}
public static void ex_10(String fileName,int n) {
	ArrayList<String> text = new ArrayList<String>();
	File file = new File(fileName);
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s="";
				while((s=in.readLine())!=null) {
					if(!s.isEmpty()||!s.matches("\\S+")||!(s.substring(0,1).matches("$|[\n]"))) {
						if(s.length()==n) {
						text.add(s);
						}
						else {
							if(s.length()<n) {
							for(int i=s.length()-1;i<n;i++) {
								s+="0";
							}
							text.add(s);
							}
							else {
								text.add(s.substring(0,n-1));
							}
						}
					}
				}
				for(String w:text) {
					System.out.println(w);
				}
				
				String[] path = fileName.split("\\\\");
				String name = path[path.length-1];
				
				name=name.substring(0, name.lastIndexOf('.'));
				path[path.length-1]=name+"-result.txt";
				fileName="";
				for(String p:path) {
					fileName+=p+"\\";
				}
				String str="";
				for(String token:text) {
					str+=token+"\n";
				}
				write(fileName,str);
				System.out.println("File :"+fileName+" creation success!");
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
public static void ex_14(String fileName,int n) {
	ArrayList<String> text = new ArrayList<String>();
	File file = new File(fileName);
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s="";
				while((s=in.readLine())!=null) {
					if(!s.isEmpty()) {
						if(s.length()>n) {
						text.add(s);
						}
						else {
							if(s.length()<=n) {
							String tmp="";
							for(int i=0;i<n-s.length();i++) {
								tmp+=" ";
							}
							tmp+=s;
							text.add(tmp);
							}
						}
					}
				}
				for(String w:text) {
					System.out.println(w);
				}
				
				String[] path = fileName.split("\\\\");
				String name = path[path.length-1];
				
				name=name.substring(0, name.lastIndexOf('.'));
				path[path.length-1]=name+"-result.txt";
				fileName="";
				for(String p:path) {
					fileName+=p+"\\";
				}
				String str="";
				for(String token:text) {
					str+=token+"\n";
				}
				write(fileName,str);
				System.out.println("File :"+fileName+" creation success!");
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
public static void test(String fileName,int n) {
	ArrayList<String> retval = new ArrayList<String>();
	File file = new File(fileName);
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				while((s=in.readLine())!=null) {
					if(!retval.isEmpty()) {
					retval.add(s);
					}
				}
				for(String t:retval) {
					System.out.println(t);
				}
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
public static boolean isInteger(String s) {
	try {
		Integer.parseInt(s);
		return true; 
	}catch(Exception e) {
		return false;
		}
}
public static boolean isDouble(String s) {
	try {
		Double.parseDouble(s);
		return true; 
	}catch(Exception e) {
		return false;
		}
}
public static String get_numbers(String[] tokens,int line_index) {
	String retval="";
	for(String tmp:tokens) {
		tmp=tmp.replace(",", ".");
		if(isInteger(tmp) || isDouble(tmp)) {
			retval+="число "+tmp+" - строка №"+line_index+", ";
		}
	}
	return retval;
}
public static void ex_15(String fileName) {
	String result="";
	File file = new File(fileName);
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				int line_index=0;
				while((s=in.readLine())!=null) {
					String[] tokens = s.split("\\s+");
					System.out.println(line_index+"###"+result);
					result+=get_numbers(tokens,line_index++);
			
				}
				
				String[] path = fileName.split("\\\\");
				String name = path[path.length-1];
				
				name=name.substring(0, name.lastIndexOf('.'));
				path[path.length-1]=name+"-result.txt";
				fileName="";
				for(String p:path) {
					fileName+=p+"\\";
				}
				
				write(fileName,result);
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
public class telBook{
	public String telNum="";
	public String Name="";
	
@Override
public String toString() {
	String retval = "["+this.Name + " - "+this.telNum+"]";
	return retval;
}
}
public static void readTelephones(String fileName){
	File file = new File(fileName);
	Ex_1 e = new Ex_1();
	if(file.exists()) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s = "";
				ArrayList<telBook> db=new ArrayList<telBook>();
				
				while((s=in.readLine())!=null) {
					String[] tokens = s.split("[\\s,|.:;]+");
					String tNum="";
					String tName="";
					for(String t:tokens) {
						if(t.matches("[0-9-\\s]+")) {
							tNum+=t;
						}
						else {
							tName+=t;
						}
					}
					telBook temp=e.new telBook();
					temp.Name=tName;
					temp.telNum=tNum;
					db.add(temp);
				}
				
				String result="";
				for(telBook t:db) {
					System.out.println(t);
					if(t.Name.matches("[CK].+")) {
						result+=t.Name+" - "+t.telNum+"\n";
					}
					
				}
			
				System.out.println("Result###\n"+result);
				String[] path = fileName.split("\\\\");
				String name = path[path.length-1];
				
				name=name.substring(0, name.lastIndexOf('.'));
				path[path.length-1]=name+"-result.txt";
				fileName="";
				for(String p:path) {
					fileName+=p+"\\";
				}
				
				write(fileName,result);
			}finally {
				in.close();
			}
		}catch(IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
public static void ex_17(String fileName) {
	readTelephones(fileName);
}
public static void ex_18(String fileName) {
	int[][] matrix=get_matrix( read_text(fileName) );
	matrix=transponate(matrix);
	show_matrix(matrix);
}
public static int[][] get_matrix(ArrayList<String> text) {
	int[][] matrix = new int[text.size()][Collections.max(text).length()+1];
	for(int i = 0; i < matrix.length;i++) {
		for(int j=0;j<matrix.length;j++) {
			matrix[i][j]=0;
		}
	}
	int indx =0;
	for(String line:text) {
		String[] nums = line.split("[\\s,;:-|]+");
		int[] row = new int[nums.length];
		int index=0;
		for(String n:nums) {
			int number = Integer.parseInt(n);
			row[index++]=number;
		}
		matrix[indx++]=row;
	}
	System.out.println();
	for(int i = 0; i < matrix.length;i++) {
		for(int j=0;j<matrix[0].length;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
	return matrix;
}
public static int[][] transponate(int[][] matrix) {
	int n = matrix.length;
	int m = matrix[0].length;
	int[][] a = new int[m][n];
	for( int i = 0;i<n;i++) {
		for(int j = 0;j<m;j++) {
			a[j][i]=matrix[i][j];
		}
	}
	return a;
}
public static void show_matrix(int[][] matrix) {
	System.out.println();
	for(int i = 0; i < matrix.length;i++) {
		for(int j=0;j<matrix[0].length;j++) {
			System.out.printf("%3d ",matrix[i][j]);
		}
		System.out.println();
	}
}
public static ArrayList<String> read_log(String fileName){
	ArrayList<String> log = new ArrayList<String>();
	File file = new File(fileName);
	
	try {
		BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
		try {
			String s="";
			while((s=in.readLine())!=null) {
				//берем строки из лога, которые начинаются с ip
				if( s.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}.+") ) {
					log.add(s);
				}
			}
		}finally {
			in.close();
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		

	
/*	System.out.println("---LOG START--------------------------------------------------------------------------------------------------------------------------------------------------------");
	for(String s:log) {
		System.out.println(s);
	}
	System.out.println("---LOG END--------------------------------------------------------------------------------------------------------------------------------------------------------");
*/
	return log;
}
public static ArrayList<String> read_log(String[] fileNames){
	ArrayList<String> log = new ArrayList<String>();
	for(String fileName:fileNames) {
		File file = new File(fileName);
	
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			try {
				String s="";
				while((s=in.readLine())!=null) {
					//берем строки из лога, которые начинаются с ip
					if( s.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}.+") ) {
						log.add(s);
					}
				}
			}finally {
				in.close();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	return log;
}
public static HashSet<String> get_ipSet(ArrayList<String> log) {
	HashSet<String> ipSet = new HashSet<String>();
	for(String line:log) {//собираем уникальные ip в hashset
		String[] tokens=line.split("[\\s-]+");
		for(String t:tokens) {
			if(t.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}.+")) {
				ipSet.add(t);
				break;
			}
		}
	}
	System.out.println("---LOG IP_SET START--------------------------------------------------------------------------------------------------------------------------------------------------------");
	for(String s:ipSet) {
		System.out.println(s);
	}
	System.out.println("---LOG IP_SET END--------------------------------------------------------------------------------------------------------------------------------------------------------");

	return ipSet;
}
public static int ip_connetctions_counter(ArrayList<String> log,String ip) {
	int counter=0;
	for(String line:log) {
		if(line.startsWith(ip)) {
			counter++;
		}
	}
	return counter;
}
public static String ip_day_frequency(ArrayList<String> log,String ip) {
	ArrayList<String> temp = new ArrayList<String>();
	int counter=0;
	String retval="";
	
	for(String line:log) {//в темп запишем только строки с нужным ip
		if(line.startsWith(ip)) {
			temp.add(line);
		}
	}
	/*System.out.println("---LOG IP_SET_FROM IP_DAY_FREQUENCY START--------------------------------------------------------------------------------------------------------------------------------------------------------");
	for(String s:temp) {
		System.out.println(s);
	}
	System.out.println("---LOG IP_SET_FROM IP_DAY_FREQUENCY END--------------------------------------------------------------------------------------------------------------------------------------------------------");
	*/
	String s_date="";
	ArrayList<String> dates=new ArrayList<String>();
	HashSet<String> date = new HashSet<String>();
	for(String line:temp) {
		String[] tokens = line.split("[-\\s]+");
		for(String t:tokens) {
			if(t.startsWith("[")){
				t=t.replaceAll("[\\[\\]]","");
				s_date=t.substring(0, t.indexOf(':'));
				date.add(s_date);
				dates.add(s_date);
			}
		}
	}
	
	for(String d:date) {
		System.out.println(ip+"["+d+"]");
		int tmp=Collections.frequency(dates, d);
		System.out.println("tmp#frequency#"+tmp);
		if(tmp>counter) {
			retval=d;
			retval+="#Количество: "+tmp;
			System.out.println(retval);
			counter=tmp;
		}
	}
	
	return retval;
}
public static String ip_hour_frequency(ArrayList<String> log,String ip) {
	ArrayList<String> temp = new ArrayList<String>();
	String retval="";
	int max=0;
	
	for(String line:log) {//в темп запишем только строки с нужным ip
		if(line.startsWith(ip)) {
			temp.add(line);
		}
	}
	String s_hour="";
	ArrayList<String> hours = new ArrayList<String>();
	HashSet<String> date = new HashSet<String>();
	for(String line:temp) {
		String[] tokens = line.split("[-\\s]+");
		for(String t:tokens) {
			if(t.startsWith("[")){
				t=t.replaceAll("[\\[\\]]","");
				s_hour=t.substring(0, (t.indexOf(':')+3));//дата+час - 03/Dec/2018:11:
				date.add(s_hour);
				hours.add(s_hour);
			}
		}
	}
	for(String d:date) {
		int tmp=Collections.frequency(hours, d);
		if(tmp>max) {
			max=tmp;
			retval=d+"ч.#количество: "+max;
		}
	}
	
	return retval;
}
public static ip_stat[] get_ip_stat(HashSet<String> ipSet,ArrayList<String> log) {
	ip_stat[] retval = new ip_stat[ipSet.size()];
	Ex_1 e = new Ex_1();
	int i = 0 ;
	for(String s_ip:ipSet) {
		retval[i]=e.new ip_stat();
		retval[i].ip=s_ip;
		retval[i].connections=ip_connetctions_counter(log, s_ip);
		retval[i].frqDate=ip_day_frequency(log, s_ip);
		retval[i].frqTime=ip_hour_frequency(log, s_ip);
		System.out.println("\n"+retval[i++]);
	}
	return retval;
}
public static void parse_logs(String fileName) {
	ArrayList<String> log = read_log(fileName);
	HashSet<String> ipSet=get_ipSet(log);
	ip_stat[] statistic=get_ip_stat(ipSet,log);

	String result="";
	for(ip_stat iter:statistic) {
		System.out.println(iter);
		result+=iter.toString()+"\n";
	}
	write(modify_name_to_result(fileName),result);
}
public static void parse_logs(String[] fileNames) {
	ArrayList<String> log = read_log(fileNames);
	HashSet<String> ipSet=get_ipSet(log);
	ip_stat[] statistic=get_ip_stat(ipSet,log);

	String result="";
	for(ip_stat iter:statistic) {
		System.out.println(iter);
		result+=iter.toString()+"\n";
	}

	//write(modify_name_to_result(fileNames[0]),result);
	write("D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\LOGS_STATISTICS.txt",result);
}

public static String modify_name_to_result(String fileName) {
	String[] path = fileName.split("\\\\");
	String name = path[path.length-1];
	
	name=name.substring(0, name.lastIndexOf('.'));
	path[path.length-1]=name+"-result.txt";
	String retval="";
	for(String p:path) {
		retval+=p+"\\";
	}
	return retval;
}
public static void file_dir_test() {
        
        // определяем объект для каталога
        File dir = new File("D:\\\\\\\\Users\\\\\\\\mindybaev\\\\\\\\eclipse-workspace\\\\\\\\Задачи на файлы\\\\\\\\bin");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){
              
                 if(item.isDirectory()){
                      
                     System.out.println(item.getName() + "  \t folder");
      
                 }
                 else{
                      
                     System.out.println(item.getName() + "\t file");
                 }
             }
        }
   }
public static void parse_logs_in_dir(String dirName) {
	 File dir = new File(dirName);
	 ArrayList<String> fNames=new ArrayList<String>();
     // если объект представляет каталог
     if(dir.isDirectory())
     {
         // получаем все вложенные объекты в каталоге
         for(File item : dir.listFiles()){
           
        	 if(item.isFile()) {
        		 fNames.add(item.getAbsolutePath());
        	 }
          }
     }
    String[] fileNames = new String[fNames.size()];
    int i = 0;
    for(String fName:fNames) {
    	fileNames[i]=fName;
    	System.out.println(fileNames[i++]);
     }
    parse_logs(fileNames);
    
}


public static ArrayList<String> Read_matrix(String fileName){
	ArrayList<String> arr = new ArrayList<String>();
	File file = new File(fileName);
	try {
		BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
		try {
			String s="";
			while((s=in.readLine())!=null) {
				//берем строки из лога, которые начинаются с ip
				if( s.matches("[0-9]+") || isInteger(s)) {
					arr.add(s);
				}
			}
		}finally {
			in.close();
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return arr;
}
public static int[][] fetch_matrix(ArrayList<String> arr){
	int size = (int) Math.floor( Math.sqrt( (double) arr.size() ) );
	int[][]matrix = new int[size][size];
	int index=0;
	for(int i=0;i<size;i++) {
		for(int j = 0 ; j < size;j++) {
			matrix[i][j]=Integer.parseInt(arr.get(index++));
		}
	}
	return matrix;
}
public static int[][] rotate_90(int[][] matrix){
	int[][] retval = new  int[matrix.length][matrix[0].length];
	
	for(int i = 0 ; i < matrix.length;i++) {
		for(int j = 0;j<matrix[0].length;j++) {
			retval[j][matrix.length-i-1]=matrix[i][j];
		}
	}
	
	return retval;
}
public static void ex_19(String fileName) {
	int[][] matrix=fetch_matrix(Read_matrix(fileName));
	show_matrix(matrix);
	System.out.println("\nПоворот на 90 :");
	show_matrix(rotate_90(matrix));
	System.out.println("\nПоворот на 90 :");
	show_matrix(rotate_90(rotate_90(matrix)));
	System.out.println("\nПоворот на 90 :");
	show_matrix(rotate_90(rotate_90(rotate_90(matrix))));
	System.out.println("\nПоворот на 90 :");
	show_matrix(rotate_90(rotate_90(rotate_90(rotate_90(matrix)))));
}

public static void main(String[] args) {
	//ex_14("D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex14.txt",100);
	//ex_18("D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex18.txt");
	/*String[] fileNames = {"D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex21_0.txt",
			"D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex21_1.txt",
			"D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex21_2.txt",
			"D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex21_3.txt",
			"D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex21_4.txt",
			"D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex21_5.txt"};*/
	//parse_logs("D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex_21.txt");
	//parse_logs(fileNames);
	//file_dir_test();
	
//	parse_logs_in_dir("D:\\Users\\mindybaev\\eclipse-workspace\\Задачи на файлы\\logs_to_parse");
	ex_19("D:\\\\Users\\\\mindybaev\\\\eclipse-workspace\\\\Задачи на файлы\\\\bin\\\\ex_19.txt");
}

}
