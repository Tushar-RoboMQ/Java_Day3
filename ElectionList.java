package Exceptions;

import java.util.*;

public class ElectionList {

	public static void main(String[] args) {
		HashSet<Election> election=new HashSet<Election>();
		election.add(new Election(1,"Congress","12JAN","JAIPUR","Random","13"));
		election.add(new Election(2,"Bhartiya Janta Party","12JAN","JAIPUR","Random","16"));
		election.add(new Election(3,"HDD","13JAN","Delhi","hello","13"));
		election.add(new Election(3,"HDD","13JAN","Delhi","hello","13"));
		
		for(Election s:election) {
			System.out.println(s);
		}
	}

}
