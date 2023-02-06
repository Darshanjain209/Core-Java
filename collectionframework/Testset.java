package in.co.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Testset {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add("nidhi");
		hs.add("darshan");
		hs.add(10);
		hs.add("shaswat");
		hs.add(5.6);
		hs.add(true);
		hs.add("darshan");
		hs.add("");
		hs.add("");
		//System.out.println(hs);
		//Iterator it=hs.iterator();
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
