package in.co.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Testmarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		
		Marksheet m1=new Marksheet("101","darshan",87,76,55);
		Marksheet m2=new Marksheet("102","darshana",89,6,95);
		
//		HashMap map=new HashMap();
//		map.put(m1,"darshan");
//		System.out.println(map.get(m1));
		
		l.add(m1);
		l.add(m2);
		
		Iterator it=l.iterator();
		
		while(it.hasNext())
		{
			Marksheet m=(Marksheet) it.next();
		System.out.println(m.getName()+" "+" ");
		System.out.println(m.getRollno()+" "+" ");
		System.out.println(m.getPhysics()+" "+" ");
		System.out.println(m.getChemistry()+" "+" ");
		System.out.println(m.getMaths()+" "+" ");
		System.out.println("next");
		}	
		
		
		
	}

}
