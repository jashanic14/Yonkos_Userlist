package at.fh.swengb.yonkos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowUserActivity extends AppCompatActivity {

    private Yonko yonko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        yonko = (Yonko)intent.getExtras().get("user");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);

        viewFirstName.setText(yonko.getFirstName());
        viewLastName.setText(yonko.getLastName());
        viewAddress.setText(yonko.getCrew());
        viewPhone.setText(yonko.getPhoneNumber());

    }

    public void showOnMap(View view) {
        // Map point based on address
        //Uri location = Uri.parse("https://www.google.com/?gws_rd=ssl#q="+yonko.getCrew());
        Uri location = Uri.parse("http://onepiece.wikia.com/wiki/"+yonko.getCrew());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+yonko.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
