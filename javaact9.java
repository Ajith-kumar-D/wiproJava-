import java.util.*;
public class javaact9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = x - (x*20)/100;
		int m1 = (x*55)/100;
		int m2 = x-m1;
		System.out.print(m2);

	}

}
