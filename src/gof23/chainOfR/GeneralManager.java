package gof23.chainOfR;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println(
					"Ա����" + request.getEmpName() + "��٣�������" + request.getLeaveDays() + "ԭ��" + request.getReason());
			System.out.println("���Σ�" + this.name + "�����ͨ����");
		} else {
			System.out.println("Ī����"+request.getEmpName()+"��"+request.getLeaveDays()+"�ļ٣����ְ��");
		}
	}
}
