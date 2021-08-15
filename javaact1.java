import java.util.*;
public class practice2 {

	public static void main(String[] args) {
		int arr[] = new int[25];
		Scanner sc  = new Scanner(System.in);
		int max=0;
		for(int i=0;i<25;i++)
		{
		arr[i] = sc.nextInt();
		if(max<arr[i]){
			max=arr[i];
		}
		}
		System.out.println(max);
		
		
	}

}
