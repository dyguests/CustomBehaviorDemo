package com.fanhl.custombehaviordemo.dependent

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import com.fanhl.custombehaviordemo.R
import kotlinx.android.synthetic.main.activity_dependent.*

/**
 * 现在我们就来根据第一种情况尝试自定义一个Behavior，这里我们实现一个简单的效果，让一个View根据另一个View上下移动。
首先我们来自定义一个Behavior，起名为DependentBehavior
 */
class DependentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependent)

        dependent.setOnClickListener { v ->
            ViewCompat.offsetTopAndBottom(v, 5)
        }
    }
}
