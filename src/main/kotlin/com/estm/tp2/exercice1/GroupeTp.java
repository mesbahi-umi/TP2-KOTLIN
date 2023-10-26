package com.estm.tp2.exercice1;

import java.util.List;

public class GroupeTp {
    private String nom;
    private Integer effectif;
    private Integer effectifMax;
    private List<Etudiant> etudiants;
    private Etudiant responsable;
    public GroupeTp(String nom,Integer effectifMax){
        this.nom = nom;
        this.effectifMax = effectifMax;
    }
    private Boolean existeEtudian(Integer code){
        for(Etudiant etudiant : etudiants){
            if(etudiant.getCode() == code){
                return true;
            }
        }
        return false;
    }
    private Etudiant getEtudiantByCode(Integer code){
        for(Etudiant etudiant : etudiants){
            if(etudiant.getCode() == code){
                return etudiant;
            }
        }
        return null;
    }

    public void ajouterEtudiant(Etudiant etudiant){
        if(!existeEtudian(etudiant.getCode())){
            etudiants.add(etudiant);
        }
    }

    public void supprimerEtudiant(Integer code){
        if(existeEtudian(code)){
            etudiants.remove(getEtudiantByCode(code));
        }
    }
    public void attributeResponsable(Integer code){
        if(existeEtudian(code)){
            responsable = getEtudiantByCode(code);
        }
    }
    @Override
    public String toString(){
        return "GroupeTp{" +
                "nom='" + nom + '\'' +
                ", effectif=" + effectif +
                ", effectifMax=" + effectifMax +
                ", etudiants=" + etudiants +
                ", responsable=" + responsable +
                '}';
    }
}
