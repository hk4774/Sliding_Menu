package com.hk4774.navigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hk4774 on 09-09-2016.
 */
public class CustomeAdapater extends BaseAdapter {

    Context context;
    List<RowItem> rowItem;
    LayoutInflater mInflater;

    public CustomeAdapater(Context context, List<RowItem> rowItem) {
        this.context = context;
        this.rowItem = rowItem;
        mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
    }

    private class ViewHolder {
        ImageView icon;
        TextView title;
    }

    @Override
    public int getCount() {
        return rowItem.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.icon = (ImageView) convertView.findViewById(R.id.icon);
            holder.title = (TextView) convertView.findViewById(R.id.title);

            RowItem row_pos = rowItem.get(position);

            holder.icon.setImageResource(row_pos.getIcon());
            holder.title.setText(row_pos.getTitle());

            convertView.setTag(holder);
        } else {
            ((ViewGroup) convertView.getParent()).removeView(convertView);
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }
}
