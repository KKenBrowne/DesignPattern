package FilterCriteria;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();  
	      persons.add(new Person("��һ", "FEMALE", "MARRIED"));  
	      persons.add(new Person("�˶�", "MALE", "MARRIED"));  
	      persons.add(new Person("����", "MALE", "SINGLE"));  
	      persons.add(new Person("����", "FEMALE", "MARRIED"));  
	      persons.add(new Person("����", "MALE", "SINGLE"));  
	      persons.add(new Person("����", "FEMALE", "SINGLE"));  
	      persons.add(new Person("����", "MALE", "SINGLE"));  
	      persons.add(new Person("�ް�", "MALE", "MARRIED"));  
	      persons.add(new Person("����", "FEMALE", "SINGLE"));  
	      persons.add(new Person("ʷʮ", "FEMALE", "SINGLE"));  
	      
	      
	      List<Person> FemaleList =  new FemaleFilter().filter(persons);
	      //System.out.println(FemaleList);
	      
	      List<Person> and =  new FilterOr(new FemaleFilter(),new MaleFilter()).filter(persons);
	      System.out.println(and);
	}

}
