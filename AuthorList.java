package Exceptions;
import java.util.*;
public class AuthorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Author> author=new TreeMap<String,Author>();
		ArrayList<String> array=new ArrayList<String>();
		HashSet<String> set=new HashSet<String>();
		author.put("DataStructure", (new Author(1,"Tushar","Jaipur")));
		author.put("Docker", (new Author(1,"Random","Jaipur")));
		author.put("Devops", (new Author(2,"Priyanshu","Abu")));
		author.put("Jenkins", (new Author(3,"Devansh","Delhi")));
		
		
	
		
		Set<String> keys=author.keySet();
		
		
		for(String i:keys) {
			Author a=author.get(i);
			
			System.out.println(i + " Written by "+ a.getName() +" Residing at "+ a.getAddress());
			
		}
		System.out.println("");
		
		System.out.println("Author Details who have written more than one book\n");
		for(String i:keys) {
			Author a=author.get(i);
			
			if(set.add(a.getName())==false){
				System.out.println(" Author Id: " + a.getId() +" Author Name: "+ a.getName() +" Author Address: "+ a.getAddress());
				
				
			}

			
		}
		




		
		
		
		
	}

}
