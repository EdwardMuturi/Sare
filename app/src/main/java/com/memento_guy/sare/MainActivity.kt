package com.memento_guy.sare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.memento_guy.sare.ui.expenses.ExpensesFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BottomSheetBehavior.from(bottom_container).state = BottomSheetBehavior.STATE_COLLAPSED
        supportFragmentManager.beginTransaction().replace(
            R.id.bottom_container, ExpensesFragment()
        ).commit()
    }
}
