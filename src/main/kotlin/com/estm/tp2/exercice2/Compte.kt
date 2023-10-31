package com.estm.tp2.exercice2

import java.util.*

open class Compte(protected var rib: String, protected var solde: Double = 0.0) {
    protected var operations: MutableList<Operation>
    init {
        operations = LinkedList()
    }

    fun retrait(montant: Double) {
        if (montant > 0 && montant <= solde) {
            solde -= montant
        } else {
            println("Montant invalide")
        }
    }

    fun depot(montant: Double) {
        if (montant > 0) {
            solde += montant
        } else {
            println("Montant invalide")
        }
    }

    fun addOperation(operation: Operation) {
        operations.add(operation)
    }

    fun getOperations(): List<Operation> {
        return operations
    }

    override fun toString(): String {
        return "Compte{" +
                "solde=" + solde +
                ", RIB='" + rib + '\'' +
                ", operations=" + operations +
                '}'
    }
}