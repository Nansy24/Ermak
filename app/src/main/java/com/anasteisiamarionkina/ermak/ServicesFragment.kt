package com.anasteisiamarionkina.ermak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anasteisiamarionkina.ermak.databinding.FragmentCrimeaBinding
import com.anasteisiamarionkina.ermak.databinding.FragmentServicesBinding


class ServicesFragment : Fragment() {

    lateinit var binding: FragmentServicesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

}