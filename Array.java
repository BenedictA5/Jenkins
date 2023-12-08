package arraysfind;

public class Array {
	




	public static int Min(int[] arr) {
		int min =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
			}
	public static int Max(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,7,2,8}; 
		Array obj = new Array();
		System.out.println(Array.Min(arr));
		//since Min and Max are static methods we can call them method using class name
		System.out.println(Array.Max(arr));
	}

}
