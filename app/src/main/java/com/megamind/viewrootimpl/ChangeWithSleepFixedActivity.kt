package com.megamind.viewrootimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class ChangeWithSleepFixedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)
        thread {
            SystemClock.sleep(2000)
            textView.text = "onCreate"
        }
    }
}