package com.mu.jan.myapplication.creationalpattern

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * BuilderPattern - In this pattern, while creating object,
 * it's not necessary to call all methods, only use those
 * fields what you need.
 */
class AlertDialog(builder: Builder){
    private val mContext: Context = builder.mContext
    private val text: String = builder.text
    class Builder(mContext: Context){
        //this is necessary
        var mContext: Context = mContext
        //this is optional
        var text: String = "default_value"

        fun setText(s: String): Builder{
            text = s
            return this
        }
        fun create(){

        }
    }
}
class MyActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //show dialog
        AlertDialog.Builder(this)
            .setText("")
            .create()
    }
}