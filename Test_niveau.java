/**
 * Test_niveau
 */

// esq on peut iliminer cette classe


	
public class Test_niveau {
	
    // attributs
    private Niveau      niveau;
    private Question[]  list_qestions;
    // méthodes 

    // constructeurs
    public Test_niveau(Niveau niveau, Question[] list_qestions) {
        this.list_qestions=list_qestions;
        this.niveau=niveau;
	}
    // setteurs et getteurs
    public Niveau getNiveau()               { return this.niveau;     }
    public void setNiveau(Niveau niveau)    { this.niveau = niveau;   }
    public Question[] getList_questions()       { return this.list_qestions;    }    
    public void setList_questions(Question[] list_questions)       { this.list_qestions = list_questions;  }
    //redéfinitions
}