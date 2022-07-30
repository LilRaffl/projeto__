package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_principal_layout extends AppCompatActivity {

    CardView cardHardware,cardPerfil, cardSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardHardware =findViewById(R.id.cardHardware);
        cardPerfil = findViewById(R.id.cardPerfil);
        cardSobre = findViewById(R.id.cardSobre);

        cardHardware.setOnClickListener((View.OnClickListener) this);
        cardPerfil.setOnClickListener((View.OnClickListener) this);
        cardSobre.setOnClickListener((View.OnClickListener) this);

    }
     public void onClick(View view) {

        switch ( view.getId()){

            case R.id.cardHardware:
                startActivity(new Intent(getApplicationContext(),
                        HardwareActivity.class));
                break;
        }


     }

}