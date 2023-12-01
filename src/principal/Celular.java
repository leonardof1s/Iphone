package principal;

import iphone.audio.ReprodutorMusical;
import iphone.internet.NavegadorDeInternet;
import iphone.telefone.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico,NavegadorDeInternet, ReprodutorMusical {

	@Override
	public void ligar() {
		System.out.println("Ligando ...");		
	}

	@Override
	public void atender() {
		System.out.println("Recebendo ligação");
		
	}

	@Override
	public void iniciaCorreioDeVoz() {
		System.out.println("Novo correio de voz");		
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Abrindo pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("abrindo nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	@Override
	public void tocar() {
	
		System.out.println("Reproduzindo audio");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausa");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Escolha uma musica ...");
		
	}
	

}
