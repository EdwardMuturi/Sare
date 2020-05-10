package com.mementoguy.feature_expense.domain.entity


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