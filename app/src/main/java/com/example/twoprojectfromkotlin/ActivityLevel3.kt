package com.example.twoprojectfromkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.twoprojectfromkotlin.databinding.ActivityHardBinding

class ActivityLevel3 : AppCompatActivity() {
    lateinit var binding: ActivityHardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val a = (10..399).random()
        val b = (10..499).random()
        val sign = Constance.SIGN_PLUS
        val sign2 = Constance.SIGN_MIN
        val sign3 = Constance.SIGN_MULT
        val sign4 = Constance.SIGN_DEV
        val sum = a + b
        val min = a - b
        val mult = a * b
        val dec = a / b

        binding.tvSign2.text = sign2
        binding.tvText20.text = a.toString()
        binding.tvText21.text = b.toString()

        binding.butCheck.setOnClickListener {
        val resultValue = binding.answer2.text.toString()

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
            binding.butCheck.text = Constance.BUT_1
            binding.butCheck.setOnClickListener {
                val intent = Intent(this, ActivityLevel3::class.java)
                startActivity(intent)
            }
        }
    }
}