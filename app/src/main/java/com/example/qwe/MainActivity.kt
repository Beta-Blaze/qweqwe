package com.example.qwe

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //  Сохраняем значение перед уничтожением активности
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("count", count)
        super.onSaveInstanceState(outState)
    }

    //  Восстанавливаем значение
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt("count")
        updateCount()
    }

    //    Для кода, который повторяется больше одного раза,
//    лучше использовать отдельную функцию
    fun updateCount() {
        textView.text = count.toString()
    }

    fun toastMe(view: View) {
//        Если не будет использоваться дальнейшая обработка объекта
//        лучше не создавать новую переменную
        Toast.makeText(this, resources.getString(R.string.text_hello), Toast.LENGTH_SHORT)
            .show()
    }

    fun countMe(view: View) {
        count++
        updateCount()
    }

    fun resetMe(view: View) {
        count = 0
        updateCount()
    }
}
