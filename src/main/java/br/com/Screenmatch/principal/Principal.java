package br.com.Screenmatch.principal;

import br.com.Screenmatch.models.DadosEpisodio;
import br.com.Screenmatch.models.DadosSerie;
import br.com.Screenmatch.models.DadosTemporada;
import br.com.Screenmatch.models.Episodio;
import br.com.Screenmatch.service.ConsumoAPI;
import br.com.Screenmatch.service.ConverteDados;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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


        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        System.out.println("\nTop 5 epsódios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);

            List<Episodio> episodios = temporadas.stream()
                    .flatMap(t -> t.episodios().stream()
                            .map(d -> new Episodio(t.numero(), d))
                    ).collect(Collectors.toList());

            episodios.forEach(System.out::println);
    }
}
