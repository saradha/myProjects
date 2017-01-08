package com.print.subset.array;

import java.util.Arrays;

public class FindSubSetArrayMaMinDifference {

	public static void main(String[] args) {
		int num[]={7, 3, 2, 4, 9, 12, 56} ;
		//2,3,4,7,9,12,56
		//9-2=7
		int n=num.length;
		int m=5;
		findMinimumDifference(num,n,m);
		//1111111
		/*for(int i=0;i<(1<<n);i++){
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
			System.out.print("{");
			for(int j=0;j<n;j++){
				if((i&(1<<j))>0){
					System.out.print(num[j]+ " ");
					if(num[j]<min){
						min=num[j];
					}
					if(num[j]>max){
						max=num[j];
					}
				}
				
				
			}
			System.out.println("}");
			System.out.println("Difference between min and max values "+(max-min));
		}*/
	}

	//distribute n chocolates to m student s and difference b/w  no of maximum choco in the packet and min choco given to the student shd be minimum
	private static void findMinimumDifference(int num[],int n,int m) {
		//sort elemenent 
		Arrays.sort(num);
		int min_diff=Integer.MAX_VALUE;
		int first=0,last=0;
		for(int i=0;i+m-1<n;i++){
			int diff=num[i+m-1]-num[i];
			if(diff<min_diff){
				min_diff=diff;
				first=i;
				last=i+m-1;
				
			}
			
		}
		System.out.println(num[last]-num[first]);
		
	}

}
