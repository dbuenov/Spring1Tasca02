package n3exercici4;

public class Programa {

	public static void main(String[] args) {
		try {
			new FailingConstructor();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
