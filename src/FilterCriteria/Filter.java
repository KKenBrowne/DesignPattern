package FilterCriteria;

import java.util.List;

public interface Filter {  
	   // ���ݴ�������Person�б�����һ�����������ˣ��õ�Ŀ�꼯��  
	   List<Person> filter(List<Person> persons);  
	}  