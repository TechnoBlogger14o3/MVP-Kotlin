package com.mvp.kotlin.presenter

import android.view.View
import com.mvp.kotlin.interfaces.MainActivityContract
import com.mvp.kotlin.model.MainActivityModel

/***
 * Created by Techno Blogger on 31/10/17.
 */

class MainActivityPresenter(private val mView: MainActivityContract.View) : MainActivityContract.Presenter {
    private var mModel: MainActivityContract.Model? = null

    init {
        initPresenter()
    }

    private fun initPresenter() {
        mModel = MainActivityModel()
        mView.initView()
    }

    override fun onClick(view: View) {
        val data = mModel!!.data
        mView.setViewData(data)
    }
}