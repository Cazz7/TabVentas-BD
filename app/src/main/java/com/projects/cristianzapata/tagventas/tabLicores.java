package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class tabLicores extends Fragment {

    ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Arreglo de datos a mostrar
        licores licores[] = new licores[]{
                new licores(R.drawable.oldparr,getString(R.string.oldparr),"$70.200"),
                new licores(R.drawable.ron8,getString(R.string.ron),"$37.000"),
                new licores(R.drawable.vinodiablo,getString(R.string.casillero),"$80.150"),
                new licores(R.drawable.smirnoff,getString(R.string.smirnoff),"$40.890"),
                new licores(R.drawable.tequila1800,getString(R.string.tequila1800),"$103.090"),
        };
        licoresAdapter adapter = new licoresAdapter(getActivity(),R.layout.row,licores);
        View rootView = inflater.inflate(R.layout.fragment_tab_licores, container, false);
        lv = (ListView) rootView.findViewById(R.id.listalicores);
        lv.setAdapter(adapter);
        return rootView;
    }

}
