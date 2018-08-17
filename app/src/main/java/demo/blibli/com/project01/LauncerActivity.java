package demo.blibli.com.project01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LauncerActivity extends AppCompatActivity {

    private TextView txtName;
    private Button btnLogin;

    private EditText etUserName;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcer);

        txtName = findViewById(R.id.textView3);
        btnLogin = findViewById(R.id.button);
        etUserName = findViewById(R.id.editText);
        etPassword = findViewById(R.id.editText2);

        txtName.setText("wow");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LauncerActivity.this, DetailActivity.class);
                intent.putExtra("username",etUserName.getText().toString());
                intent.putExtra("password",etPassword.getText().toString());
                startActivity(intent);
                //txtName.setText(etUserName.getText().toString());

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtName.setText("Mari Belajar Android!");
    }
}
