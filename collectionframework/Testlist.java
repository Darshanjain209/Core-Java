package in.co.collectionframework;

import java.util.ArrayList;

public class Testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		
		list.add("darshan");
		list.add("jain");
		list.add(69);
		list.add('c');
		list.add(true);
		System.out.println(list);
		for(int i=0;i<5;i++)
		{
			System.out.println(list.get(i));
		}
	

	}

}
