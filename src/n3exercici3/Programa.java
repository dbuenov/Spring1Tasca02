package n3exercici3;

public class Programa {

	public static void main(String[] args) {
		try {
			new FailingConstructor();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
