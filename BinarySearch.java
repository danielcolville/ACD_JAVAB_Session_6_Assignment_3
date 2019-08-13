package session6;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] search= {1,5,61,71,85,97,150,1000,2500};
		System.out.println("Array is:");
		for(int i:search) {
			System.out.print(i+",");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find index of:");
		int numToFind=sc.nextInt();
		int find=binS(search,numToFind);
		if(find>=0) {
			System.out.print(numToFind+" was found at index "+find);
		}
		else {
			System.out.println("Number not found");
		}
	}
	public static int binS(int[] arr,int num) {
		int lPart=0;
		int rPart=arr.length-1;
		int curr;
		while(lPart<=rPart) {
			curr=(rPart+lPart)/2;
				if(num>arr[curr]) {
					lPart=curr+1;
				}
				else if(num<arr[curr]){
					rPart=curr-1;
				}
				else {
					return curr;
				}
		}
		return -1;
	}

}
