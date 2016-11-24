package at.fh.swengb.yonkos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Acer on 24.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Yonko> listYonko;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Yonko> listUsers) {
        this.context = applicationContext;
        this.listYonko= listUsers;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listYonko.size();
    }

    @Override
    public Object getItem(int i) {
        return listYonko.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListPhone);

        Yonko user = listYonko.get(i);
        viewName.setText(user.getFirstName()+" "+user.getLastName());
        viewAddress.setText(user.getCrew());
        viewPhone.setText(user.getPhoneNumber());

        return view;
    }
}
