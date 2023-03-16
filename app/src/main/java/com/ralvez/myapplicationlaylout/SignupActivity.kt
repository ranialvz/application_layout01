package com.ralvez.myapplicationlaylout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ralvez.myapplicationlaylout.databinding.ActivitySignupBinding


class SignupActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignupBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SuccessRActivity::class.java)
            startActivity(intent)
        }
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Back"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true


    }


}


