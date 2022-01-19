package n2exercici2;

import javax.naming.NoPermissionException;

public class ThrowException{
	
	public void f() throws NoPermissionException{
		try {
			g();
		}catch (RuntimeException e) {
			throw new NoPermissionException();
		}
	}
	
	public void g() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
}
