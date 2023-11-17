package edu.vassar.cmpu203.datingsim;

import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import android.content.Context;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import edu.vassar.cmpu203.datingsim.controller.MainController;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ButtonInstrumentedTest {

    //specify what activity to launch
    @org.junit.Rule

    public ActivityScenarioRule<MainController> activityRule = new ActivityScenarioRule<>(MainController.class);



    @org.junit.Test
    public void testContinueButton() {
        // pressed continue button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).check(ViewAssertions.matches(isDisplayed()));

    }

    @org.junit.Test
    public void testNewGameButton() {
        // pressed new game button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.startButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.enterNameText)).check(ViewAssertions.matches(isDisplayed()));

    }

    @org.junit.Test
    public void testPlayButton() {
        // pressed new game button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.playButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).check(ViewAssertions.matches(isDisplayed()));

    }

}