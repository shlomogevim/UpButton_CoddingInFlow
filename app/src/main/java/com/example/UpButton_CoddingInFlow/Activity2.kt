package com.example.UpButton_CoddingInFlow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        setTitle("Activit 2")
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        // pay attention to the changes in the manifest.xml



        button2.setOnClickListener {

            startActivity(Intent(this,Activity3::class.java))
        }

    }
}
