package com.example.twoprojectfromkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.twoprojectfromkotlin.databinding.ActivityTestLevel2Binding

class ActivityLevel2 : AppCompatActivity() {
    lateinit var binding: ActivityTestLevel2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestLevel2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val resultValue = binding.answer1.text.toString()
        val a = (10..199).random()
        val b = (10..199).random()
        val sign = "+"
        val sign2 = "-"
        val sign3 = "*"
        val sign4 = ":"
        val sum = a + b
        val min = a - b
        val mult = a * b
        val dec = a / b

        binding.tvSign1.text = sign3
        binding.tvText10.text = a.toString()
        binding.tvText11.text = b.toString()

        binding.butCheck1.setOnClickListener {

            if (resultValue.equals(mult)
            ) {
                binding.tvMessage.text = "Congratulation"
            } else {
                binding.tvMessage.text = "Don't worry, try tomorrow"
            }
        }
    }

}