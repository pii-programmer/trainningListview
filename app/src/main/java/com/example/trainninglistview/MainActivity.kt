package com.example.trainninglistview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_view.*
import kotlinx.android.synthetic.main.row_view.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // カスタムアダプターに渡すデータリスト(Data)を作るラムダ式で
        val dataList = arrayListOf<Data>()
        for (i in 0..100){
            dataList.add(Data().apply {
                title = "${i}番目のタイトル"
                text = "${i}番目のテキスト"
                when{
                    i %3 == 0 -> {
                        this.icon = "a"
                    }
                    i %2 == 0 -> {
                        this.icon = "b"
                    }
                    else -> {
                        this.icon = "c"
                    }
                }
            })
        }

        // アダプターをセットする
        val adapter = CustomAdapter(this, dataList)
        list_view.adapter = adapter

        // リストビューのクリックリスナーの書き方： list_view.setOnItemClickListener{adapterView, , view, position, id -> ..ここに処理..}
//
//        list_view.setOnItemClickListener { parent, view, position, id ->
//            parent.getItemAtPosition(dataList.title)
//            val intent = Intent(this, SubActivity::class.java)
//            intent.putExtra("USER_SELECTED_LIST", "a")
//            startActivity(intent)
//        }
//
//        list_view.setOnItemClickListener { parent, view, position, id ->
//            parent.getItemAtPosition(position)
//            val intent = Intent(this, SubActivity::class.java)
//            intent.putExtra("USER_SELECTED_LIST", "b")
//            startActivity(intent)
//        }
//
//        list_view.setOnItemClickListener { parent, view, position, id ->
//            parent.getItemAtPosition(position)
//            val intent = Intent(this, SubActivity::class.java)
//            intent.putExtra("USER_SELECTED_LIST", "c")
//            startActivity(intent)
//        }
    }
}

//  トースト表示はできた
//  Toast.makeText(applicationContext, userSelectedList.toString(), Toast.LENGTH_SHORT).show()

//  クリックしたリストの位置を定義： val userSelectedList = parent.getItemAtPosition(position)



/////////////////// メモ（スコープ関数） ////////////////////////////
//        val dataList = arrayListOf<Data>().apply {
//            var data = Data()
//            for (i in 0..99) {
//                data.icon = "${i} 番目のアイコン"
//                data.title = "${i} 番目のタイトル"
//                data.text = "${i} 番目のテキスト"
//                this.add(data)
//            }
//        }
//        print(dataList)


// collectionメソッドを使ってみたけど同じ画像しか出せないのでコメントアウト
//            val icon = listOf("a", "b", "c")
//                for(n in icon){
//                    this.icon = n
//                }

