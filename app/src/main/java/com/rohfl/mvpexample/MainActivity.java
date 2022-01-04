package com.rohfl.mvpexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rohfl.mvpexample.interfaces.MainInterface;
import com.rohfl.mvpexample.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainInterface {

    TextView changedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter mainPresenter = new MainPresenter(this);

        changedText = findViewById(R.id.changed_text);
        EditText editText = findViewById(R.id.edittext);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            mainPresenter.doTheTask(editText.getText().toString().trim());
        });

    }

    @Override
    public void changeText(String s) {
        changedText.setText(s);
    }
}