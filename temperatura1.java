import java.util.Random;

public class VisualizarTemperatura {

    public static void main(String[] args) {
        // Simulamos la obtención de temperatura
        double temperatura = obtenerTemperatura();
        
        // Mostramos la temperatura en consola
        System.out.printf("La temperatura actual es: %.2f°C%n", temperatura);
    }

    public static double obtenerTemperatura() {
        // Generamos una temperatura aleatoria entre -10 y 40 grados Celsius
        Random random = new Random();
        return -10 + (40 - (-10)) * random.nextDouble();
    }
}
