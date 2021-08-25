package com.a01734198.ecuacionsegundogrado;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText aTxt;
    EditText bTxt;
    EditText cTxt;
    EditText root1;
    EditText root2;
    Solver solver;
    AlertDialog.Builder builder;
    AlertDialog alert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solver = new Solver();
        aTxt = findViewById(R.id.aTxt);
        bTxt = findViewById(R.id.bTxt);
        cTxt = findViewById(R.id.cTxt);
        root1 = findViewById(R.id.root1);
        root2 = findViewById(R.id.root2);
        createAlert();

    }

    public void createAlert() {
        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Aviso");
        builder.setMessage("No es una ecuación de segundo grado");
        builder.setPositiveButton("Aceptar", null);
        alert = builder.create();
    }

    public void solve(View v) {
        String aText = aTxt.getText().toString();
        String bText = bTxt.getText().toString();
        String cText = cTxt.getText().toString();

        if (bText.length() == 0) bText = "0";
        if (cText.length() == 0) cText = "0";
        if (aText.length() == 0) aText = "0";

        Double a = Double.valueOf(aText);
        Double b = Double.valueOf(bText);
        Double c = Double.valueOf(cText);

        if (a == 0) {
            alert.show();
        } else {
            String root1Txt = solver.getRoot1(a, b, c);
            String root2Txt = solver.getRoot2(a, b, c);
            root1.setText(root1Txt);
            root2.setText(root2Txt);
        }




    }


}