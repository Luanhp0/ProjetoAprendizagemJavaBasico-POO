public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: " + volume);
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirDeCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}
