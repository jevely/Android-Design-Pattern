package com.jevely.design.decorator

class WaterDrinks : Drinks() {

    override fun setDescribe(): String {
        return "白水"
    }

    override fun cost(): Int {
        return 2
    }
}