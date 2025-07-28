package ExamChecker;

public class VerificadorExamen {
    public static void main(String[] args) {
        // Simulación de respuestas del examen
        String[] respuestasCorrectas = {"A", "B", "C", "D", "A"};
        String[] respuestasEstudiante = {"B", "B", "C", "D", "B"};

        int puntaje = verificarExamen(respuestasCorrectas, respuestasEstudiante);
        System.out.println("Puntaje del examen: " + puntaje + "/" + respuestasCorrectas.length);
    }

    public static int verificarExamen(String[] correctas, String[] estudiante) {
        int respuestasCorrectas = 0;
        for (int i = 0; i < correctas.length; i++) {
            if (correctas[i].equals(estudiante[i])) {
                // Si la respuesta es correcta, se incrementa el contador
                respuestasCorrectas++;
            }
        }
        return respuestasCorrectas;
    }
}

