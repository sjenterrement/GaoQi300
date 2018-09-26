package testException;

/**
 * Œ“µƒ“Ï≥£
 * @author savrina
 *
 */
public class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

class TestMyTestException{
	void test() throws MyException{
		
	}
	
	public static void main(String[] args) {
		try {
			new TestMyTestException().test();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}