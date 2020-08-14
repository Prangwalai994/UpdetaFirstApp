package com.example.firstapp.ui.addcontacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.example.firstapp.R
import com.example.firstapp.ui.gallery.GalleryViewModel

class AddcontactsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_addcontacts,container,false)
    }
}