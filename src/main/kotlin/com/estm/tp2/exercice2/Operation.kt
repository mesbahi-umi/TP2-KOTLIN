package com.estm.tp2.exercice2

import java.text.SimpleDateFormat
import java.util.*

class Operation internal constructor(var typeOperation: String, var montant: Double) {
    var numOperation: Int
    var dateOperation: Date
    val simpleDateFormat:SimpleDateFormat;
    init {
        dateOperation = Date()
        numOperation = nubOperation++;
        simpleDateFormat = SimpleDateFormat("dd/mm/yyyy hh:mm:ss")
    }

    override fun toString(): String {
        return "Operation{" +
                "numOperation=" + numOperation +
                ", montant=" + if(typeOperation.equals("retrait") ) " -" else " +" + montant +
                ", dateOperation=" +
                simpleDateFormat.format(dateOperation)+
                '}'
    }

    companion object {
        private var nubOperation: Int = 1000;
    }
}