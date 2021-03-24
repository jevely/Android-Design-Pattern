package com.jevely.design.factory

class SichuanFishFactory : FishFactory() {

    private val dealFishFactory = SichuanDealFishFactory()

    override fun dealFish() {
        System.out.println("把鱼杀类放好")
        System.out.println(dealFishFactory.step1())
        System.out.println(dealFishFactory.step2())
        System.out.println(dealFishFactory.step3())
    }

}