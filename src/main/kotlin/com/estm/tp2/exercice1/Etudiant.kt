package com.estm.tp2.exercice1

import java.util.*

class Etudiant {
    private val numero = 1000
    private val code: Int? = null
    private var nom: String
    private var prenom: String
    private var dateNaissance: Date
    private var bourse: Boolean? = null
    var email: String? = null

    constructor(nom: String, prenom: String, dateN: Date) {
        this.nom = nom
        this.prenom = prenom
        dateNaissance = dateN
    }

    constructor(nom: String, prenom: String, dateN: Date, email: String?) {
        this.nom = nom
        this.prenom = prenom
        dateNaissance = dateN
        this.email = email
    }


    private fun genererEmail(): String {
        return nom + "." + prenom + "@edu.umi.ac.ma"
    }

    private fun etatBourse(): String {
        return if (bourse!!) {
            "Boursier"
        } else "Non Boursier"
    }

    fun attribuerBourse() {
        bourse = true
    }

    override fun toString(): String {
        return "Etudiant : " + nom + " " + prenom + " " + dateNaissance + " " + etatBourse() + " " + genererEmail()
    }
    fun getNom(): String {
        return nom
    }
    fun getCode(): Int? {
        return code
    }


}