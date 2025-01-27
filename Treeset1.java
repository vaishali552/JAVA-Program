package JavaPackage;

import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
      	ts.add(0);
      	ts.add(1);
      	ts.add(2);
      	ts.add(3);
      	ts.add(4);
      	ts.add(5);
      	ts.add(6);
      	System.out.println("Before elements from treeset"+ts);
    	System.out.println("After elements from treeset"+ts.pollFirst());
    	System.out.println("PollLast treeset"+ts.pollLast());
	}
}
