package com.tamerthedark.a14haftasorulari.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tamerthedark.a14haftasorulari.R
import com.tamerthedark.a14haftasorulari.data.Days
import com.tamerthedark.a14haftasorulari.data.DaysAdapter
import com.tamerthedark.a14haftasorulari.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val daysList = listOf(
        Days("Pazartesi",1),
        Days("Salı",2),
        Days("Çarşamba",3),
        Days("Perşembe",4),
        Days("Cuma",5),
        Days("Cumartesi",6),
        Days("Pazar",7)
    )
    private var adapter: DaysAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        setupActionBar()
        setupMenuHandling()
    }

    private fun setupRecyclerView() {
        adapter = DaysAdapter(daysList, findNavController())
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }

    private fun setupActionBar() {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
    }

    private fun setupMenuHandling() {
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menu.clear()
                menuInflater.inflate(R.menu.menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return when (menuItem.itemId) {
                    R.id.action_first_fragment -> {
                        findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
                        true
                    }

                    R.id.action_second_fragment -> {
                        findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
                        true
                    }

                    else -> false
                }
            }
        })
    }
}
