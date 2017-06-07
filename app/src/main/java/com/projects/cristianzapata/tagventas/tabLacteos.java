package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class tabLacteos extends Fragment {

    ListView lv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Arreglo de datos a mostrar
        lacteos lacteos[] = new lacteos[]{
                new lacteos(R.drawable.yogurt,getString(R.string.yogurt),"$2.000"),
                new lacteos(R.drawable.mantequilla,getString(R.string.mantequilla),"$3.000"),
                new lacteos(R.drawable.milk,getString(R.string.milk),"$2.300"),
                new lacteos(R.drawable.bonyurt,getString(R.string.bonyurt),"$3.500"),
                new lacteos(R.drawable.cuajada,getString(R.string.cuajada),"$5.500"),
        };
        lacteosAdapter adapter = new lacteosAdapter(getActivity(),R.layout.row,lacteos);
        View rootView = inflater.inflate(R.layout.fragment_tab_lacteos, container, false);
        lv = (ListView) rootView.findViewById(R.id.listaLacteos);
        lv.setAdapter(adapter);
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_tab_frutas, container, false);
        return rootView;
    }
}
