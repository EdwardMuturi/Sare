package com.mementoguy.feature_expense.domain.repository

import com.mementoguy.feature_expense.domain.entity.Expense
import java.lang.Exception

sealed class Result<out T : Any>{
    data class Success<out T : Any>(val data : T) : Result<T>()
    data class Error<out T : Any>(val exception: Exception) : Result<Nothing>()
}

internal interface ExpenseRepository {
    suspend fun storeExpense(expense: Expense): Result<String>
    suspend fun deleteExpense(expenseId: String) : Result<String>
    suspend fun getExpense(expenseId: String) : Expense
    suspend fun fetchExpenseList(userId: String) : List<Expense>
}