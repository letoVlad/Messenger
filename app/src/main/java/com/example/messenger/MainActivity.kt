package com.example.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var editTextMsg: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMsg = findViewById(R.id.editTextTextMessage)
    }

    fun onClickSendMsg(view: View) {
        val msg: String = editTextMsg?.text.toString() // получить текст из окна ввода
        val intent = Intent(this, RecivedMessageActivity2::class.java) //интент на 2ое окно
        intent.putExtra("msg", msg) // прикрепить сообщение к интенту.(Ключ/значение)
        startActivity(intent) // запуск интента
    }
}