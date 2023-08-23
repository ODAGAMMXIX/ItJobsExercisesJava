package br.com.osia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    // essa anotação é obrigatoria para funciomaneto do teste
    @Test
    public void uppperShouldReturnStringInUpperCase()
    {
        // criando a classe que tem a função que desejamos testar
        App app = new App();

        // pegando resultado
        String string = app.upper("foo");
        
        // fazendo asserções
        assertNotNull(string);
        assertEquals(string, "FOO");
    }
    @Test
    public void isEvenShouldReturnTrue(){
        App app = new App();
    
        Boolean number = app.isEven(0);

        assertTrue(number);
        
    }

    @Test
    public void isEvenShouldReturnFalse(){
        App app = new App();
    
        Boolean number = app.isEven(1);

        assertFalse(number);       
        
    }
}

//comando para gerar estrutura de pastas "mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-simple -DarchetypeVersion=1.4~"

