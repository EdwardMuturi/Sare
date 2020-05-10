package com.mementoguy.feature_expense.domain.usecase

import com.mementoguy.feature_expense.domain.repository.ExpenseRepository

internal class FetchExpenseList(private val expenseRepository: ExpenseRepository) {
    suspend operator fun invoke(userId: String) = expenseRepository.fetchExpenseList(userId)
}