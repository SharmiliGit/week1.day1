package week1.day1.assignments;

import java.util.Iterator;

public class FibonacciSeries {
	
//input=8
//output= 0,1,1,2,3,5,8,13
//* What are my learnings from this code?
	//1) purpose of for loop in the program
	//2)declaring variables in int
	//3)Post Incremental operator  and shortcut for for-loop
public static void main(String[] args) {
	int input=8;
	int a=0;
	int b=1;
	int sum=0;
	for (int i = 1; i<=8; i++) {
		System.out.println(a);
		sum=a+b;
		a=b;
		b=sum;
		
	}
}


}
