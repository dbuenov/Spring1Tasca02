package n1exercici3;

public class Main {

	public static void main(String[] args) {
		
		int array[] = new int[0];
		
		try {
			//intento accedir a la primera posició
			System.out.println(array[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
