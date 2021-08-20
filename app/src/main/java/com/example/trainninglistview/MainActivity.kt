package com.example.trainninglistview

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
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


            custom_list_view.setOnItemClickListener { parent: ViewGroup, view: View, position: Int, id -> custom_list_view }
            // intentで送る
//            custom_list_view.setOnClickListener {
//                val intent = Intent(this, SubActivity::class.java)
//              intent.putExtra("USER_SELECTED_ICE", "1")
//              startActivity(intent)
//            }



        // 画面遷移
//        custom_list_view.setOnClickListener {
//            val intent = Intent(this, SubActivity::class.java)
//            intent.putExtra("USER_SELECTED_ICE", "1")
//            startActivity(intent)
//        }
    }
}
