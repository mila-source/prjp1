import java.util.Objects;

/**
 * Trace
 */
public class Trace {

    // attributs
    private Niveau  niveau;
    private Theme   theme;
    private Lecon[] archive_lecons;         // contient les lecons consulter
    private Test_niveau[]   archive_tests;  // contient les tests passés
    private Question[] archive_qstn;    // contient les questions déjà posées
                                // esq on peut le mettre dans la trace ???
    // méthodes 

    // constructeurs
    public Trace() {}
    public Trace(Niveau niveau, Theme theme, Lecon[] archive_lecons, Test_niveau[] archive_tests,Question[] archive_qstn) {
        this.niveau = niveau;
        this.theme = theme;
        this.archive_lecons = archive_lecons;
        this.archive_tests = archive_tests;
        this.archive_qstn=archive_qstn;
    }
    
    // setteurs et getteurs
    public Niveau getNiveau()                   { return this.niveau;     }
    public void setNiveau(Niveau niveau)        { this.niveau = niveau;   }
    public Theme getTheme()                     { return this.theme;      }
    public void setTheme(Theme theme)           { this.theme = theme;     }
    public Lecon[] getArchive_lecons()          { return this.archive_lecons;    }    
    public void setArchive_lecons(Lecon[] archive_lecons)       { this.archive_lecons = archive_lecons;  }
    public Test_niveau[] getArchive_tests()     { return this.archive_tests;     }
    public void setArchive_tests(Test_niveau[] archive_tests)   { this.archive_tests = archive_tests;    }
    public Question[] getArchive_qstn() { return this.archive_qstn; }
    public void setArchive_qstn(Question[] archive_qstn) { this.archive_qstn = archive_qstn;   }


    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Trace)) {
            return false;
        }
        Trace trace = (Trace) o;
        return Objects.equals(niveau, trace.niveau) && Objects.equals(theme, trace.theme) && Objects.equals(archive_lecons, trace.archive_lecons) && Objects.equals(archive_tests, trace.archive_tests)&& Objects.equals(archive_qstn, trace.archive_qstn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(niveau, theme, archive_lecons, archive_tests,archive_qstn);
    }

    @Override
    public String toString() {
        return "{" +
            " niveau='" + getNiveau() + "'" +
            ", theme='" + getTheme() + "'" +
            ", archive_lecons='" + getArchive_lecons() + "'" +
            ", archive_tests='" + getArchive_tests() + "'" +
            ", archive_qstn='" + getArchive_qstn() + "'" +
            "}";
    }

}