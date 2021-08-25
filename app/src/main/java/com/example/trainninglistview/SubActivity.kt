package com.example.trainninglistview

import android.os.Bundle
import android.os.PersistableBundle
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*


class SubActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)


        val getUserSelectedList = intent.getStringExtra("USER_SELECTED_LIST")
        
        when{
            getUserSelectedList == "a" -> {
                user_selected_title.text = "リストaを表示"
            }
            getUserSelectedList == "b" -> {
                user_selected_title.text = "リストbを表示"
            }
            getUserSelectedList == "c" -> {
                user_selected_title.text = "リストcを表示"
            }
        }
    }
}