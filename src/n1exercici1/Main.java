package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		try {
			//genero una excepcio amb un missatge
			throw new Exception("Error");
		}catch (Exception e) {
			//la capturo i envio el missatge
			System.err.println(e.getMessage());
		}finally {
			//pasar� si o si per aqu�
			System.out.println("Estic al finally");
		}
	}	
}
