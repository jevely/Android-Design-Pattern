package com.jevely.design.factory

class ChongqinDealFishFactory : DealFishFactory {
    override fun step1(): String {
        return "放入很多花椒"
    }

    override fun step2(): String {
        return "放入很多辣椒"
    }

    override fun step3(): String {
        return "放入葱姜蒜"
    }

}