package esercizio1;

public class Esercizio1 {
    public static void main(String[] args){

        String stringa1 = "tokyo";
        String stringa2 = "kayak";
        System.out.println("La stringa \"" + stringa1 + "\" ha un numero pari di caratteri? " + stringaPariDispari(stringa1));
        System.out.println("La stringa \"" + stringa2 + "\" ha un numero pari di caratteri? " + stringaPariDispari(stringa2));

        int anno1 = 2020;
        int anno2 = 2021;
        System.out.println("L'anno " + anno1 + " è bisestile " +annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile " +annoBisestile(anno2));

    }

    public static boolean stringaPariDispari(String str){
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile (int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}
