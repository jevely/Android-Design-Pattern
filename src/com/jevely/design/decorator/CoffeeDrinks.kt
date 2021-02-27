package com.jevely.design.decorator

class CoffeeDrinks : Drinks() {

    override fun setDescribe(): String {
        return "咖啡"
    }

    override fun cost(): Int {
        return 8
    }
}