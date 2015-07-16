package br.com.caelum.projetoespresso;




import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;


/**
 * Created by matheus on 14/07/15.
 */

@LargeTest
public class MainTest extends ActivityInstrumentationTestCase2 {


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


    }
}
