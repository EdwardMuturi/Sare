package com.memento_guy.sare.ui.expenses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.memento_guy.sare.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class AddExpenseFragment : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_expense, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.fab_add_expense?.setImageResource(R.drawable.ic_done_black_24dp)

        activity?.fab_add_expense?.setOnClickListener {
            it.fab_add_expense?.setImageResource(R.drawable.ic_add_expense_24dp)
            requireActivity().supportFragmentManager.beginTransaction().replace(
                R.id.bottom_container, ExpensesFragment()
            ).commit()
        }
    }

}
