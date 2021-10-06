package sample;

public class NoFreePlaseException extends Exception {

	@Override
	public String getMessage() {
		return "there are no free places in the group";
	}

}
