package oop_00000108259_HansenJapri.week12

sealed class FeederExceptions (msg: String): Exception(msg)

class FoodEmptyException(requested: Int, available: Int): FeederExceptions("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException: FeederExceptions("Wadah dispenser tersangkut/macet!")

