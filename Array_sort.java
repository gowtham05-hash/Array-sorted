import java.util.Scanner;

public class Array_sort {
	static void sorted(int arr[], int size) {
		int low=0;
		int mid=0;
		int high = size-1;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
			default:
				mid++;
				
			
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your size of the array: ");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter your array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
			if(arr[i]<0 || arr[i]>2) {
				System.out.println("Invalid value, Only 0,1 and 2 are allowed");
				return;
			}
		}
		sorted(arr,size);
		System.out.print("Your sorted array: ");
			for(int i=0;i<size;i++) {
				System.out.print(arr[i] +" ");
			}
		}
}