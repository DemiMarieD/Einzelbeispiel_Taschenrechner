package com.example.demi.einzelbeispiel_taschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ergebnisTextView;     //Ergebniss wird dargestellt

    EditText dividendText;          //Erster operant
    EditText divisorText;           //Zweiter operant

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View References
        ergebnisTextView = (TextView) findViewById(R.id.ErgebnissText);
        dividendText = (EditText) findViewById(R.id.Dividend);
        divisorText = (EditText) findViewById(R.id.Divisor);

        //Button References
        Button calcBtn = (Button) findViewById(R.id.berechenBtn);    //entspricht in IOs IBOutlet
        //click listener (=IBAction)
       calcBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               try{
               //Werte holen
               Float dividend = Float.parseFloat(dividendText.getText().toString());
               Float divisor = Float.parseFloat(divisorText.getText().toString());

                   //Ergebnis berechnen
                   Float ergebnis = dividend / divisor;

                   //an app weitergeben
                   ergebnisTextView.setText(Float.toString(ergebnis));

               } catch (Exception e){
                   ergebnisTextView.setText("Werte fehlen!");
               }


           }
       });
    }
}
