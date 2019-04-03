package thread;
/**
 * 
 * @author SJ
 *
 */
public class LambdaTest01 {
	//静态内部类
	static class Like2 implements ILike{

		@Override
		public void lambda() {
			System.out.println("I like jungkook2");
		}
		
	}
	public static void main(String[] args) {
		//外部
		ILike like=new Like();
		like.lambda();
		
		//静态
		like=new Like2();
		like.lambda();
		
		//局部
		class Like3 implements ILike{

			@Override
			public void lambda() {
				System.out.println("I like jungkook3");
			}
			
		}
		like=new Like3();
		like.lambda();
		
		//匿名
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