package week1.day1.assignments;

public class PrimeNumber {
				public static void main(String[] args) {
				int input=13;
				boolean flag=false;
				 for (int i = 2; i < input/2; i++) {
					 int rem=input%i;
					 if(rem==0)
					 {
						 flag=true;
						 //System.out.println(flag);
						 break;
					 }
					
				}
				 if(flag==false)
				 {
					 System.out.println("Provided input "+input+" is a Prime number");
				 }
				 else if(flag==true)
				 {
					 System.out.println("Provided input "+input+" not a Prime number");
				 }
					}
		}