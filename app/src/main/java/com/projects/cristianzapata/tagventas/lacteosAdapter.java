package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ambiente 10-3 on 05/06/2017.
 */

public class lacteosAdapter extends ArrayAdapter<lacteos> {

    Context context;
    int resource;
    lacteos data[] = null;

    public lacteosAdapter(@NonNull Context context, @LayoutRes int resource, lacteos[] data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    public View getView(int posicion, View convertView, ViewGroup parent){
        View row = convertView;
        lacteosAdapter.Holder holder = null;

        if(row==null){
            row = LayoutInflater.from(context)
                    .inflate(resource, parent, false);
            holder = new lacteosAdapter.Holder();
            holder.image = (ImageView) row.findViewById(R.id.producto);
            holder.title = (TextView) row.findViewById(R.id.title);
            holder.price = (TextView) row.findViewById(R.id.price);

            row.setTag(holder);
        }
        else{
            holder=(lacteosAdapter.Holder)row.getTag();
        }
        lacteos lacteos = data[posicion];
        holder.image.setImageResource(lacteos.icon);
        holder.title.setText(lacteos.title);
        holder.price.setText(lacteos.price);
        return row;
    }

    static class Holder{
        ImageView image;
        TextView title;
        TextView price;
    }
}
