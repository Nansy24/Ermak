package com.anasteisiamarionkina.ermak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anasteisiamarionkina.ermak.databinding.FragmentCrimeaBinding


class CrimeaFragment : Fragment() {

    lateinit var binding: FragmentCrimeaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCrimeaBinding.inflate(inflater, container, false)
        return binding.root
    }

}