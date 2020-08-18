package com.megamind.viewrootimpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setOnClickListener {
            startActivity(Intent(this, OnChildThreadActivity::class.java))
        }
        textView2.setOnClickListener {
            startActivity(Intent(this, ChangeWithSleepFixedActivity::class.java))
        }
        textView3.setOnClickListener {
            startActivity(Intent(this, OnClickActivity::class.java))
        }
        textView4.setOnClickListener {
            startActivity(Intent(this, WrapTextActivity::class.java))
        }
        textView5.setOnClickListener {
            startActivity(Intent(this, RequestBeforeActivity::class.java))
        }
        textView6.setOnClickListener {
            startActivity(Intent(this, AddViewWithoutMainThread::class.java))
        }
        textView8.setOnClickListener {
            startActivity(Intent(this, ChangeWithSleepWrapActivity::class.java))
        }
        textView9.setOnClickListener {
            startActivity(Intent(this, FirstSetTextInMainThreadWrapTextActivity::class.java))
        }


    }
}