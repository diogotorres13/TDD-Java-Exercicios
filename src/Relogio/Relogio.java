package Relogio;

public class Relogio {
    private int hrs;
    private int min;
    private int seg;
    private boolean cronometroComecou;
    private int tempoCronometro;

    public void definirHorario(int hrs, int min, int seg) {
        this.hrs = hrs;
        this.min = min;
        this.seg = seg;
    }

    public void reiniciarMeiaNoite() {
        this.hrs = 0;
        this.min = 0;
        this.seg = 0;
    }

    public void iniciarCronometro() {
        this.cronometroComecou = true;
        this.tempoCronometro = 0;
    }

    public void atualizarRelogio(int hrs, int min, int seg) {
        if (this.cronometroComecou) {
            this.tempoCronometro += hrs * 3600 + min * 60 + seg;
        }
    }

    public String obterTempoCronometro() {
        int hrs = tempoCronometro / 3600;
        int min = (tempoCronometro % 3600) / 60;
        int seg = tempoCronometro % 60;
        return String.format("%02d:%02d:%02d", hrs, min, seg);
    }

    public String obterHorario() {
        return String.format("%02d:%02d:%02d", hrs, min, seg);
    }

    
}

