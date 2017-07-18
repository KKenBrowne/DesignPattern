package FilterCriteria;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();  
	      persons.add(new Person("霍一", "FEMALE", "MARRIED"));  
	      persons.add(new Person("邓二", "MALE", "MARRIED"));  
	      persons.add(new Person("张三", "MALE", "SINGLE"));  
	      persons.add(new Person("李四", "FEMALE", "MARRIED"));  
	      persons.add(new Person("王五", "MALE", "SINGLE"));  
	      persons.add(new Person("赵六", "FEMALE", "SINGLE"));  
	      persons.add(new Person("孙七", "MALE", "SINGLE"));  
	      persons.add(new Person("罗八", "MALE", "MARRIED"));  
	      persons.add(new Person("刘九", "FEMALE", "SINGLE"));  
	      persons.add(new Person("史十", "FEMALE", "SINGLE"));  
	      
	      
	      List<Person> FemaleList =  new FemaleFilter().filter(persons);
	      //System.out.println(FemaleList);
	      
	      List<Person> and =  new FilterOr(new FemaleFilter(),new MaleFilter()).filter(persons);
	      System.out.println(and);
	}

}
