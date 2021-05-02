package com.zymixx.simplemessenger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

// экран входа

public class LoginUp extends AppCompatActivity {
    EditText login ;
    EditText password;
    Button enterButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        findButton();
    }

    public void findButton(){
        login = findViewById(R.id.login_screen_login_et);
        password = findViewById(R.id.login_screen_password_et);
        enterButton = findViewById(R.id.enter_button);

        enterButton.setOnClickListener(new OnEnterButtonClicked());
    }

    class OnEnterButtonClicked implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String loginString = login.getText().toString();
            String passwordString = password.getText().toString();

            Intent intent = new Intent(LoginUp.this, DialogList.class);
            startActivity(intent);
        }
    }

}
