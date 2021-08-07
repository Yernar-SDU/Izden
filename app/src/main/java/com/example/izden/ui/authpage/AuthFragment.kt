package com.example.izden.ui.authpage

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
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment: Fragment() {
    private var _binding: FragmentAuthBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i("ed", "onCreateView: ")
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_auth, container, false)
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
        binding.buttonLogin.setOnClickListener{
            val action = AuthFragmentDirections.toSignInFragment()
            findNavController().navigate(action)
        }
        binding.buttonRegister.setOnClickListener{
            val action = AuthFragmentDirections.toSignUpFragment()
            findNavController().navigate(action)
        }

    }


}