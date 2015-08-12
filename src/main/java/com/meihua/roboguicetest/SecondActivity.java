package com.meihua.roboguicetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

/**
 * Created by bobzeng on 15/8/12.
 * test
 */
@ContentView(R.layout.activity_second)
public class SecondActivity extends RoboActivity {
    @InjectView(R.id.second)Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new FirstEvent("first btn clicked"));
            }
        });
    }
}
