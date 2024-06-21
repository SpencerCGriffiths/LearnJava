package LanguageFamilies;

public class Language {
    protected String name; 
    protected int numSpeaker; 
    protected String regionsSpoken; 
    protected String wordOrder; 

    public Language (String name, int numSpeaker, String regionsSpoken, String wordOrder) { 
        this.name = name; 
        this.numSpeaker = numSpeaker; 
        this.regionsSpoken = regionsSpoken; 
        this.wordOrder = wordOrder; 
    }

    public void getInfo ( ) { 
       System.out.println(this.name + " is spoken by " + this.numSpeaker + " people mainly in " + this.regionsSpoken + ".");
       System.out.println("The language follows the word order: " + this.wordOrder + "."); 
    }

    public static void main (String[] args) { 
        Language myLang = new Language("Spencer", 100, "United Kingdom", "subject-verb-object"); 
        myLang.getInfo(); 
        Mayan myMayan = new Mayan("Kiche", 1222223090); 
        myMayan.getInfo(); 

    }
}
