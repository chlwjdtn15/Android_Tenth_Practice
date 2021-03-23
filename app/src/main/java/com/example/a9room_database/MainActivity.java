package com.example.a9room_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyDatabase database;
    EditText usernameET;
    EditText userIdET;
    EditText emailET;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = MyDatabase.getInstance(this);
        usernameET = findViewById(R.id.userNameET);
        userIdET = findViewById(R.id.userIdET);
        emailET = findViewById(R.id.emailET);







    }

    public void addUser(View view) {


        int id = Integer.valueOf(userIdET.getText().toString());
        String name = usernameET.getText().toString();
        String email = emailET.getText().toString();

        User user = new User(id, name, email);


        database.userDAO().addUser(user);


        userIdET.setText("" );
        usernameET.setText("");
        emailET.setText("");

        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }

    public void displayUsers(View view) {


        List<User> userList =  database.userDAO().getAll();

        for(User user : userList)
        {
            Log.d("Tag", user.name);
            Log.d("id", String.valueOf(user.id));
            Log.d("email",user.email);
        }


    }
}