package com.mementoguy.feature_budget.domain.repository

import com.mementoguy.feature_budget.domain.entity.Budget
import java.lang.Exception

sealed class Result<out T : Any>{
    data class Success<out T : Any>(val data : T) : Result<T>()
    data class Error<out T : Any>(val exception: Exception ) : Result<Nothing>()
}
internal interface BudgetRepository {
    suspend fun saveBudget(budget: Budget)  : Result<String>
    suspend fun deleteBudget(budgetId: String) : Result<String>
    suspend fun getBudget(budgetId: String) : Budget
    suspend fun fetchBudgetList(userId: String) : List<Budget>
}