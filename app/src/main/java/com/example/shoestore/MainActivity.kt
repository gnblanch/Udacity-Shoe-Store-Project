package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shoestore.databinding.ActivityMainBinding
import timber.log.Timber
import android.content.Context



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView (this, R.layout.activity_main)
        Timber.plant(Timber.DebugTree())
    }
}