package Estabelecimento;

import equipamento.impressora.Impressora;
import equipamento.multificional.EquipamentoMultifuncional;
import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Deskjet;
import equipamento.impressora.Laserjet;

public class Fabrica {

	public static void main(String[] args) {
		//Impressora impressora = new EquipamentoMultifuncional();
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
				
		Impressora impressora = em ;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		impressora. imprimir ( ) ;
		digitalizadora. digitalizar( ) ;
		copiadora.Copiar( ) ;
		
		
		impressora.imprimir();
	}
}
