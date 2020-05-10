package com.mementoguy.feature_expense.domain.usecase

import com.mementoguy.feature_expense.domain.entity.Expense
import com.mementoguy.feature_expense.domain.repository.ExpenseRepository

internal class CreateOrUpdateExpenseUseCase(private val expenseRepository: ExpenseRepository)  {
    suspend operator fun invoke(expense : Expense) = expenseRepository.storeExpense(expense)
}