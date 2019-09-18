package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity
{
    TextView name;
    EditText nameEdit;
    TextView email;
    EditText emailEdit;
    TextView password;
    EditText passwordEdit;
    TextView confirm;
    EditText confirmEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameTextView);
        nameEdit = findViewById(R.id.nameEditText);
        email = findViewById(R.id.emailTextView);
        emailEdit = findViewById(R.id.emailEditText);
        password = findViewById(R.id.passwordTextView);
        passwordEdit = findViewById(R.id.passwordEditText);
        confirm = findViewById(R.id.confirmationTextView);
        confirmEdit = findViewById(R.id.confirmationEditText);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (
                        nameEdit.getText().toString().matches("") ||
                        emailEdit.getText().toString().matches("") ||
                        passwordEdit.getText().toString().matches("") ||
                        confirmEdit.getText().toString().matches("")
                   )
                {
                    Toast.makeText(FormActivity.this, "Please enter all information.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
