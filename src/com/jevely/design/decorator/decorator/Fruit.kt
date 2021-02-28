package com.jevely.design.decorator.decorator

import com.jevely.design.decorator.Drinks

class Fruit(private val drinks: Drinks) : DecoratorDrinks() {

    override fun setDescribe(): String {
        return "${drinks.setDescribe()} + 水果"
    }

    override fun cost(): Int {
        return drinks.cost() + 1
    }
}