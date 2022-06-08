package meet.patel.n01460090;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ApartmentActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);


        CheckBox apt1 = findViewById(R.id.MeetApartmentCheckBox1);
        CheckBox apt2 = findViewById(R.id.MeetApartmentCheckBox2);
        CheckBox apt3 = findViewById(R.id.MeetApartmentCheckBox3);
        Button btn = findViewById(R.id.MeetApartmentBtn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (apt1.isChecked() || apt2.isChecked() || apt3.isChecked())
                {
                    Intent i = new Intent(ApartmentActivity.this, PaymentActivity.class);
                    startActivity(i);
                }

                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(), R.string.SelectToast,Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
            }
        });
    }
}