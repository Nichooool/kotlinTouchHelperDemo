package me.example.nieyh.kotlintouchhelperdemo.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import me.example.nieyh.kotlintouchhelperdemo.R
import me.example.nieyh.kotlintouchhelperdemo.adapter.DemoDragRecyclerAdapter
import me.example.nieyh.kotlintouchhelperdemo.modle.ImageModle

/**
 * Created by nieyh on 17-5-19.
 */
open class DragActivity : AppCompatActivity() {

    //列表视图
    private var mRecyclerView: RecyclerView? = null

    private var mDemoDragRecyclerAdapter: DemoDragRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drag)
        mRecyclerView = findViewById(R.id.activity_drag_recycler) as RecyclerView
        val datas = ArrayList<Any>()
        datas.add("title1")
        datas.add(ImageModle(R.mipmap.a))
        datas.add(ImageModle(R.mipmap.a))
        datas.add(ImageModle(R.mipmap.a))
        datas.add("title2")
        datas.add(ImageModle(R.mipmap.b))
        datas.add(ImageModle(R.mipmap.b))
        datas.add(ImageModle(R.mipmap.b))
        datas.add(ImageModle(R.mipmap.b))
        datas.add("title3")
        datas.add(ImageModle(R.mipmap.c))
        datas.add(ImageModle(R.mipmap.c))
        datas.add(ImageModle(R.mipmap.c))
        datas.add(ImageModle(R.mipmap.c))
        datas.add(ImageModle(R.mipmap.c))
        datas.add("title4")
        datas.add(ImageModle(R.mipmap.d))
        datas.add(ImageModle(R.mipmap.d))
        datas.add(ImageModle(R.mipmap.d))
        datas.add(ImageModle(R.mipmap.d))
        datas.add(ImageModle(R.mipmap.d))
        datas.add("title5")
        datas.add(ImageModle(R.mipmap.e))
        datas.add(ImageModle(R.mipmap.e))
        datas.add(ImageModle(R.mipmap.e))
        datas.add(ImageModle(R.mipmap.e))
        datas.add(ImageModle(R.mipmap.e))
        mDemoDragRecyclerAdapter = DemoDragRecyclerAdapter(datas)
        mDemoDragRecyclerAdapter!!.attachiToRecyclerView(mRecyclerView!!)
        val gridLayoutManager = GridLayoutManager(this.baseContext, 3)
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                val viewType = mDemoDragRecyclerAdapter!!.getItemViewType(position)
                when (viewType) {
                    DemoDragRecyclerAdapter.TYPE_TITLE -> {
                        return 3
                    }
                    else -> {
                        return 1
                    }
                }
            }
        }

        mRecyclerView!!.layoutManager = gridLayoutManager
        mRecyclerView!!.adapter = mDemoDragRecyclerAdapter
    }

}