package com.andrey.mvptest;

import android.database.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainPresenter.View {

    MainPresenter mainPresenter;

    TextView userInfoTV;
    EditText fullName;
    EditText email;
    TextView symbolsNumber;
    EditText textTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);

        userInfoTV = (TextView) findViewById(R.id.fullInformation);
        fullName = (EditText) findViewById(R.id.fullName);
        email = (EditText) findViewById(R.id.email);
        symbolsNumber = (TextView) findViewById(R.id.symbolsNumber);
        textTV = (EditText) findViewById(R.id.someText);

        fullName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mainPresenter.updateFullName(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mainPresenter.updateEmail(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        textTV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mainPresenter.updateSomeText(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    @Override
    public void updateUserInfoTextView(String info) {
        userInfoTV.setText(info);
    }

    @Override
    public void updateString(int count) {
        symbolsNumber.setText("symbols number = " + String.valueOf(count));
    }
}
