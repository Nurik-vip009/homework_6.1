package com.example.homework_61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.homework_61.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnInc.setOnClickListener {
            viewModel.inc()
            Log.e("ololo","onCreate: ${viewModel.counter}")
        }

        binding.btnDec.setOnClickListener {
            viewModel.dec()
        }

        viewModel.counterLV.observe(this){result ->
            binding.tvResult.text = result.toString()
        }
    }
}