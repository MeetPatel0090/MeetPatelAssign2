// Meet Patel n01460090 Section RNB

package meet.patel.n01460090;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class PaymentActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ImageButton btn = findViewById(R.id.MeetPaymentImageButton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkFirstName())
                    if(checkLastName())
                        if(checkCardNo())
                            alertDialog();

            }
        });

    }

    private boolean checkFirstName()
    {

        EditText FirstName = findViewById(R.id.MeetEditTextFirstName);

        String firstname = (FirstName.getText().toString());


        if (firstname.isEmpty())
        {
            FirstName.setError(getString(R.string.firstNameError3));
            return false;
        }

        else if (firstname.length() < 3)
        {
            FirstName.setError(getString(R.string.firstNameError1));
            return false;
        }


        else if(firstname.matches("^[0-9]$"))
        {
            FirstName.setError(getString(R.string.firstNameError2));
            return false;
        }

        else
            return true;

    }



    private boolean checkLastName()
    {

        EditText LastName = findViewById(R.id.MeetEditTextLastName);

        String lastname = (LastName.getText().toString());


        if (lastname.isEmpty())
        {
            LastName.setError(getString(R.string.lastNameError3));
            return false;
        }

        else if (lastname.length() < 3)
        {
            LastName.setError(getString(R.string.lastNameError1));
            return false;
        }

        else if(lastname.matches("^[0-9]$"))
        {
            LastName.setError(getString(R.string.lastNameError2));
            return false;
        }


        else
            return true;
    }


    private boolean checkCardNo()
    {
        EditText CardNo = findViewById(R.id.MeetEditTextCardNumber);
        Editable cardNo = CardNo.getText();

        if(cardNo.length() == 0)
        {
            CardNo.setError(getString(R.string.cardError));
            return false;
        }


        else
            return true;
    }


    private void alertDialog() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Your request is being processed");
        dialog.setTitle("Dialog Box");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,int which)
                    {
                        Intent intent = new Intent(PaymentActivity.this,PatelActivity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }



}
