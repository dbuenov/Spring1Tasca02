package n3exercici1;

public class Programa {

	public static void main(String[] args) {
		
		//new Fill();
		
		//si el fill es capaç de capturar l'excepció hauria de sortir el missatge que genera el contructor de fill
		try {
			new Fill();			
		}catch (RuntimeException e) {
			System.out.println("Capturo l'excepció al main");
		}
					
	}

}
