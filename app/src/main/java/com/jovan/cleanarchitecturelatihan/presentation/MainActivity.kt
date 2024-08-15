package com.jovan.cleanarchitecturelatihan.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jovan.cleanarchitecturelatihan.databinding.ActivityMainBinding
import com.jovan.cleanarchitecturelatihan.presentation.MainViewModel
import com.jovan.cleanarchitecturelatihan.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel> {
        MainViewModelFactory.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.setName("Dicoding Jovan")
        viewModel.message.observe(this) {
            binding.tvWelcome.text = it.welcomeMessage
        }

    }
}