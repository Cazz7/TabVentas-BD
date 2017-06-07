package com.projects.cristianzapata.tagventas;

/**
 * Created by cristian.zapata on 23-05-2017.
 */

public class frutas {

    public int icon;
    public String title;
    public String price;

    //    Se define el constructor vacío
    public frutas(){
        super();
    }

    //    Se define constructor con datos
    public frutas(int icon, String title, String price){
        super();
        this.icon = icon;
        this.title = title;
        this.price = price;
    }
}
