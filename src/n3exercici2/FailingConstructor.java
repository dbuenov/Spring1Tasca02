package n3exercici2;

public class FailingConstructor {
	public FailingConstructor() throws Exception{
		System.out.println("Comen�a constructor");
		throw new Exception();
	}
}
