package com.example.docbook10

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val username = findViewById<View>(R.id.username) as TextView
        val password = findViewById<View>(R.id.password) as TextView

        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton



        val btnForgetPass=findViewById<Button>(R.id.btnForgetPass)
        btnForgetPass.setOnClickListener {
            val intento1 = Intent(this, ForgotPassword::class.java)
            startActivity(intento1)
        }
        val btnRegister_User=findViewById<Button>(R.id.btnRegister)
        btnRegister_User.setOnClickListener {
            val RegisterUser = Intent(this, Register_User::class.java)
            startActivity(RegisterUser)
        }
        //admin and admin


        //admin and admin
        loginbtn.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                //correct
                Toast.makeText(this@MainActivity, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()

                val Home = Intent(this, HomePage::class.java)
                startActivity(Home)
            } else  //incorrect
                Toast.makeText(this@MainActivity, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show()
        }


    }
}