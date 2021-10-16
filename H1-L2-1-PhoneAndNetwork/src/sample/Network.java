package sample;

import java.util.Arrays;

public class Network {
	private String name;
	private Phone[] phones = new Phone[100];

	public Network(String name) {
		super();
		this.name = name;
	}

	public Network() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public boolean registrationNewAbonent(Phone phone) {
		if (phone == null) {
			return false;
		}
		if (isRegistretInNetwork(phone.getPhoneNumber()) == null) {
			for (int i = 0; i < phones.length; i++) {
				if (phones[i] == null) {
					phones[i] = phone;
					return true;
				}
			}
		}
		if (phone.isRegistrationInNetwork()) {
			return true;
		}
		return false;
	}

	public Phone isRegistretInNetwork(long phoneNumber) {
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null && phoneNumber == phones[i].getPhoneNumber()) {
				return phones[i];
			}
		}
		return null;
	}

	public void networkCall(long numberCall, long numberRecive) {
		Phone ph = isRegistretInNetwork(numberRecive);
		if (ph == null) {
			System.out.println("Abonent " + numberRecive + " is not registered in network");
			return;
		}
		
		ph.incomingCall(numberCall);
		
	}

	@Override
	public String toString() {
		int g = 0;
		String a = "";
		a += "Network [name=" + name + ", phones=";
		
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {
				if (g > 0) {
					a += ", ";
				}
				g++;
				a += phones[i].getPhoneNumber();
			}
		}
		
		a += "]";

		return a;
	}

}
