package com.megamind.viewrootimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class FirstSetTextInMainThreadWrapTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrap_content)
        textView.setOnClickListener {
            textView.text = "主线程"
            thread {
                textView.text = "onCreate"
            }
        }
    }
}