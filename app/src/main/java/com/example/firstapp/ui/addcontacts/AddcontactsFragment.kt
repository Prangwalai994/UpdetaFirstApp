package com.example.firstapp.ui.addcontacts

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.firstapp.R
import com.example.firstapp.ui.gallery.GalleryViewModel

class AddcontactsFragment : Fragment() {

    private lateinit var addcontactsViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addcontactsViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_addcontacts, container, false)
        val textView: TextView = root.findViewById(R.id.text_aboutme)
        addcontactsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}