import java.util.Objects;

/**
 * Lecon
 */
public class Lecon {

    // attributs
    private String          nom;
    private Theme           theme;
    private String          contenu; // les images ??
    private Question[]      list_questions;

    // méthodes 
    public void afficher(){
        System.out.println( " nom='" + getNom() + "'" +
                            ", theme='" + getTheme() + "'" +
                            ", contenu='" + getContenu() + "'"
                          );
    }
    // constructeurs
    public Lecon() {}
    public Lecon(String nom, Theme theme, String contenu, Question[] list_questions) {
        this.nom = nom;
        this.theme = theme;
        this.contenu = contenu;
        this.list_questions = list_questions;
    }

    // setteurs et getteurs
    public String getNom()                  { return this.nom;         }
    public void setNom(String nom)          { this.nom = nom;          }
    public Theme getTheme()                 { return this.theme;       }
    public void setTheme(Theme theme)       { this.theme = theme;      }
    public String getContenu()              { return this.contenu;     }
    public void setContenu(String contenu)  { this.contenu = contenu;  }
    public Question[] getList_questions()   { return this.list_questions;   }
    public void setList_questions(Question[] list_questions) { this.list_questions = list_questions; }
    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Lecon)) {
            return false;
        }
        Lecon lecon = (Lecon) o;
        return Objects.equals(nom, lecon.nom) && Objects.equals(theme, lecon.theme) && Objects.equals(contenu, lecon.contenu) && Objects.equals(list_questions, lecon.list_questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, theme, contenu, list_questions);
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", theme='" + getTheme() + "'" +
            ", contenu='" + getContenu() + "'" +
            ", list_questions='" + getList_questions() + "'" +
            "}";
    }
}