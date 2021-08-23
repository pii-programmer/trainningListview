package com.example.trainninglistview

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.row_view.view.*


class SubActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)


        val userSelectedIceTitle = intent.getStringExtra("USER_SELECTED_TITLE")
        findViewById<TextView>(R.id.user_selected_title).text = userSelectedIceTitle

    }
}