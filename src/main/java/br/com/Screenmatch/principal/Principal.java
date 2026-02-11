package br.com.Screenmatch.principal;

import br.com.Screenmatch.models.DadosSerie;
import br.com.Screenmatch.models.DadosTemporada;
import br.com.Screenmatch.service.ConsumoAPI;
import br.com.Screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String APIKEY = "&apikey=e815e24";

    public void exibeMenu(){
        System.out.println("Digite o nome da serie para busca");
        var nomesSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomesSerie.replace(" ", "+") + APIKEY);
        DadosSerie dados = conversor.obterDados(json , DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i =1; i<=dados.totalTemporada(); i++){
            json = consumo.obterDados(ENDERECO + nomesSerie.replace(" ", "+") + "&season=" + i + APIKEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);

        }
        temporadas.forEach(System.out::println);
    }
}
