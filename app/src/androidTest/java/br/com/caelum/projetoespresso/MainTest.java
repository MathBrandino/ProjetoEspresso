package br.com.caelum.projetoespresso;




import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;


/**
 * Created by matheus on 14/07/15.
 */

@LargeTest
public class MainTest extends ActivityInstrumentationTestCase2<MainActivity> {


    public MainTest() {
        super(MainActivity.class);
    }

    public void testaTela(){
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
                ViewActions.click()
        );

        Espresso.onView(
                ViewMatchers.withText("Abacaxi")
        ).check(
                ViewAssertions.doesNotExist()
        );


    }
}
