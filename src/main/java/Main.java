import java.nio.charset.StandardCharsets;

public class Main {
    /*
    * Lo que se busca hacer en esta ocasión es mostrar las diferencias entre formatos de charset, esta vez se comparan
    * UTF_8 con ISO_8859_1 y se puede observar que cuando se intenta crear a string los bytes en formato utf8 al iso
    * Los carácteres se corrompen y eso pasa porque en utf8 los caracteres especiales como ! y ñ ocupan 2 bytes mientras
    * Que en ISO ocupan 1
    * */
    static void main() {
        String s = "¡Viva España!";
        byte[] utf = s.getBytes(StandardCharsets.UTF_8);
        byte[] iso = s.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println(new String(utf, StandardCharsets.UTF_8));
        System.out.println(new String(iso, StandardCharsets.ISO_8859_1));
        System.out.println();
        System.out.println(new String(utf, StandardCharsets.ISO_8859_1));
        System.out.println(new String(iso, StandardCharsets.UTF_8));
    }

}
