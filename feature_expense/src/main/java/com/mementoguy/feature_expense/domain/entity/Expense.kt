package com.mementoguy.feature_expense.domain.entity

import com.mementoguy.feature_expense.domain.enum.ExpenseCategory


data class Expense(
    val category: String,
    val expenseName: String,
    val amountSpent: Int,
    val createdAt: String
) {
    constructor() : this (
        "",
        "",
        0,
        ""
    )
}