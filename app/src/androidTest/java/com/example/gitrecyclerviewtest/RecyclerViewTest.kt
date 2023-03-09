package com.example.gitrecyclerviewtest

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerViewTest {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun scroll_to_item(){

        Espresso.onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(9)
        )

        /*

        onView(
        withText(R.string_'item at position 10. Need to create class object, and call string'_______))
        .check(matches(isDisplayed()))

         */


    }

}