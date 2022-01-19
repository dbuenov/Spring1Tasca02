package n3exercici2;

public class FailingConstructor {
	public FailingConstructor() throws Exception{
		System.out.println("Comença constructor");
		throw new Exception();
	}
}
