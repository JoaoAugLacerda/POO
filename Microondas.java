public class Microondas {

    private int segundos;
    private int minutos;
    private boolean ligado;
    private boolean porta;
    private boolean pause;

    /**
     * Inicializa com temporizador zerado, desligado e com a porta fechada.
     */
    private void init() {
        this.minutos = this.segundos = 0;
        this.ligado = this.pause = this.porta = false;
    }

    /**
     * Construtor para inicializar.
     * 
     */
    public Microondas() {
        init();
    }

    /**
     * Metodo liga e desliga
     * @return False para desligado e True para ligado.
     */
    public boolean ligarDesligar() {
        if (porta) {
            return false;
        } else {
            if (ligado) {
                this.ligado = false;
                return ligado;
            } else {
                this.ligado = true;
                return ligado;
            }
        }
    }

    /**
     * Metodo para ver tempo atual.
     * @return Valores do temporizador.
     */
    public String verTemp() {
        return "Temporizador: " + minutos + " : " + segundos;
    }

    /**
     * Metodo para abrir e fechar
     * @return False para porta fechada, True para porta aberta.
     */
    public boolean abrirFechar() {

        if (ligado) {
            this.porta = false;
            return false;
        } else {
            if (porta) {
                porta = false;
                return porta;
            } else {
                porta = true;
                return porta;
            }

        }

    }

    /**
     * Verifica e atualiza tempo do temporizador.
     * @param seg Segundos para serem atualizados.
     * @param min Minutos para serem atualizados.
     * @return False não foi possivel atulizar, True tempo atualizado.
     */
    public boolean atualizarTemporalizador(int seg, int min) {
        if (ligado) {
            if (min < 0 || min > 59 || seg < 0 || seg > 59) {
                this.minutos = this.segundos = 0;
                return false;
            } else {
                this.minutos = min;
                this.segundos = seg;
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * Metodo para pausar.
     * @return True microondas pausado, False microondas despausado.
     */
    public boolean pausar() {
        if (ligado) {
            if (pause) {
                this.pause = false;
                return pause;
            } else {
                this.pause = true;
                return pause;
            }
        } else {
            return false;
        }
    }

}
