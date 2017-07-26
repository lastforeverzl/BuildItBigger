package com.udacity.gradle.androidjokedisplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lei on 7/25/17.
 */

public class DisplayJokeActivity extends AppCompatActivity {

    private static final String EXTRA_JOKE = "extra_joke";

    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, DisplayJokeActivity.class);
        intent.putExtra(EXTRA_JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayjoke);

        String joke = getIntent().getStringExtra(EXTRA_JOKE);
        TextView textView = (TextView) findViewById(R.id.tv_joke);
        textView.setText(joke);
    }
}
