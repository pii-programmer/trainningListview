package com.example.trainninglistview

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

          // intent処理
//        val userSelectedIce :String? = intent.getStringExtra("USER_SELECTED_ICE")
//
//        when (userSelectedIce) {
//            "1" -> {
//        user_selected_ice.setImageResource(R.drawable.ice_strawberry)
//            }
//        }
    }
}