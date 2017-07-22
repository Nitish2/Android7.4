package com.example.hp.facelook;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityA extends AppCompatActivity {
    //Creating Edit Text and Button objects .
    EditText editTextname, editTextphone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intializing objects
        setContentView(R.layout.activity_main_activity_a);
        editTextname = (EditText) findViewById(R.id.name);
        editTextphone = (EditText) findViewById(R.id.phone);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  // Click listener method to perform click function
                //Creating string objects in order to take input from the user .
                String uname = editTextname.getText().toString();
                String uphone = editTextphone.getText().toString();
                // Creating IF ELSE statements for the 3 conditions .

                /** If uname = " Nitish " AND uphone = " 88812120" this condition is true
                 then it will move to the next activity .
                        **/
                if (uname.equals("Nitish") && uphone.equals("88812120"))
                {   // Creating and initializing intent object .
                    Intent intentA = new Intent(MainActivityA.this, MainActivityB.class);
                    Bundle bundle = new Bundle(); //Creating bundle object
                    //Puting string " uname" into the bundle with a specific key "vname".
                    bundle.putString("vname",uname);
                    intentA.putExtras(bundle); // Bundle passing through intent
                    Toast.makeText(getApplicationContext(),"Sucessfully Logged in",
                            Toast.LENGTH_SHORT).show(); //Toast message when the user logged in .
                    startActivity(intentA); // Start activity
                }

                /**
                  ELSE IF (uname.equals("") OR uphone.equals("")) .
                  If any of the field is empty then it will not move to the another
                  activity
                **/
                else if (uname.equals("") || uphone.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Username and PhoneNo. cannot be empty",
                            Toast.LENGTH_LONG).show(); //Toast Message
                }
                else { // ElSE statement if any of the field is wrong .
                    Toast.makeText(getApplicationContext(), "Wrong username or phoneNo.",
                            Toast.LENGTH_LONG).show(); //Toast message

                }


            }
        });

    }
}