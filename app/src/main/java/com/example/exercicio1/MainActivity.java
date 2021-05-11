package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_Converte;
    TextView txt_Resultado;
    EditText txt_Num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Converte.findViewById(R.id.btn_converte);
        txt_Num.findViewById(R.id.txt_num);
        txt_Resultado.findViewById(R.id.txt_resultado);

        btn_Converte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n,Numconvert;
                n=Double.parseDouble(txt_Num.getText().toString());
                Numconvert=n*(1.8)+23;

                txt_Resultado.setText(String.valueOf(Numconvert));

            }
        });
    }
}