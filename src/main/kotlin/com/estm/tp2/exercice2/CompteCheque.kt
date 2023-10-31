package com.estm.tp2.exercice2

import com.estm.tp2.exercice2.Compte
import com.estm.tp2.exercice2.Operation

class CompteCheque(rib: String, solde: Double,private var soldeDebiteur:Double) : Compte(rib, solde) {
    fun payerFacture(montant: Double, commission: Double) {
        if (montant + commission <= solde) {
            solde = solde - montant - commission
        } else {
            soldeDebiteur = soldeDebiteur + (solde - commission - montant)
            solde = 0.0
        }
        addOperation(Operation("Paiement de facture", montant + commission))
    }

    fun historiqueOperation(): List<Operation> {
        return operations
    }

    override fun toString(): String {
        return "CompteCheque{" +
                "soldeDebiteur=" + soldeDebiteur +
                ", solde=" + solde +
                ", RIB='" + rib + '\'' +
                ", operations=" + operations +
                '}'
    }
}