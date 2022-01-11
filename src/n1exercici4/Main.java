package n1exercici4;

public class Main {

	public static void main(String[] args) {
		try {
			throw new LaMevaExcepcio("Missatge d'error de La Meva Excepcio");
		}catch(LaMevaExcepcio e) {
			//missatge de l'excepcio
			System.err.println(e.getMessage());
			
			//clase de l'excepcio
			System.err.println(e.getClass());
		}

	}

}
