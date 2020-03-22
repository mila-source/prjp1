import java.util.Objects;

/**
 * Repose_niveau
 */
public class Reponse_niveau {

    // attributs
    private Apprenant           apprenant;
    private Reponse_question[]  list_reponses;
    private boolean             decision;
    private float               note;
    private Lecon[]             list_non_asm;   // liste des lecons no assimilées
    private Test_niveau         test_niveau;
    // méthodes 
    void evaluer()  {
        int j=0;
        for(int i=0;i<=this.list_reponses.length;i++)
        {
            list_reponses[i].evaluer();
            if(list_reponses[i].getDecision()==true)
            {
               this.note+=list_reponses[i].getNote();
            }
            else
            {
                list_non_asm[j]=list_reponses[i].getQuestion().getLecon();
                j++;
            }
        }
        if (this.note>=10){this.decision=true;}
    }//dans le main if(repniv.getdecision==true){passage vers l'autre niveau} else{repniv.getlist_non_asm[].afficher}

    // constructeurs
    public Reponse_niveau() {}
    public Reponse_niveau(Apprenant apprenant, Reponse_question[] list_reponses, boolean decision, int note, Lecon[] list_non_asm,Test_niveau test_niveau) {
        this.apprenant = apprenant;
        this.list_reponses = list_reponses;
        this.decision = decision;
        this.note = note;
        this.list_non_asm = list_non_asm;
        this.test_niveau=test_niveau;
    }
    public Reponse_niveau(Apprenant apprenant, Reponse_question[] list_reponses,Test_niveau test_niveau) {
        this.apprenant = apprenant;
        this.list_reponses = list_reponses;
        this.test_niveau=test_niveau;
    }

    // setteurs et getteurs
    public Apprenant getApprenant()                 { return this.apprenant;        }
    public void setApprenant(Apprenant apprenant)   { this.apprenant = apprenant;   }
    public Reponse_question[] getList_reponses()    { return this.list_reponses;    }
    public void setList_reponses(Reponse_question[] list_reponses) { this.list_reponses = list_reponses; }
    public boolean isDecision()         { return this.decision; }
    public boolean getDecision()        { return this.decision; }
    public void setDecision(boolean decision) { this.decision = decision; }
    public float getNote()                { return this.note;     }
    public void setNote(int note)       { this.note = note;     }
    public Lecon[] getList_non_asm()    { return this.list_non_asm;       }
    public void setList_non_asm(Lecon[] list_non_asm) { this.list_non_asm = list_non_asm;}
    public Test_niveau getTest_niveau() {return test_niveau;  }
    public void setTest_niveau(Test_niveau test_niveau) {this.test_niveau = test_niveau;}
    //redéfinitions
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reponse_niveau)) {
            return false;
        }
        Reponse_niveau reponse_niveau = (Reponse_niveau) o;
        return Objects.equals(apprenant, reponse_niveau.apprenant) && Objects.equals(list_reponses, reponse_niveau.list_reponses) && decision == reponse_niveau.decision && note == reponse_niveau.note && Objects.equals(list_non_asm, reponse_niveau.list_non_asm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apprenant, list_reponses, decision, note, list_non_asm);
    }

    @Override
    public String toString() {
        return "{" +
            " apprenant='" + getApprenant() + "'" +
            ", list_reponses='" + getList_reponses() + "'" +
            ", decision='" + isDecision() + "'" +
            ", note='" + getNote() + "'" +
            ", list_non_asm='" + getList_non_asm() + "'" +
            "}";
    }
}