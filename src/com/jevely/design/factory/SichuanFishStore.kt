package com.jevely.design.factory

class SichuanFishStore() : FishStore() {

    private val fishFactory = SichuanFishFactory()

    override fun dealFish() {
        fishFactory.dealFish()
    }
}