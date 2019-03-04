package cucumberExample;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class IsItFriday {
	private static final String FRIDAY = "Friday";

	static String isItFriday(final String today) {

		String retVal = "Nope";

		if (FRIDAY.equals(today)) {
			retVal = "TGIF";
		}
		return retVal;
	}
}

public class StepDef {

	private String today;
	private String actualAnswer;

	@Given("^today is \"([^\"]*)\"$")
	public void today_is(String today) {
		this.today = today;
	}

	@When("^I ask whether it's Friday yet$")
	public void i_ask_whether_it_s_Friday_yet() throws Exception {
		actualAnswer = IsItFriday.isItFriday(today);
	}

	@Then("^I should be told \"([^\"]*)\"$")
	public void i_should_be_told(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}

}
