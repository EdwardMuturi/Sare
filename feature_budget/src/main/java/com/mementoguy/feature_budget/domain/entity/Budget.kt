package com.mementoguy.feature_budget.domain.entity

class Budget(
    val name : String,
    val setAmount: Int,
    val balance: Int,
    val createdAt: Int,
    val expenseIdList: List<String>
) {
}