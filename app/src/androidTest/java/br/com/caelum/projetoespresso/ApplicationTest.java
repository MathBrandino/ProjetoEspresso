package br.com.caelum.projetoespresso;

import android.app.Application;
import android.support.test.espresso.Espresso;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */


@LargeTest
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);



    }

}