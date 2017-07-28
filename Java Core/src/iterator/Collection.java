package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Collection implements Iterator<Object> {
	private Object[] array;
	 private int count = array.length;


	
	public Collection(Object[] array) {
		this.array = array;
	}
	

	public Object[] getObjarray() {
		return array;
	}
	public void setObjarray(Object[] objarray) {
		this.array = objarray;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}



//	public class First implements Iterator<Object>{
//
//
//		@Override
//		public void hasNext() {
//			for (int i = 0; i < count; i++) {
//				System.out.println(array[i]);
//			}
//		}
//
//		@Override
//		public void next() {
//			for (int i = 0; i < count; i++) {
//				if(i%2!=0){
//					array[i]=0;
//				}
//					System.out.println(array[i]);
//			}
//		}
//		
//
//		}
//	
	public class Second implements Iterator<Object>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}

		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
