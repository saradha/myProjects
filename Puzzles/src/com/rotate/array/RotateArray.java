package com.rotate.array;

//left rotation from given position
public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		/*for (int i = 0; i < d; i++) {
			leftRotation(arr);
		}*/
		//left rotation using gsd juggling algorithm
		leftRotationUsingGsd(arr,d,arr.length);
		System.out.println("Rotated Array");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(",");
			}
		}

	}

	private static void leftRotationUsingGsd(int arr[], int d, int n) {
		        int i, j, k, temp;
		        for (i = 0; i < gcd(d, n); i++) 
		        {
		            /* move i-th values of blocks */
		            temp = arr[i];
		            j = i;
		            while (1 != 0) 
		            {
		                k = j + d;
		                if (k >= n) 
		                    k = k - n;
		                if (k == i) 
		                    break;
		                arr[j] = arr[k];
		                j = k;
		            }
		            arr[j] = temp;
		        }
		    }
		 
		

	private static int gcd(int a, int b) {
		if (b == 0)
	            return a;
	        else
	            return gcd(b, a % b);
	}

	private static void leftRotation(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 0; i <n-1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[n - 1] = temp;

	}
}

// 1,2,3,4,5,6,7
// 2,2,3,4,5,6,7,1
//time complexity -o(n*d)-one loop for 0 to d and one loop for o to n
//space complexity -o(1)- for temp