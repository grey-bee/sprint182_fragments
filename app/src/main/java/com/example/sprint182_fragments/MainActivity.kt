package com.example.sprint182_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.add
import com.example.sprint182_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction().add(R.id.fragment_container_view, AuthorisationFragment()).commit()
            supportFragmentManager.commit {
                add<AuthorisationFragment>(R.id.fragment_container_view)
            }
        }
    }
}