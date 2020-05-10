package com.mementoguy.feature_expense.domain.usecase

import com.mementoguy.feature_expense.domain.repository.ExpenseRepository

internal class DeleteExpense(private val expenseRepository: ExpenseRepository) {
    suspend operator fun invoke(expenseId: String) = expenseRepository.deleteExpense(expenseId)
}