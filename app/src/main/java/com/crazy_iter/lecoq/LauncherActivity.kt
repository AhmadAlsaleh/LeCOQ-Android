package com.crazy_iter.lecoq

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_launcher.*

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        mainLogoIV.startAnimation(StaticMethods.logoAnimaton(this))

        startActivity(Intent(this, MainActivity::class.java))
    }
}
