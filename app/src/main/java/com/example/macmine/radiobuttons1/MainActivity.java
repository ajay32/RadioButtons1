package com.example.macmine.radiobuttons1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgNames;
    private RadioButton rb_Button , girl2Button;
    private Button btnSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        addinglistener();


    } //end of oncreate method



    private void addinglistener() {

        btnSelected.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                int id = rgNames.getCheckedRadioButtonId();  // get id of checked radio button  i means id that we defined in xml file @+id  (it has an integer value in java files

                rb_Button = (RadioButton) findViewById(id);    // initilzing that radio button n getting text from it ...

                if (rb_Button.getText().equals("Apple")) {  // case senstive  // it is getting text n coming to text as an object ..so it it case senstive  apple and Apple is differnt  ...so make sure to check the text of radion button

                    startActivity(new Intent(MainActivity.this , SecondActivity.class));

                } else if (rb_Button.getText().equals("Girl")){


                    girl2Button.setChecked(true);

                }
                else {

                    Toast.makeText(MainActivity.this, rb_Button.getText() + "", Toast.LENGTH_SHORT).show(); //n showing it

                    girl2Button.setChecked(false);
                }
            }
        });


    }

    private void init() {

        rgNames = (RadioGroup) findViewById(R.id.rg_names);
        btnSelected = (Button) findViewById(R.id.btn_selected);
        girl2Button = (RadioButton) findViewById(R.id.rb_girl2);
    }


}
