package com.example.trainninglistview

import android.os.Bundle
import android.os.PersistableBundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*


class SubActivity : AppCompatActivity(){
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val state = intent.getSerializableExtra("ICE_CREAM")
        if (state is DataState){
            ice_cream_s.setText(state.strawberry)
            ice_cream_c.setText(state.choco)
            ice_cream_l.setText(state.lemon)
        }

    }
}

//          when {
//                state.strawberry == "Data(icon=strawberry, title=ストロベリーアイス, text=¥100 おすすめ)" -> {
//                    ice_cream_s.text = "ストロベリーアイス"
//                }
//                state.choco == "Data(icon=choco, title=チョコアイス, text=¥300 濃厚チョコ)" -> {
//                    ice_cream_c.text = "チョコアイス"
//                }
//                state.lemon == "Data(icon=lemon, title=レモンアイス, text=¥200 爽やか)" -> {
//                    ice_cream_l.text = "レモンアイス"
//                }
//            }



/////////////  メモ  //////////////
//   Log.d("test1", "test1")
//
//        val result = arrayListOf(1, 2, 3).also {
//            println(it.max())
//            println(it.min())
//        }
//
//        get_user_selected.text = result.toString()
