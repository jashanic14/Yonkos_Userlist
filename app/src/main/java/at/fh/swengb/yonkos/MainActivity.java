package at.fh.swengb.yonkos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private List<Yonko> listYonko;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myUserList);


        listYonko = new ArrayList<>();
        listYonko.add(new Yonko("Shanks","Readhair","Red_Hair_Pirates","01 020304050"));
        listYonko.add(new Yonko("Charlotte Linlin","Big Mom","Big_Mom_Pirates","01 123456"));
        listYonko.add(new Yonko("Kaido","The Beast","Beasts_Pirates","01 021221250"));
        listYonko.add(new Yonko("Marshall D. Teach","Blackbeard","Blackbeard_Pirates","01 02024050"));
        listYonko.add(new Yonko("Edward Newgate","Whitebeard","Whitebeard_Pirates","0316 011150"));
        listYonko.add(new Yonko("Luffy D.","Monkey","Straw_Hat_Pirates","01 020304050"));

        myAdapter = new CustomAdapter(this,listYonko);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Yonko selectedUser = listYonko.get(i);
        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("user",selectedUser);
        startActivity(intent);

    }
}
