package com.example.n551.alesson4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by N551 on 16.11.2015.
 */
public class MyAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mList;
    private LayoutInflater layoutInflater;

    static class ViewHolder {
        public TextView text;

    }

    public MyAdapter(Context context, List<String> list)
    {
        this.setmContext(context);
        this.setmList(list);
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if(view == null)
        {
            layoutInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.activity_list_view,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.text = (TextView)view.findViewById(R.id.myText);
            view.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.text.setText(mList.get(position));
        /*
        View view = layoutInflater.inflate(R.layout.activity_list_view,parent,false);
        TextView textView = (TextView) view.findViewById(R.id.myText);
        textView.setText(mList.get(position));
        Log.d(this.getClass().getSimpleName(),"get View position = " + position);
        */
        return view;
    }

    public List<String> getmList() {
        return mList;
    }

    public void setmList(List<String> mList) {
        this.mList = mList;
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }
}
