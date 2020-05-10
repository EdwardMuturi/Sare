package com.mementoguy.feature_budget.domain.usecase

import com.mementoguy.feature_budget.domain.entity.Budget
import com.mementoguy.feature_budget.domain.repository.BudgetRepository


internal class CreateOrUpdateBudgetUseCase(private val budgetRepository : BudgetRepository) {
    suspend operator fun invoke (budget: Budget) = budgetRepository.saveBudget(budget)
}