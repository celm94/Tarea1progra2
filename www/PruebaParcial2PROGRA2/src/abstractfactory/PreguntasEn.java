package abstractfactory;

public class PreguntasEn implements Preguntas{

    @Override
    public String preguntaHora() {
        return "what time is it?";
    }

    @Override
    public String preguntaTiempo() {
        return "How is the weather";
    }
}
