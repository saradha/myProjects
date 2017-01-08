package com.find.pair.gives.sum.array;

public class FindPairOfElementGivesSum {
	private static final int MAX = 100000;
	public static void main(String[] args) {
		// to find two nodes which gives the sum in BST do inorder traversal of the tree then store tht in array and do the same process below
		int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairsMethod1(A,  n);//with out recursion 

	}

	private static void printpairsMethod1(int[] a, int sum) {
		boolean[] bmap= new boolean[MAX];
		for(int i=0;i<a.length;i++){
			int temp=sum-a[i];
			if(temp>=0&&bmap[temp]){
				System.out.println("Pair which gives the given sum "+sum+" is "+a[i]+" , "+temp);
			}
			bmap[a[i]]=true;
		}
		
	}

}
