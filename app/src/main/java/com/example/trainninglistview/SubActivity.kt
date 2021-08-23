package com.example.trainninglistview

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SubActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

          // intentで受け取る
        val userSelectedIce = intent.getStringExtra("USER_SELECTED_ICE")
        val userSelectedTitle = findViewById<TextView>(R.id.user_selected_title)
        userSelectedTitle.text = userSelectedIce
        val userSelectedText = findViewById<TextView>(R.id.user_selected_text)
        userSelectedText.text = userSelectedIce

//        if(userSelectedIce  == "1")  {
//
//            }
    }
}