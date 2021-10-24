import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        


        System.out.println("Escreva na linha"); 

        Scanner sc = new Scanner(System.in);
        String LinhaNova = sc.next();
        String BD = "Panthus\\panthus.csv";
        BancoDeDados.escrever(BD, LinhaNova );
 
        sc.close();
 
    }
}
