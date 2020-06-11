package com.sun.dialogactiviy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tag_unhandled_key_event_manager.setOnClickListener {
            startActivity(Intent(this,DialogActivity::class.java))
        }
    }
}