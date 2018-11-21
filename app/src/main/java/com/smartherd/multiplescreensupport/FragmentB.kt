package com.smartherd.multiplescreensupport

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b.*


class FragmentB: Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

		return inflater.inflate(R.layout.fragment_b, container, false)
	}

	fun displayDetails(title: String, description: String) {

        txvTitle.text = title
        txvDescription.text = description
	}
}
