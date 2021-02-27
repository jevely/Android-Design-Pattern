package com.jevely.design.decorator

class MilkTeaDrinks : Drinks() {

    override fun setDescribe(): String {
        return "奶茶"
    }

    override fun cost(): Int {
        return 5
    }
}