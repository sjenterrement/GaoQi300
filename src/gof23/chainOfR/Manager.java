package gof23.chainOfR;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 10) {
			System.out.println(
					"员工：" + request.getEmpName() + "请假，天数：" + request.getLeaveDays() + "原因：" + request.getReason());
			System.out.println("主任：" + this.name + "，审核通过。");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
