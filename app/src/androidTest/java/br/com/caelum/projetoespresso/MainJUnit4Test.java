package br.com.caelum.projetoespresso;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.Button;
import android.widget.VideoView;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;

/**
 * Created by matheus on 15/07/15.
 */
@RunWith(AndroidJUnit4.class)
public class MainJUnit4Test {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void telaTest() {

        onView(
                ViewMatchers.withId(R.id.hello_world)
        ).check(
                matches(
                        ViewMatchers.isDisplayed()
                )
        );

    }

    @Test
    public void testaTest(){
        testeW();

    }

    public void testeW(){


        onView(
                ViewMatchers.withId(R.id.botao)
        ).perform(
                ViewActions.click()
        );
        onView(
                withText("T")
        ).check(
                matches(
                        ViewMatchers.withId(R.id.botao3)
                )
        ).perform(
                ViewActions.click()
        );

    }

    @Test
    public void testaClickLista(){

        onData(
                allOf(
                        Matchers.is(
                                Matchers.instanceOf(String.class)
                        )
                )
        ).atPosition(0)
                .perform(
                        ViewActions.click()
                )
                .check(
                        matches(
                                ViewMatchers.isDisplayed()
                        )

                );


        onData(
                allOf(
                        is(
                                instanceOf(String.class)
                        )
                )

        ).atPosition(0).check(
                matches(
                        isDisplayed()

                )
        ).check(
                matches(
                        not(
                                withText("Matheus")
                        )
                )
        );

    }



}
