package com.example.noie.suguide.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "food.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "food";
    public static final String COL_ID = "_id";
    public static final String COL_IMAGE = "image";
    public static final String COL_TYPE = "type";
    public static final String COL_TITLE = "title";
    public static final String COL_DATE = "date";
    public static final String COL_CALORIE = "calorie";


    private static final String SQL_CREATE_TABLE_PHONE
            = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_IMAGE + " TEXT,"
            + COL_TYPE + " TEXT,"
            + COL_TITLE + " TEXT,"
            + COL_DATE + " TEXT,"
            + COL_CALORIE + " TEXT "
            + ")";


    public DatabaseHelper(Context context) {
        super(context, "food.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_PHONE);

        ContentValues cv = new ContentValues();
        cv.put(COL_TITLE, "ข้าวผัดหมู");
        cv.put(COL_DATE, "12/12/2018");
        cv.put(COL_CALORIE, "300");
        cv.put(COL_TYPE, "อาหารคาว");
        cv.put(COL_IMAGE,"padmhu.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "แซนวิชแฮมชีส");
        cv.put(COL_DATE, "11/12/2018");
        cv.put(COL_CALORIE, "200");
        cv.put(COL_TYPE, "อาหารระหว่างวัน");
        cv.put(COL_IMAGE,"hamchees.png");
        db.insert(TABLE_NAME, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}