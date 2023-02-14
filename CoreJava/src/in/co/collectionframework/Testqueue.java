package in.co.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class Testqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		l.offer("darshan");
		l.offer('(');
		l.offer(10.4);
		l.offer(100);
		l.offer("");
		l.offer("shaswat");
		Iterator it =l.iterator();
		while(it.hasNext())
			
		{
			System.out.println(it.next());
		}
		
		System.out.println(l.);
		

	}

}
