package Arvore;

import java.util.Objects;

public class NoArvoreBinaria<T> {

    private T info;
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;

    public NoArvoreBinaria(T info) {
        this.info = info;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esquerda, NoArvoreBinaria<T> direita) {
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public NoArvoreBinaria<T> pertence(T info) {
        NoArvoreBinaria<T> no = null;
        if (this.getInfo().equals(info)) {
            no = this;
        }
        if (Objects.nonNull(getEsquerda()) && Objects.isNull(no)) {
            no = this.getEsquerda().pertence(info);
        }
        if (Objects.nonNull(getDireita()) && Objects.isNull(no)) {
            no = this.getDireita().pertence(info);
        }
        return no;
    }

    /**
     *  To string sem parenteses
     */
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(this.info.toString());
        if (Objects.nonNull(this.getEsquerda())) {
            string.append(this.getEsquerda().toString());
        }
        if (Objects.nonNull(this.getDireita())) {
            string.append(this.getDireita().toString());
        }
        return string.toString();
    }

    /**
     * To string com parenteses
     */
    public String toStringComParenteses() {
        StringBuilder string = new StringBuilder("(");
        string.append(this.info.toString());
        if (Objects.nonNull(this.getEsquerda())) {
            string.append(this.getEsquerda().toString());
        }
        if (Objects.nonNull(this.getDireita())) {
            string.append(this.getDireita().toString());
        }
        return string.append(")").toString();
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }
}
