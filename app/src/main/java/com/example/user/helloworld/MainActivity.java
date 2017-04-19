package com.example.user.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    // onCreate() is the entry point to the activity
    protected void onCreate(Bundle savedInstanceState) {
        // Call the version of onCreate() in the superclass (i.e. Activity)
        super.onCreate(savedInstanceState);
        // Links to the layout file
        setContentView(R.layout.activity_main);
        // (Button) is the cast conversion from View to Button
        // Obtain the button component using the ID
        Button b = (Button)findViewById(R.id.btn1);
        // This indicates that the current object (this)
        // will act as the listener object for the button
        b.setOnClickListener(this);
    }

    public void onClick(View view) {
        // Obtain the TextView component using the ID
        TextView tv = (TextView)findViewById(R.id.tv1);
        // Obtain the EditText component  the ID
        EditText et = (EditText)findViewById(R.id.et1);
        // We then convert the contents of the EditText
        // to an int so that we can perform the calculation on it
        int yearOfBirth = Integer.parseInt(et.getText().toString());

        if (yearOfBirth == 0) {
            tv.setText("You've entered nothing!");
        }
        else if (yearOfBirth > 2016) {
            tv.setText("This year is in the future");
        }
        else {
            // Calculation
            int age = 2016 - yearOfBirth;
            tv.setText("Your age is: " + String.valueOf(age));
        }
    }

}
