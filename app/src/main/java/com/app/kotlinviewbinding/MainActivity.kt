package com.app.kotlinviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.kotlinviewbinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    //https://www.section.io/engineering-education/view-binding-in-android/

    private lateinit var binding: ActivityMainBinding //defining the binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)   // we now set the contentview as the binding.root

        binding.txtMyText.setText("This is view binding example")





    }
}