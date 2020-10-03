package integerSet;

public class Main {
	/**
	 * main method. carries out tests for the IntegerSet class
	 * @param args
	 * @throws IntegerSetException 
	 */
	public static void main(String[] args) throws IntegerSetException {
		//test creation of IntegerSet instance and toString() function
		System.out.println("TEST CREATION OF INSTANCE/ TOSTRING() FUNCTION");
		IntegerSet i = new IntegerSet();
		i.add(1);
		System.out.println(i.toString());
		
		//test add() for multiple elements
		System.out.println("TEST ADD() FOR MULTIPLE ELEMENTS");
		IntegerSet j = new IntegerSet();
		j.add(1);
		j.add(2);
		j.add(3);
		System.out.println(j.toString());
		
		//test length
		System.out.println("TESTING LENGTH()");
		System.out.println(j.length()); // should print 3
		
		//test union()
		System.out.println("TESTING UNION()");
		i.union(j);
		System.out.println(i.toString()); // should print elements 1, 2, 3
		
		//Test intersection
		System.out.println("TESTING INTERSECTION()");
		IntegerSet k = new IntegerSet();
		k.add(3);
		k.add(4);
		k.add(5);
		IntegerSet intersection = IntegerSet.intersect(j,  k);
		System.out.println(intersection.toString()); //should print 3
		
		//Test difference()
		System.out.println("TESTING DIFF()");
		IntegerSet difference = IntegerSet.diff(j, intersection);
		System.out.println(difference.toString()); //should print elements 1, 2
		
		//Test largest
		System.out.println("TESTING LARGEST()");
		System.out.println(j.largest()); // should print 3
		
		System.out.println("TESTING SMALLEST()");
		System.out.println(j.smallest());//should print 1
		
		//test clear
		System.out.println("TESTING CLEAR()");
		j.clear();
		System.out.println(j.toString());//should print an empty set
		
		//Test exceptions
		System.out.println("TESTING EXCEPTIONS"); //test to see if exceptions occur. comment out one to test for the other.
		//j.largest();
		j.smallest();
	}

}
