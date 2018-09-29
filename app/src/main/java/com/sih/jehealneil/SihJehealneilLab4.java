package com.sih.jehealneil;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SihJehealneilLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sih_jehealneil_lab4);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITH", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH", "onStop: ");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH", "onPause: ");
    }

    @Override
    protected void onResume() {
     super.onResume();
     Log.d("4ITH", "onResume:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "onDestroy");

    }

    public void displayToast(View v) {
        Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
        Log.d("4ITH", "Toast");

    }

    public void displaySnack(View v) {
        Snackbar.make(v, "This is a snack", Snackbar.LENGTH_LONG).show();
        Log.d("4ITH", "SnackBar");
    }
}
