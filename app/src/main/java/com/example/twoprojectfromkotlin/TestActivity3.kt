package com.example.twoprojectfromkotlin

import android.os.Bundle


import androidx.appcompat.app.AppCompatActivity
import com.example.twoprojectfromkotlin.databinding.ActivityTest2Binding
import java.util.*


class TestActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_hard)

        val resultValue = binding.answer.text.toString()
        val a = (10..99).random()
        val b = (10..99).random()
        val sign = "+"
        val sign2 = "-"
        val sign3 = "*"
        val sign4 = ":"
        val sum = a + b
        val min = a - b
        val mult = a * b
        val dec = a / b

        binding.tvSign.text = sign
        binding.tvText0.text = a.toString()
        binding.tvText1.text = b.toString()

        binding.butCheck.setOnClickListener {

            if (resultValue.equals(sum)
            ) {
                binding.tvMessage.text = "Congratulation"
            } else {
                binding.tvMessage.text = "Don't worry, try tomorrow"
            }
        }
    }
}


