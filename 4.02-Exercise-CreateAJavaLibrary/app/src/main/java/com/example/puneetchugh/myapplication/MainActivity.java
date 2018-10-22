package com.example.puneetchugh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.puneetchugh.modulejoke.MyClass;
import com.example.puneetchugh.puneetlibrary.PuneetActivity;
import com.puneet.chugh.JokeSmith;
import com.puneet.chugh.NewJokeTeller;

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

        TextView textView1 = findViewById(R.id.textView);
        textView1.setText((new NewJokeTeller()).getJoke());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), PuneetActivity.class));
            }
        });
    }
}
