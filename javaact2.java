import java.util.*;
public class javaact2 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int max=0,count=0;
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
			if (max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=0;i<10;i++)
		{
			if (arr[i]==max)
			{
				count++;
			}
		}
		System.out.print(count);
		

	}

}
