package constructor;

public class TestHouse {
	
	public static void main(String[] args) {
	House house1 = new House();
	house1.setAddress("32-72 Steinway Street");
	house1.displayAddress();
	
	House house2 = new House("31-10 37 Avenue");
	House house3 = new House(37);
	House house4 = new House("91-21 86th street, Woodhaven, NY 11421");

}
}
