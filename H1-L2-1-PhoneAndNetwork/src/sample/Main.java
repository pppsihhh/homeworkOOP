package sample;

public class Main {
	public static void main(String[] args) {
		Network kyivkstar = new Network("Kyivstar");
		Phone ph1 = new Phone(380971110000L);
		ph1.setRegistrationInNetwork(kyivkstar);
		
		Phone ph2 = new Phone(380972220000L);
		ph2.setRegistrationInNetwork(kyivkstar);
		
		Phone ph3 = new Phone(380973457754L);
		ph3.setRegistrationInNetwork(kyivkstar);
		
		Phone ph4 = new Phone(380974457754L);
		ph4.setRegistrationInNetwork(kyivkstar);
		
		System.out.println(kyivkstar.toString());
		
		ph2.call(380971110000L);
	}
	
}
