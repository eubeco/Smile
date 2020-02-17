package com.example.smile

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagen = findViewById(R.id.image_smile) as ImageView

        imagen.setImageResource(R.drawable.ic_smile_happy)



        imagen.setOnClickListener {
            val sonreir = getDrawable(R.drawable.ad_animaciones) as AnimatedVectorDrawable?
            imagen.setImageDrawable(sonreir)
            sonreir!!.start()


        }
    }
}
