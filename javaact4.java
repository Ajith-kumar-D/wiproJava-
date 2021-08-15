import java.util.*;
public class javaact4 {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc  =new Scanner(System.in);
		n = sc.nextInt();
		int s=1;
		for (int i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.print(s);
		

	}

}
