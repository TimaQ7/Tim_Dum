package com.example.twoprojectfromkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.twoprojectfromkotlin.databinding.ActivityTestLevel2Binding

class ActivityLevel2 : AppCompatActivity() {
    lateinit var binding: ActivityTestLevel2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestLevel2Binding.inflate(layoutInflater)
        setContentView(binding.root)


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
        val resultValue = binding.answer1.text.toString()

            when (resultValue) {
                min.toString() -> {
                    binding.tvMessage.text = Constance.POSITIVE
                }
                "" -> {
                    binding.tvMessage.text = Constance.NULL
                }
                else -> {
                    binding.tvMessage.text = Constance.NEGATIVE
                }
            }
            binding.butCheck1.text = Constance.BUT_1
            binding.butCheck1.setOnClickListener {
                val intent = Intent(this, ActivityLevel2::class.java)
                startActivity(intent)
            }
        }
    }

}