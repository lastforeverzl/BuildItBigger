package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertFalse;


/**
 * Created by lei on 7/26/17.
 */

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void verifyAsyncTaskResult() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void jokeReceived(String joke) {
                Log.d("JokeTest", joke);
                assertFalse("EmptyJoke", joke.isEmpty());
                latch.countDown();
            }
        }).execute();
        latch.await();
    }
}
