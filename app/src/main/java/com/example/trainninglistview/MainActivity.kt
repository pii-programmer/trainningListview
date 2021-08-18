package com.example.trainninglistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // リストデータを作る
        val dataList = arrayListOf<Data>()
        for (i in 0..100){
            dataList.add(Data().apply {
                title = "${i}番目のタイトル"
                text = "${i}番目のテキスト"
            })
        }

        // アダプターをセットする
        val adapter = CustomAdapter(this, dataList)
        custom_list_view.adapter = adapter
    }
}
