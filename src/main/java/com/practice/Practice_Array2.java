package com.practice;

public class Practice_Array2 {


	public void getduplicate(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {// 1st loop =0

			for (int j = (i + 1); j < myArray.length; j++) {// 2nd loop =i+1

				if (myArray[i] == myArray[j]) {
					System.out.println(myArray[i] + "=====" + myArray[j]);
					System.out.println("found my dulpicate value = " + myArray[j]);
				}

			}
		}

	}

	public static void main(String[] args) {
		
		int [] myArray ={ 2,3,4,5,6,6,7,7};
		
		Practice_Array2 obj = new Practice_Array2();
		obj.getduplicate(myArray);

	}

}