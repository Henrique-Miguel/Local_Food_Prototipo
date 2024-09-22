package com.localfoodprototip

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.localfoodprototip.R
import com.localfoodprototip.databinding.ActivityLoginBinding
import com.localfoodprototip.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.AcessarMapa.setOnClickListener{
            startActivity(Intent(this@LoginActivity, MapActivity::class.java))
        }
    }
}