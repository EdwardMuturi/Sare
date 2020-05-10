package com.mementoguy.feature_budget.domain.usecase

import com.mementoguy.feature_budget.domain.repository.BudgetRepository

/**
 * Created by Edward Muturi on 10/05/2020.
 */
internal class DeleteBudgetUseCase(private val budgetRepository : BudgetRepository) {
    suspend operator fun invoke( budgetId: String) = budgetRepository.deleteBudget(budgetId)
}