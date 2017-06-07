package com.projects.cristianzapata.tagventas;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class listaCompra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_compra);

        getDataFromBD();
    }

    private void getDataFromBD() {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "factura", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        Cursor lista = bd.rawQuery("select * from compra", null);

//        if (fila.moveToFirst()) {
//            et2.setText(fila.getString(0));
//            et3.setText(fila.getString(1));
//            et4.setText(fila.getString(2));
//        } else
//            Toast.makeText(this, "No existe una persona con dicho dni",
//                    Toast.LENGTH_SHORT).show();
        bd.close();
    }
}
