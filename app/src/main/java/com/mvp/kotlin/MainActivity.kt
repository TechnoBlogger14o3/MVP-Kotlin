package com.mvp.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mvp.kotlin.interfaces.MainActivityContract
import com.mvp.kotlin.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

/***
 * Created by Techno Blogger on 31/10/17.
 */
class MainActivity : AppCompatActivity(), MainActivityContract.View {

    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)
    }

    override fun setViewData(data: String) {
        txtSample!!.text = data
    }

    override fun initView() {
        btnSubmit!!.setOnClickListener { v -> presenter.onClick(v) }
    }

}
