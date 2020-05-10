package com.memento_guy.sare.data

import java.time.temporal.TemporalAmount
import java.util.*

/**
 *Created by Edward Muturi on 16/03/2020
 **/
data class Expense(
    val name: String,
    val date: String,
    val amount: Int
){
    constructor() : this(
        "",
        "",
        0
    )
}