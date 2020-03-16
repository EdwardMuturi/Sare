package com.memento_guy.sare.ui.expenses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.memento_guy.sare.R
import com.memento_guy.sare.data.Expense
import kotlinx.android.synthetic.main.layout_expense_row.view.*

/**
 *Created by Edward Muturi on 16/03/2020
 **/
class ExpenseAdapter (): androidx.recyclerview.widget.ListAdapter<Expense, ExpenseAdapter.ExpenseViewHolder>(
    expenseDiff
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_expense_row, parent, false)

        return ExpenseViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val expense = getItem(position)

        holder.bind(expense)
    }

    class ExpenseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(expense: Expense){
            itemView.mtv_expense_name.text = expense.name
            itemView.mtv_expense_date.text = expense.date
            itemView.mtv_expense_amount.text = "KES ${expense.amount}"
        }

    }

    companion object {
        val expenseDiff = object : DiffUtil.ItemCallback<Expense>() {
            override fun areItemsTheSame(oldItem: Expense, newItem: Expense): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Expense, newItem: Expense): Boolean {
                return oldItem.name == oldItem.name
            }

        }

    }

}