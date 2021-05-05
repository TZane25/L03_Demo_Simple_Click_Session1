package sg.edu.rp.c346.id20011280.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    // Declaring variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // linking field variables to UI components in the layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.ButtonDisplay);
        etInput = findViewById(R.id.editTextTextPersonName);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);

        //variable name   //finding the view ( referencing to the id crated in the XML file)



        // what will happen when the button is clicked
        // button click
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                //toggle button code action

                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }

                etInput.getText().toString(); // converting text input to string
                String stringResponse = etInput.getText().toString(); // assign to variable
                tvDisplay.setText(stringResponse); // displaying the values and displaying on the screen

                etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    // Write the code when male selected
                    tvDisplay.setText("He says " + stringResponse);

                } else {
                    // Write the code when female selected
                    tvDisplay.setText("She says " + stringResponse);

                }

            }
        });






    };

    }
