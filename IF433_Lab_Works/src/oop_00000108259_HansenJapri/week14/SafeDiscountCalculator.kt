package oop_00000108259_HansenJapri.week14

class SeniorDiscount: DiscountStrategy {
    override fun apply(price: Double) = price * 0.75
}