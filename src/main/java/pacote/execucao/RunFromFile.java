package pacote.execucao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import minha.serializacao.legal.Pessoa;
import serializacao.aep.bacana.UmMegaObjetaoDanadoDeArratadoParaDeserializar;

public class RunFromFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File arquivo = new File("target-file.serial");
		FileInputStream fis = new FileInputStream(arquivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object objetoLido = ois.readObject();
		
		ois.close();
		fis.close();
		
		if (!(objetoLido instanceof UmMegaObjetaoDanadoDeArratadoParaDeserializar)) {
			throw new RuntimeException("Deu ruim!");
		}
		
		UmMegaObjetaoDanadoDeArratadoParaDeserializar objetoFinal = (UmMegaObjetaoDanadoDeArratadoParaDeserializar) objetoLido;
		System.out.println(objetoFinal);
	}
}
