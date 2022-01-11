package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		Object objecte = new Object();
		objecte = null;
		
		try {
			objecte.toString();
		}catch (Exception e){
			//missatge de l'excepcio
			System.out.println(e.getMessage());
			
			//tipus d'excepcio
			System.out.println(e.getClass());
		}		
	}
}
