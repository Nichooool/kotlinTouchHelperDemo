package me.example.nieyh.kotlintouchhelperdemo.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import me.example.nieyh.kotlintouchhelperdemo.R
import me.example.nieyh.kotlintouchhelperdemo.adapter.DemoDragRecyclerAdapter
import me.example.nieyh.kotlintouchhelperdemo.adapter.DemoSwipeRecyclerAdapter
import me.example.nieyh.kotlintouchhelperdemo.modle.ImageModle

/**
 * Created by nieyh on 17-5-19.
 */
open class SwipeActivity : AppCompatActivity() {

    //列表视图
    private var mRecyclerView: RecyclerView? = null

    private var mDemoSwipeRecyclerAdapter: DemoSwipeRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drag)
        mRecyclerView = findViewById(R.id.activity_drag_recycler) as RecyclerView
        val datas = ArrayList<Any>()
        datas.add(ImageModle(R.mipmap.a))
        datas.add(ImageModle(R.mipmap.b))
        datas.add(ImageModle(R.mipmap.c))
        datas.add(ImageModle(R.mipmap.d))
        datas.add(ImageModle(R.mipmap.e))
        datas.add(ImageModle(R.mipmap.e))
        mDemoSwipeRecyclerAdapter = DemoSwipeRecyclerAdapter(datas)
        mDemoSwipeRecyclerAdapter!!.attachiToRecyclerView(mRecyclerView!!)
        val LinearLayoutManager = LinearLayoutManager(this.baseContext)

        mRecyclerView!!.layoutManager = LinearLayoutManager
        mRecyclerView!!.adapter = mDemoSwipeRecyclerAdapter
    }

}