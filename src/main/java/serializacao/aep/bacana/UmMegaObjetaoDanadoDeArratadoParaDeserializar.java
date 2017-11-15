package serializacao.aep.bacana;

import java.io.Serializable;

public class UmMegaObjetaoDanadoDeArratadoParaDeserializar implements Serializable {
    private static final long serialVersionUID = 234567888910L;

    public Short atributos;
    public Byte de;
    public String deserializados;
    public Integer para;
    public Boolean sequencia;
    public Long serem;

    @Override
    public String toString(){
        return "Objeto: "  + atributos + de + sequencia + para + serem + deserializados;
    }

}
