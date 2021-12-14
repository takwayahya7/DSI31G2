package com.iset.mealtray.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.iset.mealtray.R
import com.iset.mealtray.databinding.FragmentSideMenuBinding
import com.iset.mealtray.model.OrderViewModel

/**
 * [SideMenuFragment] allows people to add a side to the order or cancel the order.
 */
class SideMenuFragment : Fragment() {

    // Binding object instance corresponding to the fragment_start_order.xml layout
    // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
    // when the view hierarchy is attached to the fragment.
    private var _binding: FragmentSideMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // Use the 'by activityViewModels()' Kotlin property delegate from the fragment-ktx artifact
    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSideMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            // TODO (0.25): initialize the SideMenuFragment variables

        }
    }

    /**
     * Navigate to the accompaniments menu fragment
     */
    fun goToNextScreen() {
        // TODO (0.25): Navigate to the AccompanimentMenuFragment

        findNavController().navigate(R.id.action_sideMenuFragment_to_accompanimentMenuFragment)
    }

    /**
     * Cancel the order and start over.
     */
    fun cancelOrder() {
        // TODO (0.25): Reset order in view model
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_sideMenuFragment_to_accompanimentMenuFragment)
        // TODO (0.25): Navigate back to the [StartFragment] to start over
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_sideMenuFragment_to_startOrderFragment)
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
