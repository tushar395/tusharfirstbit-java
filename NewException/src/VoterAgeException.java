
public class VoterAgeException extends Exception {
	public String toString() {
		return "invalid age! You cant vote! ";

	}
}

class Voter {
	int age;

	Voter(int a) {
		this.age = a;

	}

	void validate() throws VoterAgeException {
		if (this.age < 18) {
			throw new VoterAgeException();
		} else {
			System.out.println("You can Vote");

		}
	}
}

class DemoException {
	public static void main(String[] args) {
		System.out.println("Hello");
		Voter v1 = new Voter(14);
		try {
			v1.validate();
		} catch (VoterAgeException e) {
			System.out.println("inside main");
			System.out.println(e);
			e.printStackTrace();

		} finally {
			System.out.println("inside the finnaly");
		}
	}
}
