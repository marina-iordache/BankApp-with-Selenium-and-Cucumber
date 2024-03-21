import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AppStepDefinitions {

    BankAccount cont_bancar_generic;

    @Given("the user has a bank account with balance of {double} dollars")
    public void the_user_has_a_bank_account_with_balance_of_dollars(double balance) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        cont_bancar_generic = new BankAccount("Generic User", 999999999, balance);

    }
    @When("the user withdraws {double} dollars")
    public void the_user_withdraws_dollars(double amount) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        cont_bancar_generic.withdraw(amount);
    }
    @Then("the balance is {double} dollars")
    public void the_balance_is_dollars(double balance) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        Assertions.assertEquals(balance, cont_bancar_generic.getBalance());
    }
    @Then("the balance is not negative")
    public void the_balance_is_not_negative() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        Assertions.assertTrue(cont_bancar_generic.getBalance() >= 0);
    }
}
