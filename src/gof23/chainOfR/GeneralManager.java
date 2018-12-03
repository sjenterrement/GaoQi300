package gof23.chainOfR;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println(
					"员工：" + request.getEmpName() + "请假，天数：" + request.getLeaveDays() + "原因：" + request.getReason());
			System.out.println("主任：" + this.name + "，审核通过。");
		} else {
			System.out.println("莫非你"+request.getEmpName()+"请"+request.getLeaveDays()+"的假，想辞职？");
		}
	}
}
