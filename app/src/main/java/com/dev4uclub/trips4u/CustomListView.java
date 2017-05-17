package com.dev4uclub.trips4u;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;


public class CustomListView extends BaseAdapter {

    Context context;
    List<RowItem> rowItemList;

    CustomListView(Context context, List<RowItem> rowItemList)
    {
        this.context=context;
        this.rowItemList=rowItemList;
    }

    private class ViewHolder
    {
        ImageView icon;
        TextView title;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder = null;
        LayoutInflater inf = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView == null)
        {
            convertView = inf.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.icon = (ImageView) convertView.findViewById(R.id.icon);
            holder.title = (TextView) convertView.findViewById(R.id.title);

            RowItem row_pos = rowItemList.get(position);
            holder.icon.setImageResource(row_pos.getIcon());
            holder.title.setText(row_pos.getTitle());
            convertView.setTag(holder);

        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }
    @Override

    public int getCount() {return rowItemList.size();}

    @Override

    public Object getItem(int position) {return rowItemList.get(position);}

    @Override

    public long getItemId(int position) {return rowItemList.indexOf(getItem(position));}

}
