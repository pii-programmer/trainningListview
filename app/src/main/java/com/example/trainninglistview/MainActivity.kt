package com.example.trainninglistview

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // カスタムアダプターに渡すデータ(Data)をラムダ式で作る
        val dataList = arrayListOf<Data>()
            for (i in 0..100){
                dataList.add(Data().apply {
                    when{
                        i %3 == 0 -> {
                            icon = "strawberry"
                            title = "ストロベリーアイス"
                            text = "¥100 おすすめ"
                        }
                        i %2 == 0 -> {
                            icon = "lemon"
                            title = "レモンアイス"
                            text = "¥200 爽やか"
                        }
                        else -> {
                            icon = "choco"
                            title = "チョコアイス"
                            text = "¥300 濃厚チョコ"
                        }
                    }
                })
            }

        // アダプターをセットする
        val adapter = CustomAdapter(this, dataList)
        list_view.adapter = adapter

        // リストビューのクリックリスナー
        list_view.setOnItemClickListener { parent: AdapterView<*>, view, position, id ->
            val intent = Intent(this, SubActivity::class.java)

            val iceCream = parent.getItemAtPosition(position) as Data

            val state = DataState(iceCream.icon, iceCream.title, iceCream.text)

            intent.putExtra("ICE_CREAM", state)
            startActivity(intent)
        }
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

