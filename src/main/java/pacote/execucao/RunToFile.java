package pacote.execucao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import minha.serializacao.legal.Pessoa;

public class RunToFile {

	public static void main(String[] args) throws IOException {
		Pessoa objetoASerSerializado = new Pessoa(2, "Fulano", new Date());
		
		File arquivo = new File("arquivo-de-coisas.serializado");
		FileOutputStream fos = new FileOutputStream(arquivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(objetoASerSerializado);
		
		oos.close();
		fos.close();
		
		System.out.println(objetoASerSerializado);
	}

}
