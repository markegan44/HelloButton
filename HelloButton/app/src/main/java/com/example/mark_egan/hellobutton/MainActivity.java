package com.example.mark_egan.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMessageTextView;
    private int mCounter=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this method is called when the app launches.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code you add goes after the setContentView call.
        mMessageTextView = findViewById(R.id.message_textview);

        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                updateView();
            }
        });




        // mMessageTextView.setText("Mark is Cool");
        //Log.d( "HB","This is a log cat log. Logs are important");

        //example crash

       // mMessageTextView = findViewById(0);
       // mMessageTextView.setText("This will crash!");

    }

    public void HandleDecrement(View view) {
        mCounter--;
        updateView();
    }

    public void HandleIncrement(View view) {
        mCounter++;
        updateView();
    }

    private void updateView() {
        mMessageTextView.setText(getString(R.string.message_format, mCounter));

        if (mCounter > 10) {
            mMessageTextView.setVisibility(View.INVISIBLE);
        } else
            mMessageTextView.setVisibility(View.VISIBLE);

    }


}
