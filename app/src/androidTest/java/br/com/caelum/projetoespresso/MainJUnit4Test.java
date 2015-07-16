package br.com.caelum.projetoespresso;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * Created by matheus on 15/07/15.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainJUnit4Test {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    public void testaTela2() {

        Espresso.onView(
                ViewMatchers.withId(R.id.hello_world)
        ).check(
                ViewAssertions.matches(
                        ViewMatchers.isDisplayed()
                )
        );

    }
}
