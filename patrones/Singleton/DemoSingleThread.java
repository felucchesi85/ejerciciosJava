package refactoring_guru.singleton.example.non_thread_safe;


public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("Si ves el mismo valor, entonces se reutilizó el singleton (¡bien!)" + "\n" +
            "Si ves valores diferentes, entonces se crearon 2 singletons (¡mal!)" + "\n\n" +
            "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}