package com.kuntech.rickandmortyrestapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kuntech.rickandmortyrestapi.databinding.ActivityMainBinding
import com.kuntech.rickandmortyrestapi.network.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by lazy{
        ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MainAcitivityAdapter()
        binding.rickMorkyRv.adapter = adapter
        viewModel.morkandrocky.observe(this, Observer {
            adapter.differ.submitList(it.results)
        })
    }
}