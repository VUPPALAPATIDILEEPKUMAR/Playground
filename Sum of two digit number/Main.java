import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int firstdigit=num/10;
      int lastdigit=num%10;
      int sum=firstdigit+lastdigit;
      System.out.println(sum);
	}
}