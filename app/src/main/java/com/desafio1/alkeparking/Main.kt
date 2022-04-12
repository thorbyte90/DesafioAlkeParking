package com.desafio1.alkeparking

import java.util.*

fun main() {
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("BB222BB", VehicleType.MOTO, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(car, moto, minibus, bus))

    val listOfVehicles = listOf(
        car, moto, minibus, bus,
        Vehicle("EE555EE", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("FF666FF", VehicleType.MOTO, Calendar.getInstance()),
        Vehicle("GG777GG", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_CARD_003"),
        Vehicle("HH888HH", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("II999II", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("JJ000JJ", VehicleType.MOTO, Calendar.getInstance()),
        Vehicle("KK111KK", VehicleType.MINIBUS, Calendar.getInstance()),
        Vehicle("LL222LL", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("MM333MM", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("NN444NN", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("OO555OO", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_CARD_004"),
        Vehicle("PP666PP", VehicleType.MOTO, Calendar.getInstance()),
        Vehicle("QQ777QQ", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("RR888RR", VehicleType.MINIBUS, Calendar.getInstance()),
        Vehicle("SS999SS", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("TT000TT", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("UU111UU", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_005"),
        Vehicle("VV222VV", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("WW333WW", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("XX444XX", VehicleType.MOTO, Calendar.getInstance()),
    )

    listOfVehicles.map {
        println(parking.addVehicle(it))
    }

}