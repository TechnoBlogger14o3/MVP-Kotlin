package com.mvp.kotlin.model

import com.mvp.kotlin.interfaces.MainActivityContract

/***
 * Created by Techno Blogger on 31/10/17.
 */
class MainActivityModel : MainActivityContract.Model {
    override val data: String
        get() = "MVP in Kotlin"
}