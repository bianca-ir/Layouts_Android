package com.example.layout

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.layout.databinding.ActivityMainBinding
import com.example.layout.databinding.RegisterBinding

class LoginActivity: Activity(), OnClickListener {
    lateinit var binding: RegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.register)

        binding.loginSigninButton.setOnClickListener(this)

        binding.accountText.setOnClickListener(this)

        binding.forgotpassBtn.setOnClickListener(this)

        binding.signinText1.setOnClickListener(this)

        binding.signinText2.setOnClickListener(this)

        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.button_bounce)

        val signintoBounce = findViewById<Button>(R.id.login_signin_button)
        signintoBounce.setOnClickListener {
            signintoBounce.startAnimation(bounceAnimation)
        }

    }

    override fun onClick(v: View?) {

        Log.d("!", "v.id = ${v?.id}")
        when (v?.id) {

            binding.loginSigninButton.id -> {
                Log.d("!", " I have pressed the sign in button")

                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            }

            binding.accountText.id -> {
                Log.d("!", "pressed button")
                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()

            }

            binding.forgotpassBtn.id -> {
                Log.d("!", "pressed btn")
                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            }

            binding.signinText1.id -> {
                Log.d("!", "pressed btn")
                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            }

            binding.signinText2.id -> {
                Log.d("!", "pressed btn")
                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            }

        }
    }
}