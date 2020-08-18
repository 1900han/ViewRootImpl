package com.megamind.viewrootimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class OnClickActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_general)
    textView.setOnClickListener {
      Log.d(TAG, "onCreate: ${window.decorView.parent}")
      thread {
        textView.text = "onCreate"
      }
    }
  }

  companion object {
    private const val TAG = "OnClickActivity"
  }
}