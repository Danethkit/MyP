package com.example.myp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var page = 3
    fun invis()
    {
        photo.visibility = View.INVISIBLE
        photo1.visibility = View.INVISIBLE
        photo2.visibility = View.INVISIBLE
    }
    fun next(view: View)
    {
    if(page<=3) page +=1 else page = 1
        invis()
        display()
    }
    fun prev(view: View)
    {
        if(page>=1)page -=1 else page =1
    }
    fun display()
    {
        when(page)
        {
            1-> {photo.visibility=View.VISIBLE}
            2-> {photo1.visibility=View.VISIBLE}
            3->{photo2.visibility=View.VISIBLE}
        }
    }
}


