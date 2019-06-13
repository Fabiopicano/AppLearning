package com.example.moodle2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var Nome: EditText
    lateinit var Password :EditText
    lateinit var Info : TextView
    lateinit var Login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nome= findViewById<EditText>(R.id.id_Nome)
        Password= findViewById<EditText>(R.id.id_Password)
        Info= findViewById<TextView>(R.id.id_Info)
        Login= findViewById<Button>(R.id.id_Login)

        id_Login.setOnClickListener(){

            validate(id_Nome.getText().toString(),id_Password.getText().toString())

        }

    }
    private fun validate(userName:String,userPass:String){
        if((userName.equals("0124"))&&(userPass.equals("ciao"))){
            var intent =  Intent (this,Pagina2::class.java)
            startActivity(intent)
        } else {
            Info.text = "Login Fallito"
        }
    }
}

