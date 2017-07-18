package FilterCriteria;

import java.util.List;

//ANDÂß¼­µÄFilter
public class FilterAnd implements Filter{
	private Filter filter;
	private Filter otherFilter;
	
	
	public FilterAnd(Filter filter,Filter otherFilter) {
		this.filter = filter;
		this.otherFilter = otherFilter;
	}

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> tmpList = filter.filter(persons);
		return otherFilter.filter(tmpList);
	}

}
