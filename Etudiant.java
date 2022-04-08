
package dossier;
public class Etudiant {
    private String nom,prénom;
    private int age;
    private static int inscription;

    public Etudiant(String nom, String prénom, int age) {
        this.nom = nom;
        this.prénom = prénom;
        this.age = age;
        inscription++;
    }

    Etudiant() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInscription() {
        return inscription;
    }
    
}
