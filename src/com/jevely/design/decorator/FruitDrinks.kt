package com.jevely.design.decorator

class FruitDrinks : Drinks() {

    override fun setDescribe(): String {
        return "果汁"
    }

    override fun cost(): Int {
        return 8
    }
}