public class Usuario {
    public String getSaludo(String nombre) {
        String n = (nombre == null) ? "" : nombre.trim();
        return n.isEmpty() ? "!HOLA¡ Desconosido" : "Hola, " + n;
    }
}