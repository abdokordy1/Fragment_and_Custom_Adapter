package com.example.android.googlemap;

/**
 * Created by Abdallah on 5/21/2017.
 */

public class Database {

    private int Image_resource;

    private String name;

    public Database(int Image_resource, String name, int Postion) {
        this.Image_resource = Image_resource;

        this.name = name;
    }


//public static final Database[] database=
    //      {  new Database  (R.drawable.orange,"Abdallah",0),

    //             new Database  (R.drawable.red,"Mahmoud")

    //  };

    public String getName() {

        return name;
    }

    public int getImage() {

        return Image_resource;
    }


}
