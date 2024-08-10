public class MinhaClasse {

    public static void main(String[] args) {

       String primeiroNome = "Francisco";
       String segundoNOme = "Ferreira de Araújo";
       String nomeCompleto = nomeCompleto(primeiroNome, segundoNOme);
       System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return " O nome de registro é  " + primeiroNome + (" ") + segundoNome + ("."); 
    }
    
}
