package com.example.hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        intent?.extras?.let{
            val value1 = it.getString("key1")
            val value2 = it.getString("key2")
            val Name3 = findViewById<EditText>(R.id.Name3).text
            val Name4 = findViewById<EditText>(R.id.Name4).text
            val button2 = findViewById<Button>(R.id.button2)
            button2.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("key1",value1)
                bundle.putString("key2",value2)
                bundle.putString("key3",Name3.toString())
                bundle.putString("key4",Name4.toString())
                val intent = Intent().putExtras(bundle)
                setResult(Activity.RESULT_OK,intent.putExtras(bundle))
                finish()
            }
        }
    }
}
