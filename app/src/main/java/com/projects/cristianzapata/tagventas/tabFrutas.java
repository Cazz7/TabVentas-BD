package com.projects.cristianzapata.tagventas;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class tabFrutas extends Fragment {

    ListView lv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         //Arreglo de datos a mostrar
        frutas frutas[] = new frutas[]{
                new frutas(R.drawable.apples,"Manzana","$2.000"),
                new frutas(R.drawable.grapes,"Uvas","$3.000"),
                new frutas(R.drawable.onions,"Cebollas","$1.000"),
                new frutas(R.drawable.oranges,"Naranjas","$1.500"),
                new frutas(R.drawable.potatoes,"Papas","$2.500"),
        };
        frutasAdapter adapter = new frutasAdapter(getActivity(),R.layout.row,frutas);
        View rootView = inflater.inflate(R.layout.fragment_tab_frutas, container, false);
        lv = (ListView) rootView.findViewById(R.id.listaFrutas);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sNombreProducto;
                String sPrecioProducto;
                Float fPrecioProducto;
                int imgID;

                TextView producto = (TextView)view.findViewById(R.id.title);
                TextView precio = (TextView)view.findViewById(R.id.price);
//                ImageView image = (ImageView) view.findViewById(R.id.producto);

                //Se adecúan los datos
                sNombreProducto = producto.toString();
                sPrecioProducto = precio.toString();
                sPrecioProducto = sPrecioProducto.substring(1);
                sPrecioProducto = sPrecioProducto.replace(".","");

                fPrecioProducto  = Float.parseFloat(sPrecioProducto);
                imgID = R.id.producto;

                agregar_producto( sNombreProducto, fPrecioProducto, imgID);
            }
        });

        return rootView;
    }

    public void agregar_producto( String sProducto, Float fPrecio, int imgID){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getActivity(), "factura", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        ContentValues registro = new ContentValues();
        registro.put("producto", sProducto);
        registro.put("price", fPrecio);
        registro.put("imgid", imgID);
        bd.insert("compra", null, registro);
        bd.close();
        Toast.makeText(getActivity(), "Se cargaron los datos de la persona", Toast.LENGTH_SHORT).show();
    }
}
