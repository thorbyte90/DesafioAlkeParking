package com.desafio1.alkeparking

data class Parking(override val vehicles: MutableSet<Vehicle>, override var vehicle: Vehicle): Parkable(vehicle, vehicles) {
    private val availableSpot: Int = 20

    fun addVehicle(vehicle: Vehicle): String {
        return when(availableSpot - vehicles.size) {
            in 1..availableSpot -> {
                vehicles.add(vehicle)
                "Welcome to AlkeParking!"
            }
            else -> "Sorry, the check-in failed"
        }
    }

}
