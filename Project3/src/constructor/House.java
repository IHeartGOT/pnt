package constructor;

public class House {
public String address;
public int num;

	//constructor 1 
	public House() {}
	
	//constructor 2
	
	public House (String address) {
		this.address = address;
		System.out.println(address);
		
	}
	public House(int address) {
		this.num = address;
		System.out.println(address);
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public void displayAddress() {
		System.out.println(this.address);
		
	}
}
