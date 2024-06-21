package LanguageFamilies;

public class SinoTibetan extends Language {

    public SinoTibetan (String languageName, int speakers){  
            // super must be the first call in the subclass. this is to properly ensure that the instance has been created without any error before the subclass does its own specific logic
            super(languageName, speakers, "Asia", "subject-object-verb"); 
            
            // The instance of Language was set above, now it reads this object and alters it if needed. 
            if(languageName.contains("Chinese")) { 
                this.wordOrder = "subject-verb-object"; 
            }

        }
}

