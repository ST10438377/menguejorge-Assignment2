package com.example.assignment2
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test

class MainActivity2Test {

    @Test
    fun testFeedButton() {
        // Start the activity scenario
        val activityScenario = ActivityScenario.launch(MainActivity2::class.java)

        // Click the feed button
        onView(withId(R.id.feedButton)).perform(click())

        // Check if hunger level increases by 10
        onView(withId(R.id.hungerView)).check(matches(withText("Hunger Level: 60")))

        // Check if feed count is updated
        onView(withId(R.id.feedCount)).check(matches(withText("Feed Count: 1")))

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testCleanButton() {
        // Start the activity scenario
        val activityScenario = ActivityScenario.launch(MainActivity2::class.java)

        // Click the clean button
        onView(withId(R.id.cleanButton2)).perform(click())

        // Check if cleanliness level increases by 10
        onView(withId(R.id.cleanView)).check(matches(withText("Cleanliness Level: 60")))

        // Check if clean count is updated
        onView(withId(R.id.cleanCount)).check(matches(withText("Clean Count: 1")))

        // Close the activity scenario
        activityScenario.close()
    }

    @Test
    fun testPlayButton() {
        // Start the activity scenario
        val activityScenario = ActivityScenario.launch(MainActivity2::class.java)

        // Click the play button
        onView(withId(R.id.playButton3)).perform(click())

        // Check if happiness level increases by 10
        onView(withId(R.id.happyView)).check(matches(withText("Happiness Level: 60")))

        // Check if play count is updated
        onView(withId(R.id.playCount)).check(matches(withText("Play Count: 1")))

        // Close the activity scenario
        activityScenario.close()
    }

    // Add more tests as needed
}


