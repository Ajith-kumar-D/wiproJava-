import java.util.*;
public class javaact6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] a = s.toCharArray();
		int length = a.length;
		int index=0;
		 for (int i = 0; i < length; i++)   
	        {    int j; 
	            for (j = 0; j < i; j++)    
	            {   
	                if (a[i] == a[j])   
	                {   
	                    break;   
	                }  
	            }  
	            if (j == i)    
	            {   
	                a[index++] = a[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(a, index)));

	}

}
