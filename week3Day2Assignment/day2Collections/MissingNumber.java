package week3.day2Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,6,4,7,8,9,10};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int i :data)
		{
			ts.add(i);
		}
		ts.descendingSet();
		//List<Integer> list= new ArrayList<Integer>(ts);
		Integer current=ts.first();
		System.out.println(ts);
		Iterator val = ts.iterator();
		for(int i=0;i<=data.length;i++)
		{
			if(current==val.next())
			{
				current=val;
				val=val.next();
			}
			
		}
	}

}
