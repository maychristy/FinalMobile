package com.d121201050.todo.util


import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.DateFormat

@SuppressLint("SetTextI18n")
@BindingAdapter("setPriority")
fun setPriority(view: TextView, priority: Int){
    when(priority){
        0 -> {
            view.text = "Penting Mendesak"
            view.setTextColor(Color.RED)

        }
        1 -> {
            view.text = "Tidak Penting Mendesak"
            view.setTextColor(Color.BLUE)

        }
        2 -> {
            view.text = "Penting Tidak Mendesak"
            view.setTextColor(Color.GREEN)
        }

        3 -> {
            view.text = "Tidak Penting Tidak Mendesak"
            view.setTextColor(Color.YELLOW)
        }
    }
}

@BindingAdapter("setTimestamp")
fun setTimestamp(view: TextView, timestamp: Long){
    view.text = DateFormat.getInstance().format(timestamp)
}