package thread;

/**
 * lambda推到+加入参数+返回值
 * 
 * @author SJ
 *
 */
public class LambdaTest03 {
	public static void main(String[] args) {
		Iadore adore = (int a, int b) -> {
			System.out.println("I like jungkook-->" + (a + b));
			return a + b;
		};

		adore.lambda(100, 200);

		adore = (a, b) -> {
			System.out.println("I like jungkook-->" + (a + b));
			return a + b;
		};

		adore.lambda(10, 20);
	}
}

interface Iadore {
	int lambda(int a, int b);
}

class adore1 implements Iadore {

	@Override
	public int lambda(int a, int b) {
		System.out.println("I like jungkook-->" + (a + b));
		return a + b;
	}

}