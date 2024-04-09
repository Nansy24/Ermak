package com.anasteisiamarionkina.ermak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.commit
import com.anasteisiamarionkina.ermak.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavView.selectedItemId = R.id.home
        binding.bottomNavView.setOnItemSelectedListener(this)
    }

    private fun crimeaFragmentClicked() {
        supportFragmentManager.commit{
            replace(R.id.fragment_container, CrimeaFragment())
        }
    }

    private fun servicesFragmentClicked() {
        supportFragmentManager.commit{
            replace(R.id.fragment_container, ServicesFragment())
        }
    }

    private fun homeFragmentClicked() {
        supportFragmentManager.commit{
            replace(R.id.fragment_container, HomeFragment())
        }
    }

    private fun advantagesFragmentClicked() {
        supportFragmentManager.commit{
            replace(R.id.fragment_container, AdvantagesFragment())
        }
    }

    private fun worksFragmentClicked() {
        supportFragmentManager.commit{
            replace(R.id.fragment_container, WorksFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.crimea_advantages -> {crimeaFragmentClicked()
                true}
            R.id.dop_serveces -> {servicesFragmentClicked()
                true}
            R.id.home -> {homeFragmentClicked()
                true}
            R.id.our_advantages -> {advantagesFragmentClicked()
                true}
            R.id.our_works -> {worksFragmentClicked()
                true}

            else -> {
                false
            }
        }
    }


}




