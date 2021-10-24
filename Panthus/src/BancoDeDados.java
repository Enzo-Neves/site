import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BancoDeDados {
 
    public static void BD(String BD){



  /*   List<variaveis> list = new ArrayList<variaveis>(); */
    //cria um tey catch para poder ler o banco de dados utilizando o bufferredReader e o fileReader 
        try (BufferedReader br= new BufferedReader(new FileReader(BD))) {
            String line = br.readLine();//cria a variavel line que le a 1 linha que contem apenas variaveis
             while(line != null){ //cria um while para rodar todo o programa

                line = br.readLine();
    
    
            }
         }//excepion do catch e imprime uma mensagem de erro e o motivo dele
        catch(IOException e){
            System.out.println("Error:" + e.getMessage());
        }

    }   



    public static void escrever(String path, String texto) {
        try {
            // O parametro é que indica se deve sobrescrever ou continua no
            // arquivo.
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter conexao = new BufferedWriter(fw);
            conexao.write(texto);
            conexao.newLine();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    
    
}
