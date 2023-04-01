package com.example.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecivedMessageActivity2 : AppCompatActivity() {
    var textViewReceivedMsg: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recived_message2)

        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg)
        val intent: Intent = getIntent() //вызываем интент
        val msg = intent.getStringExtra("msg") // получаем данные из интента
        textViewReceivedMsg?.text = msg //отображаем текст из интента
    }
}


