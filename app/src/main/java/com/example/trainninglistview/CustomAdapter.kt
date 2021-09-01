package com.example.trainninglistview


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomAdapter(context: Context, list:ArrayList<Data>) : ArrayAdapter<Data>(context,0,list){
    private lateinit var data:Data

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null){
            //一行分のレイアウトを表示させておく
            view = LayoutInflater.from(context).inflate(R.layout.row_view, parent,false)
        }

        //一行分のデータを取得す
        data = getItem(position) as Data    // 今回はここで data:Data の初期化が完了している
        when (data.icon){
            "strawberry" -> {
                view?.findViewById<ImageView>(R.id.icon)?.setImageResource(R.drawable.ice_strawberry)
            }
            "lemon" -> {
                view?.findViewById<ImageView>(R.id.icon)?.setImageResource(R.drawable.ice_lemon)
            }
            "choco" -> {
                view?.findViewById<ImageView>(R.id.icon)?.setImageResource(R.drawable.ice_choco)
            }
        }
        view?.findViewById<TextView>(R.id.title)?.apply { text = data.title }
        view?.findViewById<TextView>(R.id.text)?.apply { text = data.text}
        return view!!
    }
}

// view?.findViewById<ImageView>(R.id.icon)?.setImageResource(R.drawable.ice_strawberry)　の ? とは null判定。
// その値(view)が null だったら、findViewById してください　という意味。
// findViewById<TextView>(R.id.title)が nullだったら、applyして(データ箱を全部開いて)、textにdataのタイトルを代入してください　という意味。

// あまり ? は使わない方がいい。

// そのために、null を回避する書き方がある ↓
//    data?.let{
//        it.icon: String
//        it.title: String
//        it.text: String
//    }
// 変数dataの値が null だったら、let(ここに変数を追加しますよ)。


// データ型
data class Data(
    var icon: String? = null,
    var title: String? = null,
    var text: String? = null
)