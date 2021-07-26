import dominio.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(1, "Marcello", "marcelo@gmail.com");
        Pessoa p2 = new Pessoa(2, "Gabriel", "gabriel@gmail.com");
        Pessoa p3 = new Pessoa(3, "Alice", "alice@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
