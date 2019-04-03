package thread;

/**
 * lambda�Ƶ�+�������
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

		// ��
		love = (a) -> {
			System.out.println("I like jungkook-->" + a);
		};

		love.lambda(50);

		// �ټ�
		love = a -> {
			System.out.println("I like jungkook-->" + a);
		};

		love.lambda(10);

		// ���ټ�
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