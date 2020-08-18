package com.megamind.viewrootimpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class OnChildThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_jump)
        thread {
            textView.text = "onCreate"
        }
    }

    fun jump(view: View) {
        startActivity(Intent(this, ChangeWithSleepFixedActivity::class.java))
    }

    override fun onPause() {
        super.onPause()
        //没有下面这句，子线程更新是失败的
//        textView.text = "ViewRootImpl在onPause之前已经创建好了"
        textView.requestLayout()
        thread {
            textView.text = "onPause"
        }
    }
}