

public class insertionsort {
	public static void inssort(int[] arr,int n) {
		int i,j,temp;
		
		for(i=0;i<n-1;i++) {
			
			for(j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {66,45,58,11,34};
		int n=arr.length;
		inssort(arr,n);
		System.out.println("sorted array:");
		for(int element:arr) {
			System.out.print(element+" ");
		}
		
	}

}
