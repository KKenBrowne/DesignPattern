package FilterCriteria;

import java.util.ArrayList;
import java.util.List;

public class FemaleFilter implements Filter {

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> result = new ArrayList<Person>();
		for(Person person:persons)
		{
			if("FEMALE".equalsIgnoreCase(person.getGender()))
			{
				result.add(person);
			}
		}
		return result;
	}

}