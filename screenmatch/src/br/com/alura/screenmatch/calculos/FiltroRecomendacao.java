package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;


    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificavel() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if (classificavel.getClassificavel() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        }else {
            System.out.println("coloque na sua lista depois para assistir depois!");
        }
    }
}