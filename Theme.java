import java.util.Objects;

/**
 * Theme
 */
public class Theme {

    // attributs
    private String  nom;
    private Lecon[] list_Lecons;
    private Niveau niveau;
    // méthodes 

    // constructeurs
    public Theme() {}
    public Theme(String nom, Lecon[] list_Lecons, Niveau niveau) {
        this.nom = nom;
        this.list_Lecons = list_Lecons;
        this.niveau = niveau;
    }

    // setteurs et getteurs
    public String getNom()                  { return this.nom;        }
    public void setNom(String nom)          { this.nom = nom;         }
    public Lecon[] getList_Lecons()         { return this.list_Lecons;}
    public void setList_Lecons(Lecon[] list_Lecons) { this.list_Lecons = list_Lecons;   }
    public Niveau getNiveau()               { return this.niveau;     }
    public void setNiveau(Niveau niveau)    { this.niveau = niveau;   }

    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) o;
        return Objects.equals(nom, theme.nom) && Objects.equals(list_Lecons, theme.list_Lecons) && Objects.equals(niveau, theme.niveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, list_Lecons, niveau);
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", list_Lecons='" + getList_Lecons() + "'" +
            ", niveau='" + getNiveau() + "'" +
            "}";
    }

}