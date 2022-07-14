package com.example.twoprojectfromkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.twoprojectfromkotlin.databinding.ActivityMainBinding
import com.example.twoprojectfromkotlin.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun onClickPlay(view : View) {
        val intent = Intent(this, TestActivity3::class.java)
        startActivity(intent)
    }

    fun onClickPlay2(view : View) {
        val intent2 = Intent(this, ActivityLevel2::class.java)
        startActivity(intent2)
    }
    fun onClickPlay3(view : View) {
        val intent3 = Intent(this, ActivityLevel3::class.java)
        startActivity(intent3)
    }
    fun onClickBack(view : View) {
        finish()
    }

}