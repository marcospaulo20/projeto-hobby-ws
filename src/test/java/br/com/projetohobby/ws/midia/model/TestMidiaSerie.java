package br.com.projetohobby.ws.midia.model;

import java.util.ArrayList;
import java.util.List;

public class TestMidiaSerie {

	private static List<Serie> testSeries() {
		List<Serie> series = new ArrayList<>();
		
		// Serie Sherlock
		List<Ator> elencosSerieSherlock = new ArrayList<>();
		List<Roterista> roteristasSerieSherlock = new ArrayList<>();
		
		// elencos 
		Ator ator1 = new Ator(1L, "Benedict Cumberbatch");
		ator1.setPersonagem("Sherlock Holmes");
		Ator ator2 = new Ator(2L, "Martin Freeman");
		ator2.setPersonagem("John Watson");
		
		elencosSerieSherlock.add(ator1);
		elencosSerieSherlock.add(ator2);
		
		// roteristas
		Roterista criador1 = new Roterista(1L, "Mark Gatiss");
		Roterista criador2 = new Roterista(2L, "Steven Moffat");		
		
		roteristasSerieSherlock.add(criador1);
		roteristasSerieSherlock.add(criador2);
		
		List<Temporada> temporadas = new ArrayList<>();
		List<Episodio> episodios1T = new ArrayList<>();
		List<Episodio> episodios2T = new ArrayList<>();

		// diretores e roteristas dos episodios		
		Diretor diretor11T = new Diretor(1L, "Paul McGulgan");
		Diretor diretor21T = new Diretor(2L, "Euros Lyn");
		Diretor diretor31T = new Diretor(3L, "Toby Haynes");
		Roterista roterista11T = new Roterista(1L, "Steven Moffat");
		Roterista roterista21T = new Roterista(2L, "Stepthen Thompson");
		Roterista roterista31T = new Roterista(3L, "Mark Gatiss");
		
		// temporada 1
		Temporada temporada1 = new Temporada(1L);
		temporada1.setNome("1ª Temporada");
		temporada1.setNumero(1);
		temporada1.setAno(2010);
		
		// episodios
		Episodio episodio11T = new Episodio(1L);
		episodio11T.setNome("Um Estudo em Rosa");
		episodio11T.setNumero(1);
		episodio11T.setNomeOriginal("A Study In Pink");
		episodio11T.setDiretor(diretor11T);
		episodio11T.setRoterista(roterista11T);
		episodio11T.setJaAssitir(true);
		episodio11T.setTenhoNaColecao(true);
		episodio11T.setResumo("Sherlock Holmes é apresentado ao ex-médico do exército, Dr. John Watson, a quem convence a ajudá-lo a resolver misteriosos de assassinatos. O seu primeiro trabalho juntos é um que parece, para a polícia, como casos ligados de de suicídios. ");
		episodios1T.add(episodio11T);
		
		Episodio episodio21T = new Episodio(2L);
		episodio21T.setNome("O Banqueiro Cego");
		episodio21T.setNumero(2);
		episodio21T.setNomeOriginal("The Blind Banker");
		episodio21T.setDiretor(diretor21T);
		episodio21T.setRoterista(roterista21T);
		episodio21T.setJaAssitir(true);
		episodio21T.setTenhoNaColecao(true);
		episodio21T.setResumo("Sherlock e Watson trabalham para decifrar os símbolos mortais que estão cobrindo as paredes por toda Londres, matando a todos que os veem dentro de poucas horas, antes que mais um sucumba diante do misterioso Black Lotus. ");
		episodios1T.add(episodio21T);
		
		Episodio episodio31T = new Episodio(3L);
		episodio31T.setNome("O Grande Jogo");
		episodio31T.setNumero(3);
		episodio31T.setNomeOriginal("The Great Game");
		episodio31T.setDiretor(diretor11T);
		episodio31T.setRoterista(roterista31T);
		episodio31T.setJaAssitir(true);
		episodio31T.setTenhoNaColecao(true);
		episodio31T.setResumo("Sherlock investiga a morte de um jovem funcionário público, e logo acaba em uma batalha de inteligência com desafios cada vez maiores para o detetive. ");
		episodios1T.add(episodio31T);
		
		temporada1.setEpisodios(episodios1T);
		
		temporadas.add(temporada1);
		
		// temporada 2
		Temporada temporada2 = new Temporada(2L);
		temporada2.setNome("2ª Temporada");
		temporada2.setNumero(2);
		temporada2.setAno(2012);
		
		// episodios
		Episodio episodio12T = new Episodio(4L);
		episodio12T.setNome("Um Escândalo em Belgravia");
		episodio12T.setNumero(1);
		episodio12T.setNomeOriginal("A Scandal In Belgravia");
		episodio12T.setDiretor(diretor11T);
		episodio12T.setRoterista(roterista11T);
		episodio12T.setJaAssitir(false);
		episodio12T.setTenhoNaColecao(true);
		episodio12T.setResumo("A monarquia é ameaçada pelo surgimento de algumas fotografias comprometedoras. Sherlock é logo colocado no caso e descobre ligações entre o terrorismo internacional e a corrupção no governo britânico. Para evitar um escândalo real ele deve encontrar Irene Adler, uma mulher tão inteligente quanto ele. ");
		episodios2T.add(episodio12T);
		
		Episodio episodio22T = new Episodio(5L);
		episodio22T.setNome("Os Cães de Baskerville");
		episodio22T.setNumero(2);
		episodio22T.setNomeOriginal("The Hounds of Baskerville");
		episodio22T.setDiretor(diretor21T);
		episodio22T.setRoterista(roterista31T);
		episodio22T.setJaAssitir(false);
		episodio22T.setTenhoNaColecao(true);
		episodio22T.setResumo("Henry Knight afirma que seu pai foi morto por uma criatura monstruosa em Dartmoor, e pede a Sherlock para ajudá-lo. Quando ele e John Watson chegam para investigar, eles descobrem que uma base militar ultra-secreta pode estar ligado à morte. ");
		episodios2T.add(episodio22T);
		
		Episodio episodio32T = new Episodio(6L);
		episodio32T.setNome("A Queda Reichenbach");
		episodio32T.setNumero(3);
		episodio32T.setNomeOriginal("The Reichenbach Fall");
		episodio32T.setDiretor(diretor31T);
		episodio32T.setRoterista(roterista21T);
		episodio32T.setJaAssitir(false);
		episodio32T.setTenhoNaColecao(true);
		episodio32T.setResumo("Moriarty dá início ao que pode ser o crime do século: invadir a Torre de Londres, o Banco da Inglaterra e a Prisão de Pentonville. Sherlock precisa encontrar seu maior inimigo e detê-lo , já que sua reputação e até a sua vida, estão sob ameaça.  ");
		episodios2T.add(episodio32T);
		
		temporada2.setEpisodios(episodios2T);
		
		temporadas.add(temporada2);
		
		// serie
		Serie sherlock = new Serie(1L, "Sherlock");
		sherlock.setAno(2010);
		sherlock.setNomeOriginal("Sherlock");
		sherlock.setDuracao(85);
		sherlock.setClassificacao("16");
		sherlock.setGenero("Drama policial");
		sherlock.getElencos().addAll(elencosSerieSherlock);
		sherlock.getRoteristas().addAll(roteristasSerieSherlock);
		
		sherlock.setTemporada(temporadas);
		
		// setado o filme nos elencos, diretores e roteristas
		ator1.setSerie(sherlock);
		ator2.setSerie(sherlock);
		
		roterista11T.setSerie(sherlock);
		roterista21T.setSerie(sherlock);
		
		diretor11T.setSerie(sherlock);
		diretor21T.setSerie(sherlock);
		
		series.add(sherlock);
		
		return series;
	}
	
