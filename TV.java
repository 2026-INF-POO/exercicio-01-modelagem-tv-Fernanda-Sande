public class Televisao {
    public double polegadas;
    public int volume = 5; 
    public String marca;
    public int voltagem;
    public int canal;

    public void ligar() {
        double consumo = voltagem * polegadas;
        System.out.println("TV Ligada. Consumo atual: " + consumo + "W");
    }

    public void desligar() {
        System.out.println("TV Desligada.");
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (volume > 1) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void subirCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void descerCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }
}
