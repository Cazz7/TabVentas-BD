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
 * Created by cristian.zapata on 06-06-2017.
 */

public class licoresAdapter extends ArrayAdapter<licores> {

    Context context;
    int resource;
    licores data[] = null;

    public licoresAdapter(@NonNull Context context, @LayoutRes int resource, licores[] data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    public View getView(int posicion, View convertView, ViewGroup parent){
        View row = convertView;
        licoresAdapter.Holder holder = null;

        if(row==null){
            row = LayoutInflater.from(context)
                    .inflate(resource, parent, false);
            holder = new licoresAdapter.Holder();
            holder.image = (ImageView) row.findViewById(R.id.producto);
            holder.title = (TextView) row.findViewById(R.id.title);
            holder.price = (TextView) row.findViewById(R.id.price);

            row.setTag(holder);
        }
        else{
            holder=(licoresAdapter.Holder)row.getTag();
        }
        licores licores = data[posicion];
        holder.image.setImageResource(licores.icon);
        holder.title.setText(licores.title);
        holder.price.setText(licores.price);
        return row;
    }

    static class Holder{
        ImageView image;
        TextView title;
        TextView price;
    }
}
