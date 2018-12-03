package gof23.chainOfR;

public class Client {
	public static void main(String[] args) {
		Leader a=new Director("���ǕF");
		Leader b=new Manager("��̩��");
		Leader c=new GeneralManager("��͹�");
		
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest lr=new LeaveRequest("��˶��", 24, "����");
		
		a.handleRequest(lr);
	}
}