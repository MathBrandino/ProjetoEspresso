package br.com.caelum.projetoespresso;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by matheus on 15/07/15.
 */
@RunWith(AndroidJUnit4.class)
public class MainJUnit4Test {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void telaTest() {

        Espresso.onView(
                ViewMatchers.withId(R.id.hello_world)
        ).check(
                ViewAssertions.matches(
                        ViewMatchers.isDisplayed()
                )
        );

    }

    @Test
    public void testeW(){


        Espresso.onView(
                ViewMatchers.withId(R.id.botao)
        ).perform(
                ViewActions.click()
        );
        Espresso.onView(
                ViewMatchers.withText("T")
        ).check(
                ViewAssertions.matches(
                        ViewMatchers.withId(R.id.botao3)
                )
        ).perform(
                ViewActions.click()
        );
    }
}
