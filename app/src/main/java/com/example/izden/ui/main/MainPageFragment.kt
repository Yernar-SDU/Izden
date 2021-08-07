package com.example.izden.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.example.izden.MainActivityViewModel
import com.example.izden.R
import com.example.izden.databinding.FragmentMainBinding
import com.example.izden.utils.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainPageFragment: Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var currentNavController: LiveData<NavController>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState == null){
            setupBottomNavigationBar()
        }
    }


    private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
            R.navigation.main_tab,
            R.navigation.scholarships_tab,
            R.navigation.help_tab,
            R.navigation.profile_tab
        )
        val controller = binding.navView.setupWithNavController(
            navGraphIds=  navGraphIds,
            fragmentManager = childFragmentManager,
            containerId = R.id.nav_host_container,
            intent = requireActivity().intent
        )

        controller.observe(viewLifecycleOwner) {
            currentNavController.value?.addOnDestinationChangedListener(listener)
        }
        currentNavController = controller
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupBottomNavigationBar()
    }


    private val listener =
        NavController.OnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.profile_tab -> {
//                    binding.navView
                }
            }
        }
}