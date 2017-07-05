import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addendums {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		Integer i = null ;
		try{
			System.out.println("Please enter a number");
			i= Integer.parseInt(s.next());
		}catch(NumberFormatException e){
			System.out.println("Only numbers allowed \nPlease try again");
			System.out.println("Please enter a number");
			i= Integer.parseInt(s.next());
		}
		System.out.println("Entered number is : "+i);
		
	printAddendums(i);
		
	}

	private static void printAddendums(final Integer n) {
		List<String> lst = new ArrayList<>();
		
		String empty="";
		String prefix="1";
		String plus="+";
		
		for(int i =1;i<n;i++){
				prefix+=plus+"1";
			}
			lst.add(prefix);
		
		prefix= empty;

		Integer temp =n;
		again:
		for(int i = 1; i<temp;i++){
			if(temp==n){
				prefix=empty;
			}else{
				prefix=(n-temp)+plus;
			}
			prefix +=(temp-i)+plus+(temp-(temp-i)); 
			lst.add(prefix);
			prefix=empty;
			if(i==(temp-1)){
				temp = temp-(temp-i);
				i=0;
			 continue again;
			}
		}
		
		System.out.println("Addendums are :");
		for (String string : lst) {
			System.out.println(string);
		
		}		
		
		
	}
}
