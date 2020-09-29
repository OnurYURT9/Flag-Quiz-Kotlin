package com.example.bayrakquiz2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bayrakquiz2.R

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veritabaniKopyala()

        btnbasla.setOnClickListener {

            startActivity(Intent(this@MainActivity,QuizActivity::class.java))

        }
    }

    fun veritabaniKopyala(){

        val copyHelper = DatabaseCopyHelper(this)

        try{
            copyHelper.createDataBase()
            copyHelper.openDataBase()

        }catch (e:Exception){
            e.printStackTrace()
        }

    }
}

