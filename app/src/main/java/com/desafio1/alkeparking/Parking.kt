package com.desafio1.alkeparking

data class Parking(val vehicles: MutableSet<Vehicle>) {
    var availableSpot: Int = 20

    fun addVehicle(vehicle: Vehicle): Boolean {
        return (availableSpot - vehicles.size) > 0
    }

}
