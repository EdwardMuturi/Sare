package com.mementoguy.feature_budget.domain.entity

class Budget(
    val name : String,
    val setAmount: Int,
    val balance: Int,
    val createdAt: String,
    val expenseIdList: List<String>
) {
    constructor() : this(
        "",
        0,
        0,
        "",
        ArrayList<String>()
    )
}