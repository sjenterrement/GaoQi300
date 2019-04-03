package thread;
/**
 * 
 * @author SJ
 *
 */
public class LambdaTest01 {
	//��̬�ڲ���
	static class Like2 implements ILike{

		@Override
		public void lambda() {
			System.out.println("I like jungkook2");
		}
		
	}
	public static void main(String[] args) {
		//�ⲿ
		ILike like=new Like();
		like.lambda();
		
		//��̬
		like=new Like2();
		like.lambda();
		
		//�ֲ�
		class Like3 implements ILike{

			@Override
			public void lambda() {
				System.out.println("I like jungkook3");
			}
			
		}
		like=new Like3();
		like.lambda();
		
		//����
		like=new ILike() {
			public void lambda() {
				System.out.println("I like jungkook4");
			}
		};

		like.lambda();
		
		//lambda
		like=()-> {
			System.out.println("I like jungkook5");
		};
		
		like.lambda();
	}
}
interface ILike{
	void lambda();
}
class Like implements ILike{

	@Override
	public void lambda() {
		System.out.println("I like jungkook");
	}
	
}