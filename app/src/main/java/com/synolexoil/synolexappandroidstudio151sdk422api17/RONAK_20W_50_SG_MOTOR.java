package com.synolexoil.synolexappandroidstudio151sdk422api17;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RONAK_20W_50_SG_MOTOR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ronak_20_w_50__sg__motor);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "IRANSansMobile_Light.ttf");

        Button button3 = (Button) findViewById(R.id.button3);

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        TextView textView13 = (TextView) findViewById(R.id.textView13);

        textView12.setTypeface(typeface);
        textView13.setTypeface(typeface);

        button3.setTypeface(typeface);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RONAK_20W_50_SG_MOTOR.this, BuyActivity.class);
                startActivity(intent);

            }
        });
    }
}
