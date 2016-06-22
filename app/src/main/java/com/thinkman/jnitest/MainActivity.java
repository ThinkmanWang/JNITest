package com.thinkman.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.thinkman.jnitest.jni.HelloJni;

public class MainActivity extends AppCompatActivity {

    TextView m_tvHello = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_tvHello = (TextView) findViewById(R.id.tv_hello);
        m_tvHello.setText(new HelloJni().sayHello());
    }
}
