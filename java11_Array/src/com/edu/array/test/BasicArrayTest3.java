package com.edu.array.test;

public class BasicArrayTest3 {

	public static void main(String[] args) {
		
		// 1. 선언 + 2. 생성 + 3. 초기화 
		int[] arr = {11, 22, 33};

//		for(int i = 0; i < 3; i++)
//			System.out.println(arr[i]);
		
		// 뭐가 어디서 돌아가는가
		for(int num : arr) {  // --> 향상된 for문 , for-each문
			System.out.println(num);
		}
		
	}

}
