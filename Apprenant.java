import java.util.Objects;

/**
 * Apprenant
 */
public class Apprenant {

    // attributs
    private String nom;
    private String email;
    private String mp;  //mot de passe
    private Trace  trace;

    // méthodes 
    public void archiver_question (Question question)  {
        this.trace.getArchive_qstn()[this.trace.getArchive_qstn().length]=question;
    }   // esq on peut l'inclure dans repondre_question ???

    public void consulter_lecon   (Lecon lecon)        {
        lecon.toString();// elle sera changée pour le graphique
        this.trace.getArchive_lecons()[this.trace.getArchive_lecons().length] = lecon;
        this.trace.setTheme(lecon.getTheme());
    }
   
    public void consulter_question(Question question){
        question.afficher();
    }/*just pour le main en va parcourir le tableau des question et afficher question par question 
      donc en ne va pas l'utiliser dans le graphique*/
    
    public Reponse_niveau  passer_test_Niveau  (Test_niveau testN,String[] choix)    { 
        Reponse_question[] list_reponses= new Reponse_question[30];
        for (int i=0;i<=testN.getList_questions().length;i++)
        {
            list_reponses[i]=repondre_question(testN.getList_questions()[i], choix[i]);
        }
        Reponse_niveau rep = new Reponse_niveau(this,list_reponses,testN);
        return rep;   
    }/*dans le main en va recuperer les choix de l'apprenant en paramètre (par des scanneurs ou des checkboxs) */
   
    public Reponse_question   repondre_question   (Question question,String choix)    {  
        Reponse_question rep=new Reponse_question(this,choix,question);
        archiver_question(question);
        return rep;    
    }
    
    public void modifier_profile(){}
  
    // constructeurs
    public Apprenant() {}
    public Apprenant(String nom, String email, String mp, Trace trace, Question[] archive_qstn) {
        this.nom = nom;
        this.email = email;
        this.mp = mp;
        this.trace = trace;
      
    }

    // setteurs et getteurs
    public String getNom()              { return this.nom;          }
    public void setNom(String nom)      { this.nom = nom;           }
    public String getEmail()            { return this.email;        }
    public void setEmail(String email)  { this.email = email;       }
    public String getMp()               { return this.mp;           }
    public void setMp(String mp)        { this.mp = mp;             }
    public Trace getTrace()             { return this.trace;        }
    public void setTrace(Trace trace)   { this.trace = trace;       }
   

    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Apprenant)) {
            return false;
        }
        Apprenant apprenant = (Apprenant) o;
        return Objects.equals(nom, apprenant.nom) && Objects.equals(email, apprenant.email) && Objects.equals(mp, apprenant.mp) && Objects.equals(trace, apprenant.trace) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, email, mp, trace);
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", email='" + getEmail() + "'" +
            ", mp='" + getMp() + "'" +
            ", trace='" + getTrace() + "'" +
            "}";
    }

}