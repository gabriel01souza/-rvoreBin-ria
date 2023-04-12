package Arvore;

import java.util.Objects;

public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
    }

    public boolean vazia() {
        return Objects.nonNull(raiz);
    }

    public NoArvoreBinaria<T> pertence(T info) {
        if (Objects.nonNull(raiz)) {
            return raiz.pertence(info);
        }
        return null;
    }

    public String toString() {
        return this.raiz.toString();
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
}
