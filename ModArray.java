package modArray;
import java.util.Scanner;

public class ModArray {
	public static int modArray(int arr[],int b) {
		int result=0,power=1;
		for(int i=arr.length-1;i>0;i--) {
			result=(result+((arr[i]%b)*power)%b);
			power=(power*10)%b;                                                   
		}
		return result%b;
	}

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		int n=A.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=A.nextInt();
		}
		int b=A.nextInt();    
		int value=modArray(arr,b);
		System.out.println(value);
	}

}