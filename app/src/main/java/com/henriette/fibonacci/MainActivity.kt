package com.henriette.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fibonacciNumbers = generateFibonacciNumbers(100)

        val recyclerView: RecyclerView=findViewById(R.id.rvNamesList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=(RecyclerView.Adapter<RecyclerView.ViewHolder!>?..RecyclerView.Adapter<*>?)
//        recyclerView.adapter = FibonacciAdapter(fibonacciNumbers)
        recyclerView.adapter=FibonacciAdapter(())

    }
    private fun generateFibonacciNumbers(count:Int):List<Long> {
        val numbers = mutableListOf<Long>()
        var number1 = 0L
        var number2 = 1L

        repeat(count){

            numbers.add(number1)
            val next = number1+number2
            number1=number2
            number2=next
        }
        return numbers
    }
}