// Meet Patel n01460090 Section RNB

package meet.patel.n01460090;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DetachedActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detached);

        CheckBox detached1 = findViewById(R.id.MeetDetachedCheckBox1);
        CheckBox detached2 = findViewById(R.id.MeetDetachedCheckBox2);
        CheckBox detached3 = findViewById(R.id.MeetDetachedCheckBox3);
        Button btn = findViewById(R.id.MeetDetachedBtn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (detached1.isChecked() || detached2.isChecked() || detached3.isChecked())
                {
                    Intent i = new Intent(DetachedActivity.this, PaymentActivity.class);
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