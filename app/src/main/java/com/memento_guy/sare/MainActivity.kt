package com.memento_guy.sare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.memento_guy.sare.ui.SummaryFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportFragmentManager.beginTransaction().replace(
           R.id.main_container, SummaryFragment()
       ).commit()
    }
}
