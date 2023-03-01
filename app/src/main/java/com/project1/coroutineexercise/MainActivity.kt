package com.project1.coroutineexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.project1.coroutineexercise.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    private var currentValue = 0
    private var inputValue: Int? = null
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(mainBinding.root)
    }

    override fun onResume() {
        super.onResume()
        mainBinding.btnIncreaseNumber.setOnClickListener {
            mainBinding.btnIncreaseNumber.setOnClickListener {
                runBlocking { suspend() }
            }

        }
    }

    suspend fun suspend(){
        delay(2000)
        var number = mainBinding.tvInsertNumber.text.toString().toInt()
        var result = number+1+currentValue
        currentValue++
        mainBinding.textView.text = result.toString()
    }
}