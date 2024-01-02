package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            if (binding.editTextName.text.toString().isEmpty()) {
                binding.editTextName.error = "Required"
            } else if (binding.editTextDesc.text.toString().isEmpty()) {
                binding.editTextDesc.error = "Required"
            } else {
                binding.titleText.text = binding.editTextName.text.toString()
                binding.editTextTitle.text = binding.editTextDesc.text.toString()
            }
        }
    }
}