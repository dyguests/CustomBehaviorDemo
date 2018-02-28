package com.fanhl.custombehaviordemo.dependent

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.fanhl.custombehaviordemo.R

/**
 * 现在我们就来根据第一种情况尝试自定义一个Behavior，这里我们实现一个简单的效果，让一个View根据另一个View上下移动。
首先我们来自定义一个Behavior，起名为DependentBehavior
 */
class DependentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependent)

        val depentent = findViewById<View>(R.id.depentent) as TextView
        depentent.setOnClickListener { v ->
            ViewCompat.offsetTopAndBottom(v, 5)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings ->
                return true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
