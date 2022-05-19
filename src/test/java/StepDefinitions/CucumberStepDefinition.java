package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.codehaus.plexus.util.StringUtils;
import org.junit.Assert;

public class CucumberStepDefinition {

    private String input;
    private boolean isValid;

    @Given("I entered int {string}")
    public void i_entered_int(String testInput) {
        // Write code here that turns the phrase above into concrete actions
        input = testInput;
    }

    @When("I test it for input")
    public void i_test_it_for_input() {
        // Write code here that turns the phrase above into concrete actions
        if(StringUtils.isNumeric(input)){
            if(Double.parseDouble(input)%1 == 0){
                isValid = Integer.parseInt(input) > 0;
            }else{
                isValid = false;
            }
        }else{
            isValid = false;
        }
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String result) {
        // Write code here that turns the phrase above into concrete actions
        boolean expectedResult = Boolean.parseBoolean(result);
        if(expectedResult){
            Assert.assertTrue(isValid);
        }else {
            Assert.assertFalse(isValid);
        }
    }

}
