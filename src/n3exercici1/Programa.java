package n3exercici1;

public class Programa {

	public static void main(String[] args) {
		
		//new Fill();
		
		//si el fill es capa� de capturar l'excepci� hauria de sortir el missatge que genera el contructor de fill
		try {
			new Fill();			
		}catch (RuntimeException e) {
			System.out.println("Capturo l'excepci� al main");
		}
					
	}

}
