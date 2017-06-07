package com.projects.cristianzapata.tagventas;

/**
 * Created by cristian.zapata on 06-06-2017.
 */

public class despensa {

    public int icon;
    public String title;
    public String price;

    //    Se define el constructor vacío
    public despensa(){
        super();
    }

    //    Se define constructor con datos
    public despensa(int icon, String title, String price){
        super();
        this.icon = icon;
        this.title = title;
        this.price = price;
    }
}
