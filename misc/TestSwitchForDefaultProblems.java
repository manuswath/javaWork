
public class TestSwitchForDefaultProblems {

	public static void main(String[] args) {
		TestSwitchForDefaultProblems a = new TestSwitchForDefaultProblems();
		a.testSwitch("                      ");
		//Will throw runtime NullPointerException
		//a.testSwitch(null);

	}

	private void testSwitch(String tabId) {
		switch (tabId) {
		case "rx":
			System.out.println("hub.plan.rx.page");
			break;
		case "mx":
			System.out.println("hub.plan.mx.page");
			break;
		case "dx":
			System.out.println("hub.plan.dx.page");
			break;
		case "ed":
			System.out.println("hub.plan.ed.page");
			break;
		case "followup":
			System.out.println("hub.plan.followup.page");
			break;
		case "px":
			System.out.println("hub.plan.px.page");
			break;
		default:
			System.out.println("govinda");
			break;
		}
		
	}

}
