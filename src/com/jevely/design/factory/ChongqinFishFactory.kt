package com.jevely.design.factory

class ChongqinFishFactory : FishFactory() {

    private val dealFishFactory = ChongqinDealFishFactory()

    override fun dealFish() {
        System.out.println("把鱼杀类放好")
        System.out.println(dealFishFactory.step1())
        System.out.println(dealFishFactory.step2())
        System.out.println(dealFishFactory.step3())
    }
}