package week1.day1.assignments;

public class Factorial {
	 //input: 5
	 //output: 5*4*3*2*1 = 120
	public static void main(String[] args) {
		int fact = 1;
		for(int i=5;i>=1;i--) {
			fact = fact * i;
}
		System.out.println("Factorial number of 5 is: " + fact);
}
}