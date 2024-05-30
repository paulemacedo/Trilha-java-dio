package equipamento.multificional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
	}

	@Override
	public void Copiar() {
		System.out.println("Copiando via equipamento multifuncional");
		
	}

}
