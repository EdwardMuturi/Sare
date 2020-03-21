package com.memento_guy.sare.ui.expenses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.memento_guy.sare.R
import com.memento_guy.sare.data.Expense
import kotlinx.android.synthetic.main.fragment_expenses.view.*

/**
 * A simple [Fragment] subclass.
 */
class ExpensesFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_expenses, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val expenseList = ArrayList<Expense>()

        val expense1= Expense("ArtCafe Coffee","13-Mar-2020",250)
        expenseList.add(expense1)
        val expense2= Expense("Phone Bill","14-Apr-2020",2000)
        expenseList.add(expense2)
        val expense3= Expense("Home Internet", "01-Feb-2020",2900)
        expenseList.add(expense3)
        val expense4= Expense("ArtCafe Coffee","16-Mar-2020",250)
        expenseList.add(expense4)
        val expense5= Expense("Laptop Cover","16-Aug-2020",5000)
        expenseList.add(expense5)
        val expense6= Expense("ArtCafe Coffee","16-Mar-2020",250)
        expenseList.add(expense6)
        val expense7= Expense("ArtCafe Coffee","06-Sep-2020",250)
        expenseList.add(expense7)
        val expense8= Expense("ArtCafe Coffee","15-Oct-2020",250)
        expenseList.add(expense8)
        val expense9= Expense("ArtCafe Coffee","16-Mar-2020",250)
        expenseList.add(expense9)
        val expense10= Expense("ArtCafe Coffee","20-Jul-2020",250)
        expenseList.add(expense10)
        val expense11= Expense("ArtCafe Coffee","18-Mar-2020",250)
        expenseList.add(expense11)
        val expense12= Expense("ArtCafe Coffee","16-Mar-2020",250)
        expenseList.add(expense12)

        val expenseAdapter = ExpenseAdapter()
        view.rv_expenses.adapter= expenseAdapter
        view.rv_expenses.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))
        expenseAdapter.submitList(expenseList)
    }

}
