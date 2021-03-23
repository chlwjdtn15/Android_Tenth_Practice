package com.example.a9room_database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "users")
public class User {

    @PrimaryKey
    int id;


    @ColumnInfo(name = "user_name")
    String name;



    String email;

    public User(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }


}
