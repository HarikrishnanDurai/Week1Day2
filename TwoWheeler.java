package Week1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 12345678900L;
	boolean isPunctured = false;
	String bikeName = "Pulsar";
	double runningKM = 900.500;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler ();
		System.out.println("Number of Wheels is " + obj.noOfWheels);
		System.out.println("Number of Mirrors is " + obj.noOfMirrors);
		System.out.println("Chassis Number is " + obj.chassisNumber);
		System.out.println("Is Tyre punctured? " + obj.isPunctured);
		System.out.println("Name of the bike is " + obj.bikeName);
		System.out.println("Kilometer ran " + obj.runningKM);
	}

}
