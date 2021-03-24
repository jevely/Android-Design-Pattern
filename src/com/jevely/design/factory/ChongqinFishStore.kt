package com.jevely.design.factory

class ChongqinFishStore() : FishStore() {

    private val fishFactory = ChongqinFishFactory()

    override fun dealFish() {
        fishFactory.dealFish()
    }
}