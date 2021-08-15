import java.util.*;
public class javaact5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int s=0;
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
			s+=arr[i];
		}
		System.out.print(s/10);

	}

}
