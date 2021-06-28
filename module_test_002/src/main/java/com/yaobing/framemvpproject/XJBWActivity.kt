package com.yaobing.framemvpproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yaobing.module_apt.Router
import com.yaobing.module_middleware.activity.BaseActivity

@Router("asdf")
class XJBWActivity : BaseActivity() {
    override fun getLayoutID(): Int {
        return R.layout.activity_x_j_b_w
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x_j_b_w)
    }
}