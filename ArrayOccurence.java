import java.util.*;
public class ArrayOccurence{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		int brr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			c=1;
			if(brr[i]!=-1){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						c+=1;
						brr[j]=-1;
					}
					brr[i]=c;
				}
			}
		}
		System.out.println("Occurence of");
		for(int i=0;i<arr.length;i++){
			if(brr[i]!=-1)
			System.out.println(" "+arr[i]+" is "+brr[i]);
		}
	}
}
					