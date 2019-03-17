package thread;

public class TDownloader extends Thread{

	private String url;
	private String name;
	
	
	
	public TDownloader(String url, String name) {
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
		TDownloader td1=new TDownloader("https://ww3.sinaimg.cn/thumb150/005IentOgy1g15i79grcfj31s016ndrr.jpg", "fakelove.jpg");
		TDownloader td2=new TDownloader("https://ww2.sinaimg.cn/thumb150/005KerrDgy1g15jlwa60qj31ww2pgtnt.jpg", "mama.jpg");
		TDownloader td3=new TDownloader("https://ww4.sinaimg.cn/thumb150/c4deae3bgy1g15jh0xbwoj21e00xc0zn.jpg", "eiphoria.jpg");
		
		td1.start();
		td2.start();
		td3.start();
	}

}
