package com.desafio1.alkeparking

import kotlin.math.ceil
import kotlin.math.roundToInt

open class Parkable(open var vehicle: Vehicle, open val vehicles: MutableSet<Vehicle>) {

    fun checkOutVehicle(plate: String, onSuccess: (Int) -> String, onError: () -> String): String {
        val vehicleToRemove = vehicles.filter { it.plate == plate }
        return if (vehicleToRemove.isNotEmpty()) {
            val foundVehicle = vehicleToRemove[0]
            val fee = calculateFee(foundVehicle.type, foundVehicle.parkedTime, foundVehicle.discountCard != null)
            vehicles.remove(foundVehicle)
            onSuccess(fee)
        } else onError()
    }

    private fun calculateFee(type: VehicleType, parkedTime: Int, hasDiscountCard: Boolean): Int {
        val total: Int
        if (parkedTime > 120) {
            val blocks = (ceil((parkedTime - 120.0) / 15)).toInt()
            total = when (type) {
                VehicleType.CAR -> (blocks * 5) + VehicleType.CAR.twoHoursBase
                VehicleType.MOTO -> (blocks * 5) + VehicleType.MOTO.twoHoursBase
                VehicleType.MINIBUS -> (blocks * 5) + VehicleType.MINIBUS.twoHoursBase
                VehicleType.BUS -> (blocks * 5) + VehicleType.BUS.twoHoursBase
            }
        } else {
            total = when(type) {
                VehicleType.CAR -> VehicleType.CAR.twoHoursBase
                VehicleType.MOTO -> VehicleType.MOTO.twoHoursBase
                VehicleType.MINIBUS -> VehicleType.MINIBUS.twoHoursBase
                VehicleType.BUS -> VehicleType.BUS.twoHoursBase
            }
        }
        return if (hasDiscountCard) (total * 0.85).roundToInt() else total
    }
}
