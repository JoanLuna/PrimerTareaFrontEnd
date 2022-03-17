package com.example.primertareafrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2;
    TextView tv1;
    Button btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtNum01);
        et2 = (EditText)findViewById(R.id.txtNum02);
        tv1 = (TextView)findViewById(R.id.lblResultado);
        btnSum = (Button)findViewById(R.id.btnSumar);
        btnSum.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int n1, n2, res;
        n1 = Integer.parseInt(et1.getText().toString());
        n2 = Integer.parseInt(et2.getText().toString());
        res = n1 + n2;
        tv1.setText("El Resultado Es:" + res);
        Toast.makeText(getApplicationContext(),"El Resultado Es:" + res, Toast.LENGTH_LONG).show();
    }
}