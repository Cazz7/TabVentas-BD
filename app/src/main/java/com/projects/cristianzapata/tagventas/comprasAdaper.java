package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by cristian.zapata on 07-06-2017.
 */

public class comprasAdaper extends ArrayAdapter {

    public comprasAdaper(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
}
