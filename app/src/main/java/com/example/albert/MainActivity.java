package com.example.albert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public String kelime = "";
    public String sifre = "";
    public String cevap = "";
    public String txt1 = "";
    public String txt2 = "";
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onayla1(View view) {
        EditText t= findViewById(R.id.txt1);
        String kelime=t.getText().toString();
        EditText u= findViewById(R.id.textArea1);

        cevap="";
        char[] kelimeler = kelime.toCharArray();
        char[] alfabe = {'-', 'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z', '.', ',', 'Q', 'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M', 'N', 'O', 'Ö', 'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '='};
        for (int i = 0; i < kelimeler.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 73; j++) {
                    if (kelimeler[i] == alfabe[j]) cevap += alfabe[j + 2];
                }

            } else {
                for (int j = 0; j < 73; j++) {
                    if (kelimeler[i] == alfabe[j]) cevap += alfabe[j - 1];
                }
            }
        }
        u.setText(cevap);


    }

    public void onayla2(View view) {

        EditText t= findViewById(R.id.txt2);
        String sifre=t.getText().toString();
        EditText u= findViewById(R.id.textArea2);


        cevap="";
        char[] sifreler = sifre.toCharArray();
        char[] alfabe = {'-', 'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z', '.', ',', 'Q', 'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M', 'N', 'O', 'Ö', 'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '='};
        for (int i = 0; i < sifreler.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 73; j++) {
                    if (sifreler[i] == alfabe[j]) cevap += alfabe[j - 2];
                }

            } else {
                for (int j = 0; j < 73; j++) {
                    if (sifreler[i] == alfabe[j]) cevap += alfabe[j + 1];
                }
            }
        }
        u.setText(cevap);

    }


}