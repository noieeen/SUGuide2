package com.example.noie.suguide.model;

import java.util.Locale;

public class FoodItem {

    public final long _id;
    public final String type;
    public final String title;
    public final String date;
    public final String calorie;
    public final String image; //final คือ ห้ามใครแก้แล้วเด้อ

    public FoodItem(long _id, String type, String title, String date, String calorie, String image) {
        this._id = _id;
        this.type = type;
        this.title = title;
        this.date = date;
        this.calorie = calorie;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "ชื่อ %s\nเบอร์โทร: %s",
                this.title,
                this.date);
    }
}


