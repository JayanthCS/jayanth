import java.util.*;
class RevString1{

public static void main(String arg[]){

    Scanner scanner=new Scanner(System.in);
	String name=scanner.next();
	
	char ch[]= name.toCharArray();
	
	String rev="";
	
	for(int i=ch.length-1;i>=0;i--){
		rev=rev+ch[i];
		
	}
	System.out.println("entered string :"+name);
	System.out.println("rev string:"+rev);

}

}