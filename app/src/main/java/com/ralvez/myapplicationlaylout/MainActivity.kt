package com.ralvez.myapplicationlaylout


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ralvez.myapplicationlaylout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
       // test github

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        binding.bntActivity.setOnClickListener {
            val intent = Intent(this, DataformActivity::class.java)
            startActivity(intent)
        }
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }



}