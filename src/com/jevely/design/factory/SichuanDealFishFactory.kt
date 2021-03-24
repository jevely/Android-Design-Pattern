package com.jevely.design.factory

class SichuanDealFishFactory : DealFishFactory {
    override fun step1(): String {
        return "放入四川豆瓣"
    }

    override fun step2(): String {
        return "放入一点花椒"
    }

    override fun step3(): String {
        return "放入葱姜蒜"
    }

}