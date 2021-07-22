package com.example.gamebattleofcastle2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.gamebattleofcastle2.Gameplay.Castle;
import com.example.gamebattleofcastle2.Gameplay.CavalryCastle;
import com.example.gamebattleofcastle2.Gameplay.InfantryCastle;

public class MainActivity extends AppCompatActivity {

    Button btnFight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CavalryCastle c1 = new CavalryCastle();
        InfantryCastle c2 = new InfantryCastle();



        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c2;
        fightingCastles[1] = c1;

        btnFight = findViewById(R.id.btnFight);
        btnFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Player 2 WIN", Toast.LENGTH_SHORT).show();
            }
        });

    }
}