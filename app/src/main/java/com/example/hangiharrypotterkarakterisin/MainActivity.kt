package com.example.hangiharrypotterkarakterisin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



         var  karakterImage:ImageView= findViewById(R.id.karakterImage)
         var karakterText : TextView = findViewById(R.id.karakterText)
         var karakterHangi: TextView = findViewById(R.id.karakterHangi)
         var baslatButton: Button= findViewById(R.id.baslatButton)



        karakterImage.setImageResource(R.drawable.arkaplan)
        baslatButton.setOnClickListener {
            var randomSayi = (1..8).random()
        baslatButton.text = "Tekrar Başlat"
      Toast.makeText(  this," Karakter seçiliyor!" , Toast.LENGTH_SHORT).show()

            when( randomSayi ){
                1->{karakterImage.setImageResource(R.drawable.dracomalfoy) ;karakterText.text="Draco Malfoy"}
                2->{karakterImage.setImageResource(R.drawable.harrypotter) ;karakterText.text="Harry Potter"}
                3->{karakterImage.setImageResource(R.drawable.hermionegranger) ;karakterText.text="Hermione Granger"}
                4->{karakterImage.setImageResource(R.drawable.dumbledore) ;karakterText.text="Dumbledore"}
                5->{karakterImage.setImageResource(R.drawable.ronwesley) ;karakterText.text="Ron Weasley"}
                6->{karakterImage.setImageResource(R.drawable.snape) ;karakterText.text="Severus Snape"}
                7->{karakterImage.setImageResource(R.drawable.umbridge) ;karakterText.text="Dolores Umbridge"}
                8->{karakterImage.setImageResource(R.drawable.mcgonagall) ;karakterText.text="Minerva McGonagall"}
            }
        }


    }
}