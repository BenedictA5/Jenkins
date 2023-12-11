package sorting;

public class bsort {
	public static void busort(int[] arr,int n) {
		int i,j,temp;
		boolean swapped;
		for(i=0;i<n;i++) {
			swapped=false;
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(swapped==false)
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {66,45,58,11,34};
		int n=arr.length;
		busort(arr,n);
		System.out.println("sorted array:");
		for(int element:arr) {
			System.out.print(element+" ");
		}
		
	}

}
