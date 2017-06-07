package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class tabDespensa extends Fragment {

    ListView lv;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Arreglo de datos a mostrar
        despensa despensa[] = new despensa[]{
                new despensa(R.drawable.frijol,getString(R.string.frijol),"$4.500"),
                new despensa(R.drawable.arroz,getString(R.string.arroz),"$7.890"),
                new despensa(R.drawable.azucar,getString(R.string.azucar),"$3.350"),
                new despensa(R.drawable.chocolate,getString(R.string.chocolate),"$40.890"),
                new despensa(R.drawable.papelhigienico,getString(R.string.papel),"$3.990"),
        };
        despensaAdapter adapter = new despensaAdapter(getActivity(),R.layout.row,despensa);
        View rootView = inflater.inflate(R.layout.fragment_tab_despensa, container, false);
        lv = (ListView) rootView.findViewById(R.id.listadespensa);
        lv.setAdapter(adapter);
        return rootView;
    }

}
