package com.example.a2exampleoftoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener(){
            Toast.makeText(applicationContext,"this is Toast message",Toast.LENGTH_SHORT).show()

            val toast = Toast.makeText(applicationContext,"Hello MAULIK",Toast.LENGTH_SHORT)
            toast.show()

            val myToast = Toast.makeText(applicationContext,"Toast message with gravity",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.LEFT,200,200)
            myToast.show()
        }
    }
}