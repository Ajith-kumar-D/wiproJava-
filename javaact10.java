import java.util.*;
public class javaact10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(true)
		{
			if(i*i%21==0 && i*i%36==0 && i*i%66==0)
			{
				System.out.print(i*i);
				break;
			}
			else{
				i++;
			}
		}

	}

}
