package com.example.twoprojectfromkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.twoprojectfromkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

/*    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }*/

    fun onClickStart(view : View) {
        val intent = Intent(this, TestActivity::class.java)
//        startActivityForResult(intent, 100)
        startActivity(intent)
    }
}

