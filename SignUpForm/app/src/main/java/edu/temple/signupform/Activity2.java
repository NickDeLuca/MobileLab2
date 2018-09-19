package edu.temple.signupform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity {

    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        msg = (TextView)findViewById(R.id.msg);

        Intent received = getIntent();

        String keyName = "intentdata";
        String nameText = received.getStringExtra(keyName);

        String msgText = "Welcome, " + nameText + ", to the SignUpForm App!";

        msg.setText(msgText);

    }
}
