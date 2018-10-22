package chugh.puneet.com.newmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import chugh.puneet.com.joke.JokeTeller;

public class ModuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_activity_main);

        TextView textView = findViewById(R.id.text_view);
        textView.setText((new JokeTeller()).getJoke());
    }
}
