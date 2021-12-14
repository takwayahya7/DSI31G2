package com.iset.mealtray.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.iset.mealtray.data.DataSource
import java.text.NumberFormat

class OrderViewModel : ViewModel() {

    // Map of menu items
    val menuItems = DataSource.menuItems

    // Default values for item prices
    private var previousEntreePrice = 0.0
    private var previousSidePrice = 0.0
    private var previousAccompanimentPrice = 0.0

    // Default tax rate
    private val taxRate = 0.08

    // Entree for the order
    private val _entree = MutableLiveData<MenuItem?>()
    val entree: LiveData<MenuItem?> = _entree

    // Side for the order
    private val _side = MutableLiveData<MenuItem?>()
    val side: LiveData<MenuItem?> = _side

    // Accompaniment for the order.
    private val _accompaniment = MutableLiveData<MenuItem?>()
    val accompaniment: LiveData<MenuItem?> = _accompaniment

    // Subtotal for the order
    private val _subtotal = MutableLiveData(0.0)
    val subtotal: LiveData<String> = Transformations.map(_subtotal) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    // Total cost of the order
    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = Transformations.map(_total) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    // Tax for the order
    private val _tax = MutableLiveData(0.0)
    val tax: LiveData<String> = Transformations.map(_tax) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    /**
     * Set the entree for the order.
     */
    fun setEntree(entree: String) {
        // TODO (0.25): if _entree.value is not null, set the previous entree price to the current
        //  entree price.

        // TODO (0.25): if _subtotal.value is not null subtract the previous entree price from the
        //  the current subtotal value. This ensures that we only charge for the currently
        //  selected entree.

        // TODO (0.25): set the current entree value to the menu item corresponding to the passed
        //  in string

        // TODO (0.25): update the subtotal to reflect the price of the selected entree.

    }

    /**
     * Set the side for the order.
     */
    fun setSide(side: String) {
        // TODO (0.25): if _side.value is not null, set the previous side price to the current
        //  side price.

        // TODO (0.25): if _subtotal.value is not null subtract the previous side price from the
        //  current subtotal value. This ensures that we only charge for the currently selected side.

        // TODO (0.25): set the current side value to the menu item corresponding to the passed
        //  in string

        // TODO (0.25): update the subtotal to reflect the price of the selected side.

    }

    /**
     * Set the accompaniment for the order.
     */
    fun setAccompaniment(accompaniment: String) {
        // TODO (0.25): if _accompaniment.value is not null, set the previous accompaniment price to
        //  the current accompaniment price.

        // TODO (0.25): if _accompaniment.value is not null subtract the previous accompaniment price
        //  from the current subtotal value. This ensures that we only charge for the currently
        //  selected accompaniment.

        // TODO (0.25): set the current accompaniment value to the menu item corresponding to the
        //  passed in string

        // TODO (0.25): update the subtotal to reflect the price of the selected accompaniment.

    }

    /**
     * Update subtotal value.
     */
    private fun updateSubtotal(itemPrice: Double) {
        // TODO (0.25): if _subtotal.value is not null, update it to reflect the price of the
        //  recently added item.
        //  Otherwise, set _subtotal.value to equal the price of the item.

        // TODO (0.25): calculate the tax and resulting total

    }

    /**
     * Calculate tax and update total.
     */
    fun calculateTaxAndTotal() {
        // TODO (0.25): set _tax.value based on the subtotal and the tax rate.

        // TODO (0.25): set the total based on the subtotal and _tax.value.

    }

    /**
     * Reset all values pertaining to the order.
     */
    fun resetOrder() {
        // TODO (0.25*6): Reset all values associated with an order

    }
}
