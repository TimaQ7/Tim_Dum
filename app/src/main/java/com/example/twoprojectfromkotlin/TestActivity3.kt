package com.example.twoprojectfromkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View


import androidx.appcompat.app.AppCompatActivity
import com.example.twoprojectfromkotlin.databinding.ActivityTest2Binding
import java.util.*


class TestActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var a = (10..99).random()
        var b = (10..99).random()
        val sign = Constance.SIGN_PLUS
        val sign2 = Constance.SIGN_MIN
        val sign3 = Constance.SIGN_MULT
        val sign4 = Constance.SIGN_DEV
        val sum = a + b
        val min = a - b
        val mult = a * b
        val dec = a / b

        binding.tvSign0.text = sign
        binding.tvText00.text = a.toString()
        binding.tvText01.text = b.toString()

        binding.butCheck.setOnClickListener {

            val resultValue = binding.answer0.text.toString()


            when (resultValue) {
                sum.toString() -> {
                    binding.tvMessage.text = Constance.POSITIVE
                }
                "" -> {
                    binding.tvMessage.text = Constance.NULL
                }
                else -> {
                    binding.tvMessage.text = Constance.NEGATIVE
                }
            }
            binding.butCheck.text = Constance.BUT_1
            binding.butCheck.setOnClickListener {
                val intent = Intent(this, TestActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}


