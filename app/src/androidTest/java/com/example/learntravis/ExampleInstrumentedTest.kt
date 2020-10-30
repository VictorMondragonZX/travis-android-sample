package com.example.learntravis

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressBack
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import java.lang.Thread.sleep

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


public class ExampleInstrumentedTest {
    @get:Rule
    public val activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(
        MainActivity::class.java,
        true
    )

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.learntravis", appContext.packageName)
    }

    @Test
    fun testBtnNext() {
        onView(withId(R.id.fab))
            .perform(click())
        onView(withText("NEXT"))
            .perform(click())
            .perform(pressBack())
    }
}