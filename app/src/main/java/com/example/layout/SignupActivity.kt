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

import com.example.layout.databinding.SignUpBinding

class SignupActivity: Activity(), OnClickListener {
    lateinit var binding: SignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.sign_up)



        binding.signupButton.setOnClickListener(this)



        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.button_bounce)

        val signintoBounce = findViewById<Button>(R.id.signup_button)
        signintoBounce.setOnClickListener {
            signintoBounce.startAnimation(bounceAnimation)
        }

    }

    override fun onClick(v: View?) {

        Log.d("!", "v.id = ${v?.id}")
        when (v?.id) {

            binding.signupButton.id -> {
                Log.d("!", " I have pressed the sign in button")

                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            }



        }
    }
}