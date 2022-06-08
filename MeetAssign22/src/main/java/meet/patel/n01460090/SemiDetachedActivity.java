package meet.patel.n01460090;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SemiDetachedActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_detached);

        CheckBox semidetached1 = findViewById(R.id.MeetSemiDetachedCheckBox1);
        CheckBox semidetached2 = findViewById(R.id.MeetSemiDetachedCheckBox2);
        CheckBox semidetached3 = findViewById(R.id.MeetSemiDetachedCheckBox3);
        Button btn = findViewById(R.id.MeetSemiDetachedBtn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (semidetached1.isChecked() || semidetached2.isChecked() || semidetached3.isChecked())
                {
                    Intent i = new Intent(SemiDetachedActivity.this, PaymentActivity.class);
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