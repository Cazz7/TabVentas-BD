package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class tabAseo extends Fragment {
    
    ListView lv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Arreglo de datos a mostrar
        aseo aseo[] = new aseo[]{
                new aseo(R.drawable.escoba,getString(R.string.escoba),"$7.200"),
                new aseo(R.drawable.fabuloso,getString(R.string.fabuloso),"$3.000"),
                new aseo(R.drawable.detergenteliquido,getString(R.string.detergente),"$8.300"),
                new aseo(R.drawable.lavaloza,getString(R.string.lavaloza),"$4.650"),
                new aseo(R.drawable.limpiadormulti,getString(R.string.limpiador),"$10.900"),
        };
        aseoAdapter adapter = new aseoAdapter(getActivity(),R.layout.row,aseo);
        View rootView = inflater.inflate(R.layout.fragment_tab_aseo, container, false);
        lv = (ListView) rootView.findViewById(R.id.listaaseo);
        lv.setAdapter(adapter);
        return rootView;
    }

}
