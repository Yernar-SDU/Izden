package com.example.izden.ui.profile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.izden.R
import com.example.izden.databinding.FragmentAuthBinding
import com.example.izden.databinding.FragmentProfileBinding
import com.example.izden.databinding.FragmentScholarshipsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ScholarshipFragment: Fragment() {
    private var _binding: FragmentScholarshipsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i("ed", "onCreateView: ")
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_scholarships, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        setObservers()
    }

    private fun setObservers() {
    }

    private fun initView() {


    }


}