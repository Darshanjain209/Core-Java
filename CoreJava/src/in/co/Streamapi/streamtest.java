package in.co.Streamapi;

import java.util.ArrayList;
import java.util.List;

public class streamtest {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("darshan");
		list.add("jain");
		list.add("shubham");
		list.add("aniket");
		list.add("nidhi");
		list.add("mishra");
		list.add("pooja");
		System.out.println(list);
		
		list.stream().sorted().forEach(e ->{
			System.out.println(e);
		});
		
		
	}

}
