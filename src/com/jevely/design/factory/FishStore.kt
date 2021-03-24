package com.jevely.design.factory

abstract class FishStore() {

    fun getRoastFish() {
        buyAFish()
        dealFish()
        cookFish()
        giveFish()
    }

    private fun buyAFish() {
        System.out.println("买了一条鱼")
    }


    private fun cookFish() {
        System.out.println("把鱼煮熟")
    }

    private fun giveFish() {
        System.out.println("把鱼送出去")
    }

    abstract fun dealFish()

}