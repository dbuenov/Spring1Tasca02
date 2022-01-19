package n2exercici2;

import javax.naming.NoPermissionException;

public class Programa {

	public static void main(String[] args) {
		ThrowException exc = new ThrowException();
		
		//continua funcionant perque es superclase de l'excepció que envolica
		try {		
			exc.f();
		}catch (NoPermissionException e){
			System.out.println(e);
		}
		
		try {
			exc.g();
		}catch (RuntimeException e){
			System.out.println(e);
		}
	}
}
