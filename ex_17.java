import java.util.ArrayList;
import java.util.Random;

/*
 * Класс Покупатель: Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета; 
 * Конструктор;
 *  Методы: установка значений атрибутов, получение значений атрибутов, вывод информации. 
 *  Создать массив объектов данного класса. 
 * Вывести список покупателей в алфавитном порядке и список покупателей,
 *  у которых номер кредитной карточки находится в заданном диапазоне.
 * 
 */
public class ex_17 {
	final String DEFAULT="Undefined";
	final String[] Names= {"John","Pablo","Rick","Bob","William","Charles","Ray"};
	final String[] Surnames = {"Tompson","Jackson","Jefferson","Jordan","Huares","Jameson"};
	final String[] Addresses= {"a1","a2","a3","a4","a5"};
	
public class customer implements Comparable<customer>{
	String surname="Undefined";
	String name = "Undefined";
	String secondName="Undefined";
	String address="undefined";
	int cardNumber=-1;
	int bankAccountNumber=-1;
	
	customer(){}
	customer(String surname){
		this.surname=surname;
		
	}
	customer(String surname,String name){
		this.surname=surname;
		this.name=name;
	}
	customer(String surname,String name,String secondName){
		this.surname=surname;
		this.name=name;
		this.secondName=secondName;
	}
	customer(String surname,String name,String secondName,String address){
		this.surname=surname;
		this.name=name;
		this.secondName=secondName;
		this.address=address;
	}
	customer(String surname,String name,String secondName,String address,int cardNumber){
		this.surname=surname;
		this.name=name;
		this.secondName=secondName;
		this.address=address;
		this.cardNumber=cardNumber;
	}
	customer(String surname,String name,String secondName,String address,int cardNumber,int bankAccountNumber){
		this.surname=surname;
		this.name=name;
		this.secondName=secondName;
		this.address=address;
		this.cardNumber=cardNumber;
		this.bankAccountNumber=bankAccountNumber;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSecondName(String seconName) {
		this.secondName=secondName;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setCardNumber(int cardnum) {
		this.cardNumber=cardnum;
	}
	public void setBankAccountNumber(int num) {
		this.bankAccountNumber=num;
	}
	public String get_surname() {
		return this.surname;
	}
	public String get_name() {
		return this.name;
	}
	public String get_secondName() {
		return this.secondName;
	}
	public String get_address() {
		return this.address;
	}
	public int get_cardNumber() {
		return this.cardNumber;
	}
	public int get_BankAccountNumber() {
		return this.bankAccountNumber;
	}
	@Override 
	public String toString() {
		String retval="";
		retval="[Surname: "+this.surname+", Name: "+this.name+", SecondName: "+ this.secondName+", Address: "+this.address+", Credit Card Number №"+
				this.cardNumber+" , Bank Account Number №"+this.bankAccountNumber+"]";
		return retval;
	}
	public void randomize() {
	Random rand = new Random();
	this.name=Names[rand.nextInt(Names.length)];
	this.surname=Surnames[rand.nextInt(Surnames.length)];
	this.address=Addresses[rand.nextInt(Addresses.length)];
	this.cardNumber=rand.nextInt(1000000000);
	this.bankAccountNumber=rand.nextInt(1000000000);
	
	}
	public void Copy(customer c2) {
		this.surname=c2.surname;
		this.name=c2.name;
		this.secondName=c2.secondName;
		this.address=c2.address;
		this.cardNumber=c2.cardNumber;
		this.bankAccountNumber=c2.bankAccountNumber;
	}
	public int compareTo(customer c) {
		return this.name.compareTo(c.get_name());
	}

}
	public static customer[] filter_CardNumber(customer[] customersList,int range1,int range2) {
		ArrayList<customer> tmp = new ArrayList<customer>();
		ex_17 e = new ex_17();
		for(customer c:customersList) {
		if(c.get_cardNumber()>=range1 && c.get_cardNumber()<=range2) {
				tmp.add(c);
			}
		}
		customer[] retval = new customer[tmp.size()];
		for(int i=0;i<tmp.size();i++) {
			retval[i]=e.new customer();
			retval[i].Copy(tmp.get(i));
		}
		return retval;
	}
	public void swap_customers(customer c1,customer c2) {
		customer tmp = new customer();
		tmp.Copy(c1);
		c1.Copy(c2);
		c2.Copy(tmp);
	}
	public static void sort_buble(customer[] c) {
		ex_17 e= new ex_17(); 
		customer min = e.new customer();
		
		for(int j = c.length-1;j>=0;j--) {
			for(int i=0;i<c.length-1;i++) {
				if(c[i].get_name().compareTo(c[i+1].get_name())>0) {
					e.swap_customers(c[i],c[i+1]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex_17 e = new ex_17();
		
		customer[] customersList = new customer[100];
		for(int i = 0 ; i < customersList.length;i++) {
			customersList[i]=e.new customer();
			customersList[i].randomize();
		}
		System.out.println("----------------------------------------------------------------"
				+ "------------------------------------------------------------------------------------------");
		

		customer[] task1=e.filter_CardNumber(customersList,844476144,900000000);
		sort_buble(task1);
		for(customer c:task1) {
			System.out.println(c);
		}
		System.out.println("----------------------------------------------------------------"
				+ "------------------------------------------------------------------------------------------");
		sort_buble(customersList);
		for(customer c:customersList) {
			System.out.println(c);
		}
	}

}
