package com.example.kothlinwork

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class midfrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_midfrag, container, false)

         Toast.makeText(context,"android fragment",Toast.LENGTH_SHORT).show()

        return view
    }  }
