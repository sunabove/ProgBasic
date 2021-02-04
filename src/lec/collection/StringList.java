package lec.collection;

import java.util.Collection;

public class StringList extends java.util.ArrayList<String>{

	private static final long serialVersionUID = -5238731462108700329L;
	
	public StringList() {
		super();
	}
	
	public StringList(int initialCapacity) {
		super( initialCapacity );
		
	}
	
	public StringList(Collection<? extends String> c) {
		super( c );
	}
	
	public int length() {
		return super.size();
	}
	
}
