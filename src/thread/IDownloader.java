package thread;

public class IDownloader implements Runnable{

	private String url;
	private String name;
	
	
	
	public IDownloader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd=new WebDownloader();
		wd.download(url, name);
	}
	

	public static void main(String[] args) {
		IDownloader td1=new IDownloader("https://ww3.sinaimg.cn/thumb150/005IentOgy1g15i79grcfj31s016ndrr.jpg", "fakelove.jpg");
		IDownloader td2=new IDownloader("https://ww2.sinaimg.cn/thumb150/005KerrDgy1g15jlwa60qj31ww2pgtnt.jpg", "mama.jpg");
		IDownloader td3=new IDownloader("https://ww4.sinaimg.cn/thumb150/c4deae3bgy1g15jh0xbwoj21e00xc0zn.jpg", "eiphoria.jpg");
		
		new Thread(td1).start();
		new Thread(td2).start();
		new Thread(td3).start();
	}

}
