package com.anasteisiamarionkina.ermak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anasteisiamarionkina.ermak.databinding.FragmentAgvantagesBinding
import com.anasteisiamarionkina.ermak.databinding.FragmentCrimeaBinding


class AdvantagesFragment : Fragment() {

    lateinit var binding: FragmentAgvantagesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAgvantagesBinding.inflate(inflater, container, false)
        return binding.root
    }

}