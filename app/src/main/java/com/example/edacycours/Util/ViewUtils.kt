package com.example.sentame.Util

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Fragment.toast(message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}