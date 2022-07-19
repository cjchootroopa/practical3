package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var student =Student("Ash Chan", "RSD")
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)


        binding.btnSetData.setOnClickListener(){


            binding.myStudent = student
//            binding.tvName.text="All"
//            binding.tvProgramme.text="RSD"
        }

        binding.btnChange.setOnClickListener(){
            student.programme="RIT"
            binding.invalidateAll()
        }

    }
}