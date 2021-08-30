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

        // dataList を DBに保存し
        // DB から data を取得し adapter にセットする

        // アダプターをセットする
        val adapter = CustomAdapter(this, dataList)
        list_view.adapter = adapter

        // リストビューのクリックリスナ　　　　　　 // 使わない view と id は _ で伏せておく
        list_view.setOnItemClickListener { parent: AdapterView<*>, _, position, _ ->
            val intent = Intent(this, SubActivity::class.java)

            val iceCream = parent.getItemAtPosition(position) as Data

            val state = DataState(iceCream.icon, iceCream.title, iceCream.text)

            intent.putExtra("ICE_CREAM", state)
            startActivity(intent)


            // apply 使うとこの様にも書ける
//            Intent(this, SubActivity::class.java).apply {
//                this.putExtra("ICE_CREAM", state)
//                startActivity(this)
//            }
        }
    }
}




//  トースト表示はできた
//  Toast.makeText(applicationContext, userSelectedList.toString(), Toast.LENGTH_SHORT).show()
/////////////////// メモ ////////////////////////////
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
