package com.mementoguy.feature_budget.domain.usecase

import com.mementoguy.feature_budget.domain.entity.Budget
import com.mementoguy.feature_budget.domain.repository.BudgetRepository

internal class GetBudgetListUseCase(private val budgetRepository: BudgetRepository) {
    suspend operator fun invoke( userId: String) = budgetRepository.fetchBudgetList(userId)
}
