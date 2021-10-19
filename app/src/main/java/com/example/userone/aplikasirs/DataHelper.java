package com.example.userone.aplikasirs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "datars.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

        String sql = "create table datamaps(id_rs integer primary key, namars text null, webrs text null, notelprs int null, alamatrs text null);";
        Log.d("Data", "onCreate:" +sql);
        db.execSQL(sql);
        sql = "INSERT INTO datamaps(id_rs,namars,webrs,notelp,alamatrs)VALUES ('1','Rumah Sakit Wirosaban','http://rumahsakitjogja.jogjakota.go.id/','0274371195','Jl. Ki Ageng Pemanahan No. 1')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

}

