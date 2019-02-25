package com.example.dnd5etool;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View charButton = findViewById(R.id.buttonChar);
        View diceButton = findViewById(R.id.buttonDice);
        View trackableButton = findViewById(R.id.buttonTrackables);
        View spellButton = findViewById(R.id.buttonSpells);
        View monsterButton = findViewById(R.id.buttonMonsters);
        View itemButton = findViewById(R.id.buttonItems);
        charButton.setOnClickListener(this);
        diceButton.setOnClickListener(this);
        trackableButton.setOnClickListener(this);
        spellButton.setOnClickListener(this);
        monsterButton.setOnClickListener(this);
        itemButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.buttonChar: //Creates the character sheet activity
                intent = new Intent(this, CharSheet.class);
                startActivity(intent);
                break;
            case R.id.buttonDice: //Creates the dice activity
                intent = new Intent(this, Dice.class);
                startActivity(intent);
                break;
            case R.id.buttonTrackables: //Creates the trackables activity
                intent = new Intent(this, Trackables.class);
                startActivity(intent);
                break;
            case R.id.buttonSpells: //Creates the spells activity
                intent = new Intent(this, Spells.class);
                startActivity(intent);
                break;
            case R.id.buttonMonsters: //Creates the spells activity
                intent = new Intent(this, Monsters.class);
                startActivity(intent);
                break;
            case R.id.buttonItems: //Creates the spells activity
                intent = new Intent(this, Items.class);
                startActivity(intent);
                break;

        }
    }
}
