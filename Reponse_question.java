import java.util.Objects;

/**
 * Reponse_question
 */
public class Reponse_question {

    // attributs
    private Apprenant   apprenant;
    private String      choix;
    private boolean     decision;
    private float       note;
    private Question    question;
    
    // méthodes 
    void evaluer()  {
        if (this.choix.equals(this.question.getCorrige_type())){
            this.note=question.getNote();
            decision=true;
        }
        else
        {
            decision=false;
        }
    }
     //dans le main apres l'evaluation de chaque reponse_question if (rep.getDecision()==(false))
    //je suis pas sure  win nhotoha wla nnahiwha wla ndirha exception dakhl evaluer()??
    public void reponse_fausse_qstn(Question question,String choix){
        if(choix.equals("afficher reponse" ))
        {
          question.afficher_corrige_type();
        }
        else if(choix.equals("retour a la question"))
        {
          question.getLecon().afficher();
        }
    }

    // constructeurs
    public Reponse_question() {}
    public Reponse_question(Apprenant apprenant, String choix,Question question){
        this.apprenant = apprenant;
        this.choix = choix;
        this.question=question;
    }
    public Reponse_question(Apprenant apprenant, String choix, boolean decision, int note,Question question) {
        this.apprenant = apprenant;
        this.choix = choix;
        this.decision = decision;
        this.note = note;
        this.question=question;
    }
    
    // setteurs et getteurs
    public Apprenant getApprenant()                 { return this.apprenant;        }
    public void setApprenant(Apprenant apprenant)   { this.apprenant = apprenant;   }
    public String getChoix()                        { return this.choix;            }
    public void setChoix(String choix)              { this.choix = choix;           }
    public boolean isDecision()                     { return this.decision;         }
    public boolean getDecision()                    { return this.decision;         }
    public void setDecision(boolean decision)       { this.decision = decision;     }
    public float getNote()                            { return this.note;             }
    public void setNote(int note)                   { this.note = note;             }
    public Question getQuestion()                   {return question;               }
    public void setQuestion(Question question)      {this.question = question;      }
    
    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reponse_question)) {
            return false;
        }
        Reponse_question reponse_question = (Reponse_question) o;
        return Objects.equals(apprenant, reponse_question.apprenant) && Objects.equals(choix, reponse_question.choix) && decision == reponse_question.decision && note == reponse_question.note;
    }

    @Override
    public int hashCode() {
        return Objects.hash(apprenant, choix, decision, note);
    }

    @Override
    public String toString() {
        return "{" +
            " apprenant='" + getApprenant() + "'" +
            ", choix='" + getChoix() + "'" +
            ", decision='" + isDecision() + "'" +
            ", note='" + getNote() + "'" +
            "}";
    }
}