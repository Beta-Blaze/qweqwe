package com.example.qwe

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun cauntMe(view: View){
        val countString = textView.text.toString()

        val count: Int = Integer.parseInt(countString) + 1

        textView.text = count.toString()
    }

    fun resetMe(view: View){
        val countString = textView.text.toString()

        val count = 0

        textView.text = count.toString()
    }
}
