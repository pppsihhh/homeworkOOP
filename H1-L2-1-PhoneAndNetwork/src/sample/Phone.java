package sample;

public class Phone {
	private long phoneNumber;
	private Network network;
	private boolean registrationInNetwork = false;
	

	public Phone(long phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	
	public Phone() {
		super();
	}
	

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public boolean isRegistrationInNetwork() {
		return registrationInNetwork;
	}

	public void setRegistrationInNetwork(Network network) {
		boolean a = network.registrationNewAbonent(this);
		if (a) {
			this.network = network;
			registrationInNetwork = true;
		} else {
			System.out.println("registration failed");
		}
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}
	
	public void call(long number) {
		if (!(isRegistrationInNetwork())) {
			System.out.println("You not registered in network");
			return;
		}
		network.networkCall(this.phoneNumber, number);
	}
	
	public void incomingCall(long number) {
		System.out.println("Abonent "+this.phoneNumber+ " you have new call by abonent - "+number);
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", network=" + network.getName() + ", registrationInNetwork="
				+ registrationInNetwork + "]";
	}


	
}
