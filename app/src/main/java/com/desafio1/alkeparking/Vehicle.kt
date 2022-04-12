package com.desafio1.alkeparking

import java.util.*

const val MINUTES_IN_MILISECONDS = 60000

data class Vehicle(val plate: String,
                   val type: VehicleType,
                   val checkInTime: Calendar,
                   var discountCard: String? = null) {

    val parkedTime: Int
        get() = ((Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS).toInt()

    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return this.plate.hashCode()
    }
}
