package com.example.puneetchugh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.puneetchugh.modulejoke.MyClass;
import com.puneet.chugh.JokeSmith;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith jokeSmith = new JokeSmith();

        TextView textView = findViewById(R.id.id_text_view);
        textView.setText(jokeSmith.getJoke());


        MyClass myClass = new MyClass();
        TextView textView2 = findViewById(R.id.text_view_2);
        textView2.setText(myClass.getJoke());
    }
}
