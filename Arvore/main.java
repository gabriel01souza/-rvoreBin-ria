package Arvore;

public class main {
    public static void main(String[] args) {


        NoArvoreBinaria<Integer> no6 =  new NoArvoreBinaria<>(8);

        NoArvoreBinaria<Integer> no4 =  new NoArvoreBinaria<>(3, no6, null);
        NoArvoreBinaria<Integer> no5 =  new NoArvoreBinaria<>(7);


        NoArvoreBinaria<Integer> no3 =  new NoArvoreBinaria<>(4, no4, no5);
        NoArvoreBinaria<Integer> no2 =  new NoArvoreBinaria<>(1);

        NoArvoreBinaria<Integer> no1 =  new NoArvoreBinaria<>(2, no2, no3);

        NoArvoreBinaria<Integer> no0 = new NoArvoreBinaria<>(0, no1, no2);

        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();
        arvoreBinaria.setRaiz(no0);
        String nos = arvoreBinaria.toString();

        System.out.println(nos);
        NoArvoreBinaria<Integer> no = arvoreBinaria.pertence(4);
        System.out.println(no);

    }
}
