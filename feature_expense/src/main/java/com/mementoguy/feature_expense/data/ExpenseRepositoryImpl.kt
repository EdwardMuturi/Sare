package com.mementoguy.feature_expense.data

import com.mementoguy.feature_expense.domain.entity.Expense
import com.mementoguy.feature_expense.domain.repository.ExpenseRepository
import com.mementoguy.feature_expense.domain.repository.Result


class ExpenseRepositoryImpl(val firebaseService: FirebaseService) : ExpenseRepository {

    override suspend fun storeExpense(expense: Expense): Result<String> {

        val documentReference = firebaseService.saveDocument(expense, "EXPENSES")

        return if (documentReference?.id == null) {
            Result.Error<String>("expense not saved")
        } else {
            Result.Success<String>("document saved with id ${documentReference.id}")
        }

    }

    override suspend fun deleteExpense(expenseId: String): Result<String> {

    }

    override suspend fun getExpense(expenseId: String): Expense {

    }

    override suspend fun fetchExpenseList(userId: String): List<Expense> {

    }
}