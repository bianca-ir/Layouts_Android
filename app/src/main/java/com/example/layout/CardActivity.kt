package com.example.layout

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.layout.databinding.CardsBinding


class CardActivity: Activity(), OnClickListener {
    lateinit var binding: CardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.cards)

        binding.moreText.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        Log.d("!", "v.id = ${v?.id}")
        when (v?.id) {

            binding.moreText.id -> {
                Log.d("!", " I have pressed this button")

                Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            }

        }
    }
}