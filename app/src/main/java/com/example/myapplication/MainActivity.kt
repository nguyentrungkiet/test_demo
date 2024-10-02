package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Lien ket thanh phan giao dien voi ma
        val greetingTextView: TextView = findViewById(R.id.greetingView)
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val submitButton: Button = findViewById(R.id.submitButton)
        val imageView: ImageView = findViewById(R.id.imageView)

        //Thiet lap su kien nhan nut Button
        submitButton.setOnClickListener{
            val name = nameEditText.text.toString()//Lay ten tu Edit Text
            if (name.isNotEmpty()) {
                //Hien thi loi chao voi ten nguoi dung
                greetingTextView.text = "Xin chào, $name!"
            } else {
                //Hien thi thong bao neu nguoi dung chua nhap ten
                greetingTextView.text="Xin hãy nhập tên của bạn."
            }
        }
    }
}