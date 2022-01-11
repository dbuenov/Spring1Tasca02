package n1exercici5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		
		int i = 5;
		boolean excepcio = true;

		while(excepcio) {
			try {
				System.out.println(array.get(i));
				
				//aquesta linea només s'accedeix si no hi ha excepció
				excepcio = false;
				System.out.println("Ja he pogut accedir a una posició correcta de l'array");
			}catch (Exception e){
				System.out.println("No puc accedir a aquesta posició de l'Array");
			}finally {
				i--;
			}
		}			
	}
}


