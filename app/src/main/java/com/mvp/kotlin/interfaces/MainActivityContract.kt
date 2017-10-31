package com.mvp.kotlin.interfaces

/***
 * Created by Techno Blogger on 31/10/17.
 */
interface MainActivityContract {

    interface View {
        fun initView()
        fun setViewData(data: String)
    }

    interface Model {
        val data: String
    }

    interface Presenter {
        fun onClick(view: android.view.View)
    }
}