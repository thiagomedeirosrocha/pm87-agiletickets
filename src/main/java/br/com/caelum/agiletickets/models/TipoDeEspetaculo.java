package br.com.caelum.agiletickets.models;

public enum TipoDeEspetaculo {
	
	CINEMA(0.05, 0.1 ), 
	SHOW(0.05, 0.1 ), 
	TEATRO(0, 0 ), 
	BALLET(0.5, 0.2 ), 
	ORQUESTRA(0.5, 0.2 );
	
	double margemOcupacao;
	double percentualAcrescimo;

	TipoDeEspetaculo(double margemOcupacao, double percentualAcrescimo) {
		this.margemOcupacao = margemOcupacao;
		this.percentualAcrescimo = percentualAcrescimo;

	}
	
}
