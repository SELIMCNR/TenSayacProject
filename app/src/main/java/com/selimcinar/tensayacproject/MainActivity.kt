package com.selimcinar.tensayacproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Abstract Class
    object : CountDownTimer(60000,1000){
        override fun onTick(p0: Long) {  //her bir saniyede ne olacak
            textView.text = "Kalan : ${p0 / 1000}" //her bir saniyede 1 azalsın
        }

        override fun onFinish() { //Sayaç bitince ne olacak
            textView.text = "Kalan : 0"
            textView2.text="İşlem tamamlandı"
        }

    }.start()

    }
}