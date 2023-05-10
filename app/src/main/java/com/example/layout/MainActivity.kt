package com.example.layout

import android.animation.Animator
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener

import android.widget.Toast
import androidx.databinding.DataBindingUtil
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button

import com.example.layout.databinding.ActivityMainBinding

class MainActivity : Activity(), OnClickListener {

    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        binding.signinButton.setOnClickListener(this)
        binding.signupButton.setOnClickListener(this)

        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.button_bounce)

        val signintoBounce = findViewById<Button>(R.id.signin_button)
        signintoBounce.setOnClickListener {
            signintoBounce.startAnimation(bounceAnimation)
        }

        val signuptoBounce = findViewById<Button>(R.id.signup_button)
        signuptoBounce.setOnClickListener {
            signuptoBounce.startAnimation(bounceAnimation)
        }

    }

    override fun onClick(v: View?) {

        Log.d("!", "v.id = ${v?.id}")
        when (v?.id) {

            binding.signinButton.id -> {
                Log.d("!", " I have pressed the sign in button")

                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()

            }



            binding.signupButton.id -> {
                Log.d("!", " I have pressed the sign up button")

                Toast.makeText(this, " working", Toast.LENGTH_SHORT).show()
                translateBtn2()
            }

        }
    }



    private fun translateBtn2() {

        val animation = binding.signupButton.animate().alpha(0.5f)
        animation.duration = 1000
        animation.translationXBy(300f)

        animation.translationXBy(-300f)

        animation.start()

        animation.setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(animation: Animator) {
                TODO("Not yet implemented")

            }

            override fun onAnimationCancel(animation: Animator) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(animation: Animator) {
                TODO("Not yet implemented")
            }
        })
    }




}