package com.example.trainninglistview

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_view.*
import kotlinx.android.synthetic.main.row_view.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            // カスタムアダプターに渡すリストデータ(Data)を作る
            val dataList = arrayListOf<Data>()

        for (i in 0..32){
            for (i in 0..2){
                when {
                    i == 0 -> {
                        dataList.add(Data().apply {
                            icon = "a"
                            title = "最初のタイトル"
                            text = "最初のテキスト"
                        })
                    }
                    i == 1 -> {
                        dataList.add(Data().apply {
                            icon = "b"
                            title = "真ん中のタイトル"
                            text = "真ん中のテキスト"
                        })
                    }
                    i == 2 -> {
                        dataList.add(Data().apply {
                            icon = "c"
                            title = "最後のタイトル"
                            text = "最後のテキスト"
                        })
                    }
                }
            }
        }

            // アダプターをセットする
            val adapter = CustomAdapter(this, dataList)
            list_view.adapter = adapter



            // ListViewの行がクリックされた時のイベントリスナー
//            list_view.setOnItemClickListener { parent, view, position, id ->
//                val item = (view.findViewById<TextView>(android.R.id.text1)).text
//                Toast.makeText(applicationContext, item, Toast.LENGTH_SHORT).show()
//            }


            // intentで送る　intentでやった方がいい
//            list_view.setOnClickListener {
//                val intent = Intent(this, SubActivity::class.java)
//              intent.putExtra("USER_SELECTED_ICE", "1")
//              startActivity(intent)
//            }

    }
}
