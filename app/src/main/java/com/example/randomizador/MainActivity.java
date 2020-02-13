package com.example.randomizador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    private EditText txtNum1;
    private Button btnPlay;
    private TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        txtRes = (TextView) findViewById(R.id.txtRes);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(txtNum1.getText().toString());
                if (num == 0) {
                    Toast.makeText(getApplicationContext(), "Digite um número", Toast.LENGTH_SHORT).show();
                } else {
                    Random random = new Random();
                    String res = txtRes.getText().toString();
                    int numRes = random.nextInt(num + 1);
                    txtRes.setText("Número randomizado: " + numRes);
                }
            }
        });

    }
}
