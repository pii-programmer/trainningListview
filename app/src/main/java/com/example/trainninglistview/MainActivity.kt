package com.example.trainninglistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // アダプターをセットする
        val adapter = CustomAdapter(this, dataList)
        custom_list_view.adapter = adapter
    }
}
