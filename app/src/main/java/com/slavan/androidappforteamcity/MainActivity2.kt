package com.slavan.androidappforteamcity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    companion object{
        fun newIntent(context:Context):Intent{
            val intent = Intent(context,MainActivity2::class.java)
            return intent
        }
    }
}