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
 * Created by cristian.zapata on 23-05-2017.
 */

public class frutasAdapter extends ArrayAdapter<frutas> {

    Context context;
    int resource;
    frutas data[] = null;

    public frutasAdapter(@NonNull Context context, @LayoutRes int resource, frutas[] data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    public View getView(int posicion, View convertView, ViewGroup parent){
        View row = convertView;
        verdurasHolder holder = null;

        if(row==null){
            row = LayoutInflater.from(context)
                    .inflate(resource, parent, false);
            holder = new verdurasHolder();
            holder.image = (ImageView) row.findViewById(R.id.producto);
            holder.title = (TextView) row.findViewById(R.id.title);
            holder.price = (TextView) row.findViewById(R.id.price);

            row.setTag(holder);
        }
        else{
            holder=(verdurasHolder)row.getTag();
        }
        frutas frutasVerduras = data[posicion];
        holder.image.setImageResource(frutasVerduras.icon);
        holder.title.setText(frutasVerduras.title);
        holder.price.setText(frutasVerduras.price);
        return row;
    }

    static class verdurasHolder{
        ImageView image;
        TextView title;
        TextView price;
    }
}
