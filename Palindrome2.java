import java.util.*;
public class Palindrome {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter 2 number");
		int n1 =s.nextInt();
		int n2 = s.nextInt();
		for(int i =n1;i <=n2;i++) {
			if(display(i)==1)
				System.out.println(i+"");
		}}
		static int display(int i) {
			int n=1;
			
		
		int rev=0,rem;
		
		while(n> 0) {
			rem =n%10;
			rev =rev *10+rem;
			n = n/10;
		}
if(i == rev) 
	return 1;
	else 
		return 0;
}}


