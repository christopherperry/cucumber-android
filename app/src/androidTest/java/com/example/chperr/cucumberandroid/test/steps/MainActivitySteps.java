package com.example.chperr.cucumberandroid.test.steps;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.chperr.cucumberandroid.MainActivity;
import com.example.chperr.cucumberandroid.R;

import org.junit.Rule;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivitySteps {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Given("^I have a MainActivity$")
    public void I_have_a_main_activity() {
        mActivityRule.launchActivity(null);
    }

    @When("^I click the speak button$")
    public void I_click_the_speak_button() {
        onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());
    }

    @Then("^I should see (\\S+)$")
    public void I_should_see(String speech) {
        onView(withId(R.id.animalSound)).check(matches(withText(speech)));
    }
}
