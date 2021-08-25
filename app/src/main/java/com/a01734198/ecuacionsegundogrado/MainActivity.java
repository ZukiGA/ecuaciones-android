package com.a01734198.ecuacionsegundogrado;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    public void solve(View v) {
        Double a = Double.valueOf(aTxt.getText().toString());
        Double b = Double.valueOf(bTxt.getText().toString());
        Double c = Double.valueOf(cTxt.getText().toString());
        String root1Txt = solver.getRoot1(a, b, c);
        String root2Txt = solver.getRoot2(a, b, c);
        root1.setText(root1Txt);
        root2.setText(root2Txt);
    }


}