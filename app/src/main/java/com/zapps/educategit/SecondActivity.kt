package com.zapps.educategit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageView.setOnClickListener(::onImageViewClick)
        button2.setOnClickListener{
            finish()
        }
    }

    fun onImageViewClick(view: View) {
        Log.d("Teemo", "티모 로그")
        Toast.makeText(this, "티모 이미지를 터치하였습니다.", Toast.LENGTH_SHORT).show()
    }
}
