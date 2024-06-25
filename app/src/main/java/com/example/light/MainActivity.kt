package com.example.light

import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
    //}

    fun onMyButtonClick(view: View?)
    {

        //Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click: Button = findViewById(R.id.click)
        val redLight: ImageView = findViewById(R.id.RedLight)
        val yellowLight: ImageView = findViewById(R.id.YellowLight)
        val greenLight: ImageView = findViewById(R.id.GreenLight)

        var a = true

        click.setOnClickListener()
        {
            if(a == true)
            {
                Toast.makeText(this, "Красный", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "Жёлтый", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "Зелёный", Toast.LENGTH_SHORT).show()
                a = false
            }

            else
            {
                Toast.makeText(this, "Зелёный", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "Жёлтый", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "Красный", Toast.LENGTH_SHORT).show()
                a = true
            }

            redLight.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
            yellowLight.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
            greenLight.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
        }
    }

}