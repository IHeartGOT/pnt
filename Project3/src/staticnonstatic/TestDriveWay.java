package staticnonstatic;

public class TestDriveWay {
	
	public static void main(String[] args) {
		House anthony = new House();
		anthony.setDriveWaySize(6);
		int anthonyDriveWaySizeBefore = anthony.getDriveWaySize();
		System.out.println("Anthony's driveway size:" + anthonyDriveWaySizeBefore);
		
		
		House arif = new House();
		arif.setDriveWaySize(8);
		int arifDriveWaySize = arif.getDriveWaySize();
		System.out.println("Arif's driveway size:" + arifDriveWaySize);
		
		int anthonyDriveWaySizeAfter = anthony.getDriveWaySize();
		System.out.println("Anthony's driveway size:" + anthonyDriveWaySizeAfter);
		
		House.moveDriveWayDirection();

}
	
}
