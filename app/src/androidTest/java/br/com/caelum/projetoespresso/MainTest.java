package br.com.caelum.projetoespresso;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import org.hamcrest.Matchers;


/**
 * Created by matheus on 14/07/15.
 */

@LargeTest
public class MainTest extends ActivityInstrumentationTestCase2<MainActivity> {


    public MainTest() {
        super(MainActivity.class);
    }

    public void testaTela() {
        getActivity();

        Espresso.onView(
                ViewMatchers.withId(R.id.hello_world)
        ).check(
                ViewAssertions.matches(
                        ViewMatchers.isDisplayed()
                )
        );

        Espresso.onView(
                ViewMatchers.withId(R.id.edit_text)
        ).perform(
                ViewActions.typeTextIntoFocusedView("Banana")
        ).check(
                ViewAssertions.matches(
                        ViewMatchers.withText("Banana")
                )
        );

        Espresso.onView(
                ViewMatchers.withId(R.id.botao)
        ).perform(
                ViewActions.click()
        );


        Espresso.onView(
                ViewMatchers.withId(R.id.botao2)
        ).perform(
                ViewActions.longClick(),
                ViewActions.click()

        );

    }

    public void testaClick(){
        getActivity();

        Espresso.onView(
                ViewMatchers.withId(R.id.botao)
        ).perform(
                ViewActions.doubleClick()
        );
        Espresso.onView(
                ViewMatchers.withId(R.id.botao2)
        ).perform(
                ViewActions.click()
        );
    }

    public void testeW(){

        getActivity();

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
