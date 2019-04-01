package thread;

import java.lang.reflect.Executable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CDownloader implements Callable<Boolean>{

	private String url;
	private String name;
	
	
	
	public CDownloader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}

	@Override
	public Boolean call() throws Exception{
		WebDownloader wd=new WebDownloader();
		wd.download(url, name);
		return true;
	}
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CDownloader cd1=new CDownloader("https://ww3.sinaimg.cn/thumb150/005IentOgy1g15i79grcfj31s016ndrr.jpg", "fakelove.jpg");
		CDownloader cd2=new CDownloader("https://ww2.sinaimg.cn/thumb150/005KerrDgy1g15jlwa60qj31ww2pgtnt.jpg", "mama.jpg");
		CDownloader cd3=new CDownloader("https://ww4.sinaimg.cn/thumb150/c4deae3bgy1g15jh0xbwoj21e00xc0zn.jpg", "eiphoria.jpg");
		
		//创建执行服务
		ExecutorService ser=Executors.newFixedThreadPool(3);
		//提交执行
		Future<Boolean> result1=ser.submit(cd1);
		Future<Boolean> result2=ser.submit(cd1);
		Future<Boolean> result3=ser.submit(cd1);
		//关闭服务
		boolean r1=result1.get();
		boolean r2=result2.get();
		boolean r3=result3.get();
		//关闭服务
		ser.shutdownNow();
	}

}
