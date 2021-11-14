package com.andru.makeupmarket

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var editUserName : EditText? =null;
    private var editPassword : EditText? =null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
    }

    fun onLogin(view: View){

        var username = editUserName!!.text.toString();
        var password = editPassword!!.text.toString();

        if (username == "andres@gmail.com" && password == "asdf"){

            AlertDialog.Builder(this).setTitle("Welcome").setMessage("Andres")
                .setPositiveButton("Ok",positiveButton).setNegativeButton("Cancel", negativeButton)
                .create().show()
            Toast.makeText(this, "Welcome",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,resources.getString(R.string.errorlogin),Toast.LENGTH_SHORT).show();
        }
    }

    val positiveButton={_:DialogInterface,_:Int->
        val home = Intent(this, HomeActivity::class.java);
        startActivity(home);
    }
    val negativeButton={_:DialogInterface,_:Int-> }
}