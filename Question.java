import java.util.Objects;

/**
 * Question
 */
public class Question {

    // attributs
    private String      enonce;  //énoncé
    private String[]    propositions;
    private Lecon       lecon;
    private String      corrige_type;
    private float         note;

    // méthodes 
    public void afficher(){
        System.out.println( " enonce='" + enonce + "'" +
                            ", propositions='" + propositions + "'" 
                          );
                          
    }
    public void afficher_corrige_type(){
        System.out.println(", corrige_type='" + getCorrige_type() + "'" );
    }
    // constructeurs
    public Question() {}
    public Question(String enonce, String[] propositions, Lecon lecon, String corrige_type) {
        this.enonce = enonce;
        this.propositions = propositions;
        this.lecon = lecon;
        this.corrige_type = corrige_type;
    }

    // setteurs et getteurs
    public String    getEnonce()                             { return this.enonce;       }
    public void      setEnonce(String enonce)                { this.enonce = enonce;     }
    public String[]  getPropositions()                       { return this.propositions; }
    public void      setPropositions(String[] propositions)  { this.propositions = propositions;  }
    public Lecon     getLecon()                              { return this.lecon;        }
    public void      setLecon(Lecon lecon)                   { this.lecon = lecon;       }
    public String    getCorrige_type()                       { return this.corrige_type; }
    public void      setCorrige_type(String corrige_type)    { this.corrige_type = corrige_type;  }
    public float     getNote()                               { return this.note;         }
    public void      setNote(int note)                       { this.note = note;         }

    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Question)) {
            return false;
        }
        Question question = (Question) o;
        return Objects.equals(enonce, question.enonce) && Objects.equals(propositions, question.propositions) && Objects.equals(lecon, question.lecon) && Objects.equals(corrige_type, question.corrige_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enonce, propositions, lecon, corrige_type);
    }

    @Override
    public String toString() {
        return "{" +
            " enonce='" + getEnonce() + "'" +
            ", propositions='" + getPropositions() + "'" +
            ", lecon='" + getLecon() + "'" +
            ", corrige_type='" + getCorrige_type() + "'" +
            "}";
    }

}