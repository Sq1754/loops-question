import java.util.Scanner;

public class add_no_user_input {
public static void main(String[]args) {
	int n = 0;
	int x;
	Scanner sc = new Scanner(System.in);
	do {
	System.out.println("Enter even numbers to add:");
	x = sc.nextInt();
	if(x%2==0) {
	n+=x;}

	}while(x%2==0) ;
			System.out.println(n);
}
}
