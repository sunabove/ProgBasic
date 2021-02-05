package lec.pattern;

import java.util.Iterator;

class Range implements Iterable<Integer> {

	private int limit;

	public Range(int limit) {
		this.limit = limit;
	}

	@Override
	public Iterator<Integer> iterator() {
		final int max = limit;
		return new Iterator<Integer>() {

			private int current = 0;

			@Override
			public boolean hasNext() {
				return current < max;
			}

			@Override
			public Integer next() {
				if (hasNext()) {
					return current++;
				} else {
					throw new java.util.NoSuchElementException("Range reached the end");
				}
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Can't remove values from a Range");
			}
		};
	}
	
	public static void main(String [] args) {
		for (int i : new Range(5)) {
	        System.out.println(i);
	    }
		
		new Range(5).forEach( n -> { System.out.println(n); } );
	}
}