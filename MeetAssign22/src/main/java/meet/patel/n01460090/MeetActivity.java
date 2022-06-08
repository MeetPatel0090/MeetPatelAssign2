// Meet Patel n01460090

package meet.patel.n01460090;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MeetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);
        getSupportActionBar().setHomeButtonEnabled(false);      // Disable the button
        getSupportActionBar().setDisplayHomeAsUpEnabled(false); // Remove the left caret
        getSupportActionBar().setDisplayShowHomeEnabled(false); // Remove the icon

        new Handler().postDelayed(() -> {
            //This method will be executed once the timer is over
            // Start your app main activity
            Intent i = new Intent(MeetActivity.this, PatelActivity.class);
            startActivity(i);
            // close this activity
            finish();
        }, 3000);
    }
}