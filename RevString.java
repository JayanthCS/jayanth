import java.util.*;
class RevString{
public static void main(String[] args) {
		
		System.out.println("Enter the string ");
		
		Scanner sp = new Scanner(System.in);
		 String name= sp.next();
		 char ch[] = name.toCharArray();
		String rev = "";
		
		
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			
		}
		System.out.println("Original string :"+name);
		System.out.println("Reverse string :"+rev);
	
	}
	}
	
	//Scanner scanner = new Scanner(System.in);
	//String name=scanner.next();
	//char ch[]= name.toCharArray();
	//String rev="";
	//for(int i=ch.length-1;i>=0;i--){
	//	rev=rev+ch[i];
	//}
	//sysout(name);
	//sysout(rev);