package com.memento_guy.sare.data

/**
 *Created by Edward Muturi on 18/03/2020
 **/
data class BudgetSummary(val setBudget:Long,
val used: Long){
    constructor() : this(
        0,
        0
    )
}