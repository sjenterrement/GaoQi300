package gof23.chainOfR;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 10) {
			System.out.println(
					"Ա����" + request.getEmpName() + "��٣�������" + request.getLeaveDays() + "ԭ��" + request.getReason());
			System.out.println("���Σ�" + this.name + "�����ͨ����");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
