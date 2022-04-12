package com.desafio1.alkeparking

open class Parkable(open var vehicle: Vehicle, open val vehicles: MutableSet<Vehicle>) {

    fun checkOutVehicle(plate: String, onSuccess: (Int) -> String, onError: () -> String): String {
        val vehicleToRemove = vehicles.filter { it.plate == plate }
        return if (vehicleToRemove.isNotEmpty()) {
            val foundVehicle = vehicleToRemove[0]
            val fees = 35
            vehicles.remove(foundVehicle)
            onSuccess(fees)
        } else onError()
    }
}
