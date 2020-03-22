import java.util.Objects;
import java.util.TreeMap;

/**
 * App
 */
public class App {

    // attributs
    private TreeMap <Niveau , Theme[]> list_themes;
    private Test_niveau[]   list_tests;
    private Admin[]     list_admins;
    private Question[]  test_categorisation;

    // méthodes 
    Apprenant inscription (String nom, String email, String mp)
    {   return null;    }
    Apprenant connexion (String nom, String mp)
    {   return null;    }
    
   
    

    // constructeurs
    public App() {}
    public App(TreeMap<Niveau,Theme[]> list_themes, Test_niveau[] list_tests, Admin[] list_admins, Question[] test_categorisation) {
        this.list_themes = list_themes;
        this.list_tests = list_tests;
        this.list_admins = list_admins;
        this.test_categorisation = test_categorisation;
    }
    
    // setteurs et getteurs
    public TreeMap<Niveau,Theme[]> getList_themes()         { return this.list_themes;      }
    public void setList_themes(TreeMap<Niveau,Theme[]> list_themes)     { this.list_themes = list_themes;    }
    public Test_niveau[] getList_tests()                    { return this.list_tests;       }
    public void setList_tests(Test_niveau[] list_tests)     { this.list_tests = list_tests; }
    public Admin[] getList_admins()                         { return this.list_admins;      }
    public void setList_admins(Admin[] list_admins)         { this.list_admins = list_admins;   }
    public Question[] getTest_categorisation()              { return this.test_categorisation;  }
    public void setTest_categorisation(Question[] test_categorisation)  { this.test_categorisation = test_categorisation;    }
    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof App)) {
            return false;
        }
        App app = (App) o;
        return Objects.equals(list_themes, app.list_themes) && Objects.equals(list_tests, app.list_tests) && Objects.equals(list_admins, app.list_admins) && Objects.equals(test_categorisation, app.test_categorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list_themes, list_tests, list_admins, test_categorisation);
    }

    @Override
    public String toString() {
        return "{" +
            " list_themes='" + getList_themes() + "'" +
            ", list_tests='" + getList_tests() + "'" +
            ", list_admins='" + getList_admins() + "'" +
            ", test_categorisation='" + getTest_categorisation() + "'" +
            "}";
    }

}