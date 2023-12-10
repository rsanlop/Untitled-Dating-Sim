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

import org.hamcrest.Matchers;
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
        // pressed play button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.startButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.playButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).check(ViewAssertions.matches(isDisplayed()));

    }

    @org.junit.Test
    public void testSwampButton() {
        // pressed swamp button. boom.
        // same logic is applied in the other buttons on this screen so if this one works the rest work too
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).check(ViewAssertions.matches(isDisplayed()));
    }

    @org.junit.Test
    public void testCharacterScreen() {
        // pressed character screen. boom.
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).check(ViewAssertions.matches(isDisplayed()));

    }
    @org.junit.Test
    public void testInstructionsScreen() {
        // pressed character screen. boom.
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Matchers.anyOf(ViewMatchers.withId(R.id.riddleGame), ViewMatchers.withId(R.id.triviaGame),
                ViewMatchers.withId(R.id.kissingGame));
    }

    @org.junit.Test
    public void testMiniGameNext() {
        // pressed nextButton. boom.
        // same logic is applied in the other minigames' screen buttons so if this one works the rest work too
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).check(ViewAssertions.matches(isDisplayed()));
    }


    @org.junit.Test
    public void testStatsNextButton() {
        // pressed yes button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).check(ViewAssertions.matches(isDisplayed()));
    }


    @org.junit.Test
    public void testYesButton2() {
        // pressed yes button x2. boom.
        // This one is to test if after clicking yes twice (and going on the third date)
        // the no button appears
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.noButton)).check(ViewAssertions.matches(isDisplayed()));
    }

    @org.junit.Test
    public void testNoButton() {
        // pressed no button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.noButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.jojosonButton)).check(ViewAssertions.matches(isDisplayed()));
    }
    @org.junit.Test
    public void testjojosonButton() {
        // pressed jojoson button. boom.
        // same logic is applied in the other buttons on this screen so if this one works the rest work too
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.noButton)).check(ViewAssertions.matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.jojosonButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.doneButton)).check(ViewAssertions.matches(isDisplayed()));
    }

    @org.junit.Test
    public void testdoneButton() {
        // pressed done button. boom.
        Espresso.onView(ViewMatchers.withId(R.id.continueButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.yesButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.swampButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.characterScreen)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.instructionScreen)).perform(ViewActions.click());
        Espresso.onView(Matchers.anyOf(ViewMatchers.withId(R.id.rbutton1), ViewMatchers.withId(R.id.tbutton1),
                ViewMatchers.withId(R.id.kissmescreen))).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.statsNextButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.noButton)).check(ViewAssertions.matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.jojosonButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.doneButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.startButton)).check(ViewAssertions.matches(isDisplayed()));
    }

}