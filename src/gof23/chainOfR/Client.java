package gof23.chainOfR;

public class Client {
	public static void main(String[] args) {
		Leader a=new Director("ÆÓÖÇ•F");
		Leader b=new Manager("½ğÌ©ºà");
		Leader c=new GeneralManager("Ìï–Í¹ú");
		
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest lr=new LeaveRequest("½ğË¶Õä", 24, "ÂÃÓÎ");
		
		a.handleRequest(lr);
	}
}