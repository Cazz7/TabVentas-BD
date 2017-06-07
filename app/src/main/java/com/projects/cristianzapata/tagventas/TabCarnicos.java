package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class TabCarnicos extends Fragment {

    ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Arreglo de datos a mostrar
        carnes carnes[] = new carnes[]{
                new carnes(R.drawable.carnemolida,getString(R.string.carnemolida),"$8.6000"),
                new carnes(R.drawable.chorizo,getString(R.string.chorizo),"$3.600"),
                new carnes(R.drawable.costilla,getString(R.string.costilla),"$4.500"),
                new carnes(R.drawable.puntaanca,getString(R.string.puntaanca),"$3.500"),
                new carnes(R.drawable.solomito,getString(R.string.solomito),"$10.500"),
        };
        carnesAdapter adapter = new carnesAdapter(getActivity(),R.layout.row,carnes);
        View rootView = inflater.inflate(R.layout.fragment_tab_carnicos, container, false);
        lv = (ListView) rootView.findViewById(R.id.listacarnes);
        lv.setAdapter(adapter);

        return rootView;
    }
}
