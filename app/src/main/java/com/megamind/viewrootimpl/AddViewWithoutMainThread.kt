package com.megamind.viewrootimpl

import android.os.Bundle
import android.os.Looper
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class AddViewWithoutMainThread:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view_without_main_thread)
        thread {
            Looper.prepare()
            val button = Button(this)
            windowManager.addView(button,WindowManager.LayoutParams())
            button.setOnClickListener {
                button.text = """
                    ${Thread.currentThread().name}
                    :${System.currentTimeMillis()}
                """.trimIndent()
            }
            Looper.loop()
        }
    }
}