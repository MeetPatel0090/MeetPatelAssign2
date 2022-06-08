// Meet Patel n01460090


package meet.patel.n01460090;



import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.meet_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuitem)
    {


        // Handle item selection
        switch (menuitem.getItemId())
        {
            case R.id.MeetMenuItem1:
                gotoUrl();
                break;

            case R.id.MeetMenuItem2:
                gotoCall();
                break;

            case R.id.MeetMenuItem3:
                gotomain();
                break;

            case android.R.id.home:
                // todo: goto back activity from here

                finish();
                return true;

            default:
                return super.onOptionsItemSelected(menuitem);

        }
        return true;

    }

    private void gotoUrl()
    {
        Uri uri = Uri.parse("https://rentals.ca/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


    private void gotoCall()
    {
        Uri uri = Uri.parse("tel:123-456-7890");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    private void gotomain()
    {
        Intent intent = new Intent(MenuActivity.this,PatelActivity.class);
        startActivity(intent);
    }




}