package dev.edmt.firebasedemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by reale on 31/10/2016.
 */

public class ListViewAdapter extends BaseAdapter {

    Activity activity;
    List<User> lstUsers;
    LayoutInflater inflater;


    public ListViewAdapter(Activity activity, List<User> lstUsers) {
        this.activity = activity;
        this.lstUsers = lstUsers;
    }

    @Override
    public int getCount() {
        return lstUsers.size();
    }

    @Override
    public Object getItem(int i) {
        return lstUsers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater = (LayoutInflater)activity.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listview_item,null);

        TextView txtUser = (TextView)itemView.findViewById(R.id.list_name);
        TextView txtEmail = (TextView)itemView.findViewById(R.id.list_email);

        txtUser.setText(lstUsers.get(i).getName());
        txtEmail.setText(lstUsers.get(i).getEmail());

        return itemView;
    }
}
