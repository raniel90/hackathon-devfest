package br.com.vcs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ColaboreFocoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colabore_foco);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ColaboreFocoActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}