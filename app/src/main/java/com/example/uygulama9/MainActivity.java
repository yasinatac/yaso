package com.example.uygulama9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText_Sayilar;
    Button button_TekSayi,button_CiftSayi,button_TumSayi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_Sayilar=findViewById(R.id.editTextTextMultiLine_Sayilar);
        button_CiftSayi = findViewById(R.id.button_CiftSayilar);
        button_TekSayi =findViewById(R.id.button_TekSayilar);
        button_TumSayi = findViewById(R.id.button_TumSayilar);
    }

    public void ciftSayilar(View view) {
        editText_Sayilar.setText("");
        for (int i=0;i<=15;i++){
            if(i%2==0){
                editText_Sayilar.setText(editText_Sayilar.getText()+"\n"+i);
            }
        }
    }
    public void tekSayilar(View view) {
        editText_Sayilar.setText("");
        for (int i=0;i<=15;i++){
            if(i%2!=0){
                editText_Sayilar.setText(editText_Sayilar.getText()+"\n"+i);
            }
        }
    }
    public void tumSayilar(View view) {
        editText_Sayilar.setText("");
        for (int i=0;i<=15;i++){
            editText_Sayilar.setText(editText_Sayilar.getText()+"\n"+i);
        }
    }
}
