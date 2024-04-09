package com.anasteisiamarionkina.ermak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anasteisiamarionkina.ermak.databinding.FragmentCrimeaBinding
import com.anasteisiamarionkina.ermak.databinding.FragmentWorksBinding


class WorksFragment : Fragment() {

    lateinit var binding: FragmentWorksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWorksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rcView = binding.rcItem
        val adapter = WorkItemAdapter()
        rcView.adapter = adapter

    }

}