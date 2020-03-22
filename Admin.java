import java.util.Objects;

/**
 * Admin
 */
public class Admin {

    // attributs
    private String email;
    private String mp;

    // méthodes 
    void modifier_lecon (Lecon lecon)   {}  //un argument des attributs a modifier ??
    void ajouter_lecon  (Lecon lecon)   {}
    void rechercher_apprenant   (Apprenant apprenant)   {}
    void supprimer_apprenant    (Apprenant apprenant)   {}

    // constructeurs
    public Admin() {}
    public Admin(String email, String mp) {
        this.email = email;
        this.mp = mp;
    }
    
    // setteurs et getteurs
    public String getEmail()            { return this.email;    }
    public void setEmail(String email)  { this.email = email;   }
    public String getMp()               { return this.mp;       }
    public void setMp(String mp)        { this.mp = mp;         }
   
    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Admin)) {
            return false;
        }
        Admin admin = (Admin) o;
        return Objects.equals(email, admin.email) && Objects.equals(mp, admin.mp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, mp);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", mp='" + getMp() + "'" +
            "}";
    }

}