public class App {
    public static void main(String[] args) throws Exception {
        
        String texto = " La Geoinformatica es una Carrera de 4.5 Anios";
        System.out.println(texto);

        //contara la cantidad de caracteres dentro de un texto
        int longitud = texto.length();
        System.out.println(longitud);

        //selecciona un caracter colocando a manera de numero la longitud establecida (empezando en 0)
        char text =  texto.charAt(13);
        System.out.println(text);

        //Extrae un texto delimitado por el usuario 
        String extrae = texto.substring(4, 18);
        System.out.println(extrae);

        //Debuelve un texto en minusculas
        String minus = texto.toLowerCase();
        System.out.println(minus);

        //Debuelve un texto en mayusculas
        String mayus = texto.toUpperCase();
        System.out.println(mayus);
    }
}
