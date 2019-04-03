package thread;

/**
 * lambda推到+加入参数
 * 
 * @author SJ
 *
 */
public class LambdaTest02 {
	public static void main(String[] args) {
		ILove love = (int a) -> {
			System.out.println("I like jungkook-->" + a);
		};

		love.lambda(100);

		// 简化
		love = (a) -> {
			System.out.println("I like jungkook-->" + a);
		};

		love.lambda(50);

		// 再简化
		love = a -> {
			System.out.println("I like jungkook-->" + a);
		};

		love.lambda(10);

		// 再再简化
		love = a -> System.out.println("I like jungkook-->" + a);
		love.lambda(1);
	}
}

interface ILove {
	void lambda(int a);
}

class Love implements ILove {

	@Override
	public void lambda(int a) {
		System.out.println("I like jungkook-->" + a);
	}

}