package Array;

import java.util.Scanner;

public class coding {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr a size");
	int size = sc.nextInt();
	int input[] = new int[size];
	System.out.println("enter a element");
	
	for(int i=0; i<size; i++){
		input[i]= sc.nextInt();
	}
	for(int i=0; i<size; i++) {
		System.out.println(input[i]+"  ");
	}
}
}
