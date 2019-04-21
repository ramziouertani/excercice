package org.my.ex;

import java.util.List;
import java.util.stream.Collectors;


public class Concurrency {

		
		public List<Object> fetchListDataSet(List<String> ids)
		{
			Backend backend = new Backend();
			List<Object> objectList = ids.parallelStream().map(id -> backend.fetchObject(id)).collect(Collectors.toList());
			
			return objectList;
			
		}
		
		class Backend
		{
			public  Object fetchObject(String id)
			{
				return new Object();
			}
		}
		
}
