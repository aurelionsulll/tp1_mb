package com.example.tp1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"test");

        int v = 54;
        int n = v / 9 + 3;
        int f = factorielle(n);
        Log.i(TAG, n+"! = "+f);

        TextView texte = findViewById(R.id.vv2);
        texte.setText("Ça marche");

    }

    private int factorielle(int n)
    {
        int r;
        if (n > 1) {
            int fnm1 = factorielle(n-1);
            r = n * fnm1;
        } else {
            r = 1;
        }
        return r;
    }

}
