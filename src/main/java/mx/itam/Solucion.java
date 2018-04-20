package mx.itam;
public class Solucion {
    public static boolean solucion(String initialString){
        String aux = "";
        for(int i=0;i<(initialString.length()/2)+1;i++){
            String subString = initialString.substring(0,i);
            aux = initialString.replaceAll(subString,"");
            if(aux.equals("")){
                return true;
            }
        }
        return false;
    }

    public static boolean gus(String str){
      String s = str+str;
      return s.substring(1,s.length()-1).contains(str);
    }
    public static void main(String[] args) {
        System.out.println("Ejemplo 1");
        System.out.println("Input: abab");
        System.out.println("output: "+solucion("abab"));
        System.out.println("===========================");
        System.out.println("Ejemplo 2");
        System.out.println("Input: aba");
        System.out.println("output: "+solucion("aba"));
        System.out.println("===========================");
        System.out.println("Ejemplo 3");
        System.out.println("Input: gustavogustavogustavo");
        System.out.println("output: "+solucion("gustavogustavogustavo"));
        System.out.println("===========================");

    }
}
