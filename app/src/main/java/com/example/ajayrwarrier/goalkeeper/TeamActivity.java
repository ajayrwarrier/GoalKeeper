package com.example.ajayrwarrier.goalkeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Ajay R Warrier on 22-10-2016.
 */
public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        ImageButton nextButton = (ImageButton) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(TeamActivity.this,MainActivity.class);
                TextView teamAView = (TextView) findViewById(R.id.teamA);
                TextView teamBView = (TextView) findViewById(R.id.teamB);
                String Aname=teamAView.getText().toString();
                String Bname=teamBView.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("Aname",Aname);
                bundle.putString("Bname",Bname);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}

