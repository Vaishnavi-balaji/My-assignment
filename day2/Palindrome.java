package week1.day2;

public class Palindrome {
 public static void main(String args[])
 {
	 int num = 1221;
	 int rev = 0;
	 int rem = 0;
	 int orgNum = num;
	 
	 while(num!=0) 
	 {
		 rem = num%10;
		 rev = rev * 10 + rem;
		 num = num/10;
	 }
	 if(orgNum == rev)
	 {
		 System.out.println(orgNum + "is palindrome number");
	 }
	 else {
		 System.out.println(orgNum + " is not palindrome number");
	 }
 }
	 
}
