package com.memento_guy.sare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        configBottomAppBar()

        BottomSheetBehavior.from(bottom_container).state = BottomSheetBehavior.STATE_HALF_EXPANDED
        supportFragmentManager.beginTransaction().replace(
            R.id.bottom_container, ExpensesFragment()
        ).commit()

    }

    private fun configBottomAppBar() {
        bottom_app_bar.replaceMenu(R.menu.bottom_app_menu)
        bottom_app_bar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_settings -> {
                    Toast.makeText(this, "Comming Soon!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
