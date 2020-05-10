package com.mementoguy.feature_budget.domain.usecase

import com.mementoguy.feature_budget.domain.repository.BudgetRepository


internal class GetBudgetUseCase (private val budgetRepository : BudgetRepository){
    suspend operator fun invoke(budgetId : String) = budgetRepository.getBudget(budgetId)
}