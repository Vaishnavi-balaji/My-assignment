package week1.day2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int num1 = 0;
		int num2 = 1;
		int nextNum;
		
		for(int i = 0;i < range; i++) 
		{
			System.out.print(num1 + " ");
			nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
		
}
}