	public static void main(String[] args) {
		for (Serie serie : testSeries()) {
			System.out.println(serie);
			System.out.println("Descrição da serie");
			
			System.out.println("-------------------------");
			
			System.out.println("Nome Original: " + serie.getNomeOriginal());
			System.out.println("Duração: " + serie.getDuracao());
			System.out.println("Classificação: " + serie.getClassificacao());
			System.out.println("Genêro: " + serie.getGenero());
			
			System.out.print("Elencos: ");
			for (Ator ator : serie.getElencos())
				System.out.print(ator.getPessoa().getNome() + " (" + ator.getPersonagem() + ")" + 
							(serie.getElencos().size() > 1 ? ", " : ""));
			
			System.out.println("");
			
			System.out.print("Roteristas: ");
			for (Roterista roterista : serie.getRoteristas())
				System.out.print(roterista.getPessoa().getNome() + (serie.getRoteristas().size() > 1 ? " ," : ""));
			
			System.out.println("");
			
			System.out.println("Total de Temporadas: " + serie.getQtTemporadas());
			System.out.println("Total de Episodios: " + serie.getQtEpisodios());
			System.out.println("");
			for (Temporada temporada : serie.getTemporadas()) {
				System.out.println(temporada);
				System.out.println("");
				for (Episodio episodio : temporada.getEpisodios()) {
					System.out.println("Nª: " + episodio.getNumero());
					System.out.println("Título: " + episodio.getNome());
					System.out.println("Dirigido por: " + episodio.getDiretor().getPessoa().getNome());
					System.out.println("Escrito por: " + episodio.getRoterista().getPessoa().getNome());
					System.out.println("Já assistir? " + (episodio.isJaAssitir() ? "S" : "N"));
					System.out.println("Tenho na minha coleção? " + (episodio.isTenhoNaColecao() ? "S" : "N"));					
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.print("Resumo: ");					
					System.out.println(episodio.getResumo());
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("");
				}
			}
		}
	}
}
