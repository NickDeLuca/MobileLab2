package edu.temple.signupform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button save;
    EditText name;
    EditText email;
    EditText pass;
    EditText conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        save = (Button)findViewById(R.id.btnSave);
        name = (EditText) findViewById(R.id.editName);
        email = (EditText) findViewById(R.id.editEmail);
        pass = (EditText) findViewById(R.id.editPass);
        conf = (EditText) findViewById(R.id.editConf);

        View.OnClickListener ocl = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String toastmsgEmpty = "Please enter a value for every field.";
                String toastmsgPass = "Passwords do not match.";
                if(name.getText().toString().equals("") || email.getText().toString().equals("") || pass.getText().toString().equals("") ||
                        conf.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, toastmsgEmpty, Toast.LENGTH_LONG).show();
                }
                else if(!pass.getText().toString().equals(conf.getText().toString())){
                    Toast.makeText(MainActivity.this, toastmsgPass, Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, Activity2.class);

                    String nameText = name.getText().toString();

                    String keyName = "intentdata";
                    intent.putExtra(keyName, nameText);
                    startActivity(intent);
                }
            }
        };

        save.setOnClickListener(ocl);

    }


}
