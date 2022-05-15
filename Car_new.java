package week1.day1.assignments;

public class Car_new {

	public void applyBreak() {
		System.out.println("Driver is applying the break");	
	}
		public void applyGear() {
			System.out.println("Driver is using the gear");
		}
			public void switchonAc() {
				System.out.println("Driver is switching on the AC");
			}
				public void applyAcclerate(){
					System.out.println("Driver is accelerating");
				}
					public static void main(String[] args) {
						
						Car_new carobj1=new Car_new();
						carobj1.applyBreak();
						carobj1.applyGear();
						carobj1.switchonAc();
						carobj1.applyAcclerate();
					}

}