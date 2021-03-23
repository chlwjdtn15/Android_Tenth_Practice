package com.example.a9room_database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO {


    @Insert
    public void addUser(User u);


    @Query("Delete from users where id = :id")

    public void deleteUser(int id);


    @Query("select * from users")
    public List<User> getAll();


}
