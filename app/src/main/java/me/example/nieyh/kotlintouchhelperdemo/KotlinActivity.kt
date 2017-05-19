package me.example.nieyh.kotlintouchhelperdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.example.nieyh.kotlintouchhelperdemo.view.DragActivity
import me.example.nieyh.kotlintouchhelperdemo.view.SwipeActivity

class KotlinActivity : AppCompatActivity() {

    var mDragBtu: Button ?= null
    var mSwipeBtu: Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        mDragBtu = findViewById(R.id.activity_kotlin_drag) as Button
        mSwipeBtu = findViewById(R.id.activity_kotlin_swipe) as Button


        mDragBtu!!.setOnClickListener {
            startActivity(Intent(baseContext, DragActivity::class.java))
        }

        mSwipeBtu!!.setOnClickListener {
            startActivity(Intent(baseContext, SwipeActivity::class.java))
        }
    }
}
