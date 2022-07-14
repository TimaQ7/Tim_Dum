package com.example.twoprojectfromkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.twoprojectfromkotlin.databinding.ActivityHardBinding

class ActivityLevel3 : AppCompatActivity() {
    lateinit var binding: ActivityHardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultValue = binding.answer2.text.toString()
        val a = (10..399).random()
        val b = (10..499).random()
        val sign = "+"
        val sign2 = "-"
        val sign3 = "*"
        val sign4 = ":"
        val sum = a + b
        val min = a - b
        val mult = a * b
        val dec = a / b

        binding.tvSign2.text = sign2
        binding.tvText20.text = a.toString()
        binding.tvText21.text = b.toString()

        binding.butCheck.setOnClickListener {

            if (resultValue.equals(min)
            ) {
                binding.tvMessage.text = "Congratulation"
            } else {
                binding.tvMessage.text = "Don't worry, try tomorrow"
            }
        }
    }
}