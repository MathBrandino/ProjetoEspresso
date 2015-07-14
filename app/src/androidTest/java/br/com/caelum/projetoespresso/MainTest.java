package br.com.caelum.projetoespresso;



import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import org.hamcrest.Matchers;


/**
 * Created by matheus on 14/07/15.
 */

@LargeTest
public class MainTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public MainTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testaTela(){
        Espresso.onView(
                ViewMatchers.withText("Hello world!")
        ).check(
                ViewAssertions.matches(
                        Matchers.not(
                            ViewMatchers.isDisplayed()
                        )
                )
        );

    }
}
