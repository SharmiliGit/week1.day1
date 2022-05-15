package week1.day1.assignments;

public class twoWheeler {

	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=98789L;
	boolean isPunctured=false;
	String bikeName="HondaActiva";
	double runningKM=1102.5f;
		
	public static void main(String[] args) {
		twoWheeler features=new twoWheeler();
		System.out.println("TWO WHEELER FEATURES");
		System.out.println("no. of wheels=" +features.noOfWheels);
		System.out.println("no. of mirrors=" +features.noOfMirrors);
		System.out.println("chassis number=" +features.chassisNumber);
		System.out.println("Its not punctured=" +features.isPunctured);
		System.out.println("bike name is honda=" +features.bikeName);
		System.out.println("running kilometer is" +features.runningKM);
		
	}
}
