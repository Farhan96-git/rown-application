package com.lazycoder.addingnewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import org.w3c.dom.Text;


public class SecondActivitiy extends AppCompatActivity {
       private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activitiy);
        textView=(TextView)findViewById(R.id.textViewId);
        Bundle extras = getIntent().getExtras();
        String exampleString = extras.getString("name");
        textView.setText("Friends Name : "+exampleString);

        //Toast.makeText(getApplicationContext(),intent.getStringExtra("name"),Toast.LENGTH_SHORT).show();

    }
}
