package com.example.ajayrwarrier.goalkeeper;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalA=0;
    int goalB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        final String Aname = bundle.getString("Aname");
        final String Bname = bundle.getString("Bname");
        TextView teamA = (TextView)findViewById(R.id.team_A);
        TextView teamB = (TextView)findViewById(R.id.team_B);
        final TextView result= (TextView)findViewById(R.id.result);
        final TextView scoreA = (TextView)findViewById(R.id.teamA_scoretab);
        final TextView scoreB =(TextView)findViewById(R.id.team_Bscoretab);
        teamA.setText(Aname);
        teamB.setText(Bname);
        ImageButton teamAButton = (ImageButton)findViewById(R.id.teamA_goal);
        ImageButton finishButton = (ImageButton)findViewById(R.id.finish);
        final ImageButton resetButton = (ImageButton)findViewById(R.id.reset);
        ImageButton teamBButton = (ImageButton)findViewById(R.id.teamB_goal);
        teamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalA++;
                scoreA.setText(String.valueOf(goalA));

            }
        });
        teamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalB++;
                scoreB.setText(String.valueOf(goalB));
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalA=0;
                goalB=0;
                scoreA.setText(String.valueOf(goalA));
                scoreB.setText(String.valueOf(goalB));
            }
        });
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goalA>goalB){
                    result.setText("Winner: "+Aname);
                }
                else if(goalA<goalB){
                    result.setText("Winner: "+Bname);
                }
                else{
                    result.setText("Draw!");
                }
            }
        });




    }
}
