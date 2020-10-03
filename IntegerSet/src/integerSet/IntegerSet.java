package integerSet;
import java.util.ArrayList;
/**
 * 
 * @author nabilm.twymanjr.
 *
 */
public class IntegerSet {
	public ArrayList<Integer> iSet = new ArrayList<Integer>();
	
	/**
	 * Clears IntegerSet
	 */
	public void clear(){
		iSet.clear();
	}
	
	/**
	 * Returns length of IntegerSet instance
	 * @return length of IntegerSet instance
	 */
	public int length(){
		return iSet.size();
	}
	
	/**
	 * Compares current IntegerSet instance with another IntegerSet instance.
	 * 
	 * Determines if two instances are equal.
	 * @param b	the second IntegerSet.
	 * @return true if instance is equal to current instance. Otherwise returns false.
	 */
	public boolean equals(IntegerSet b){
		String bString = b.toString();
		if(bString.equals(this.toString())) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if instance contains specified value
	 * @param value	The value to check for
	 * @return true if value is in instance, false if not
	 */
	public boolean contains(int value){
		for(int i=0; i < this.length(); i++) {
			if(iSet.get(i)== value) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Finds the largest integer in the set
	 * @return the largest integer in the IntegerSet
	 * @throws IntegerSetException integerSet is empty
	 */
	public int largest()throws IntegerSetException{
		if(this.length() == 0) {
			throw new IntegerSetException("Integer Set is empty");
		}
		int largestInt = 0;
		for(int i = 0; i < this.length(); i++) {
			if(i == 0) {
				largestInt = iSet.get(i);
			}else {
				if(iSet.get(i) > largestInt) {
					largestInt = iSet.get(i);
				}
			}
		}
		return largestInt;
	}
	
	/**
	 * Finds the smallest integer in the set
	 * @return the smallest integer in the IntegerSet
	 * @throws IntegerSetException	IntegerSet is empty
	 */
	public int smallest()throws IntegerSetException{
		if(this.length() == 0) {
			throw new IntegerSetException("Integer Set is empty");
		}
		int smallestInt = 0;
		for(int i = 0; i < this.length(); i++) {
			if(i == 0) {
				smallestInt = iSet.get(i);
			}else {
				if(iSet.get(i) < smallestInt) {
					smallestInt = iSet.get(i);
				}
			}
		}
		return smallestInt;
	}
	
	/**
	 * Adds item to integerSet
	 * @param item	integer value that will be added to IntegerSet
	 */
	public void add(int item){
		iSet.add(item);
	}
	
	/**
	 * Adds an item to the IntegerSet
	 * @param item	Item that will be added to the IntegerSet
	 */
	public void remove(int item){
		iSet.remove(item);
	}
	
	/**
	 * Adds elements of another instance that are not found in this instance.
	 * @param intSetb Another instance of IntegerSet
	 */
	public void union(IntegerSet intSetb){
		for(int i = 0; i < intSetb.length(); i++) {
			if(!iSet.contains(intSetb.iSet.get(i))) {
				this.add(intSetb.iSet.get(i));
			}
		}
	}
	
	/**
	 * Creates a new IntegerSet from an intersection between two sets.
	 * @param intSeta one of Two IntegerSet instances used in intersection
	 * @param intSetb one of Two IntegerSet instances used in intersection
	 * @return new IntegerSet
	 */
	public static IntegerSet intersect(IntegerSet intSeta, IntegerSet intSetb){
		IntegerSet iSect = new IntegerSet();
		for(int i = 0; i < intSetb.length(); i++) {
			if(intSeta.contains(intSetb.iSet.get(i))) {
				iSect.add(intSetb.iSet.get(i));
			}
		}
		return iSect;
	}
	
	/**
	 * Creates a new IntegerSet from an difference between two sets.
	 * @param intSeta one of Two IntegerSet instances used in subtraction
	 * @param intSetb one of Two IntegerSet instances used in subtraction
	 * @return new IntegerSet
	 */
	public static IntegerSet diff(IntegerSet intSeta, IntegerSet intSetb){
		IntegerSet dSet = new IntegerSet();
		for(int i = 0; i < intSetb.length(); i++) {
			if(!intSeta.contains(intSetb.iSet.get(i))) {
				dSet.add(intSetb.iSet.get(i));
			}
		}
		for(int j = 0; j < intSeta.length(); j++) {
			if(!intSetb.contains(intSeta.iSet.get(j))) {
				dSet.add(intSeta.iSet.get(j));
			}
		}
		return dSet;
	}
	
	/**
	 * Confirms if IntegerSet is empty.
	 * @return true if if is empty, false if not
	 */
	boolean isEmpty(){
		return(this.length() == 0);
	}
	
	/**
	 * Creates a string containing the elements of the IntegerSet instance
	 * @return a string of the IntegerSet elements
	 */
	public String toString(){
		String setString = "[";
		for(int i = 0; i<this.length(); i++) {
			setString += " "+iSet.get(i)+",";
		}
		setString += "]";
		return setString;
	}
}
