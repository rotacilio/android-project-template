package com.sidia.febracis.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.sidia.febracis.databinding.FragmentHomeBinding
import com.sidia.febracis.db.AppDatabase
import com.sidia.febracis.db.model.UserEntity
import com.sidia.febracis.repositories.UserRepository
import com.sidia.febracis.storage.DataStoreUtil
import com.sidia.febracis.utils.LOG_TAG
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

//    @Inject
//    lateinit var dataStore: DataStoreUtil
//
//    @Inject
//    lateinit var userRepository: UserRepository

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentHomeBinding.inflate(layoutInflater, container, false).apply {
        binding = this
        lifecycleOwner = this@HomeFragment
    }.root
}