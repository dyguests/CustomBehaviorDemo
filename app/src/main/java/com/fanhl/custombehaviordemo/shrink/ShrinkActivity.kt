package com.fanhl.custombehaviordemo.shrink

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.fanhl.custombehaviordemo.R

import kotlinx.android.synthetic.main.activity_shrink.*

/**
 * https://www.bignerdranch.com/blog/customizing-coordinatorlayouts-behavior/
 */
class ShrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shrink)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
