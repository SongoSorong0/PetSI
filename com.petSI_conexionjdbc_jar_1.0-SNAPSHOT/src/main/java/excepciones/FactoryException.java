package excepciones;

import enums.FactoryExceptionEnum;

public class FactoryException extends Exception{
    private FactoryExceptionEnum tipo;

    public FactoryException(FactoryExceptionEnum tipo) {
        super(tipo.getMensaje());
        this.tipo = tipo;
    }

    public FactoryException(FactoryExceptionEnum tipo, Throwable thrwbl) {
        super(tipo.getMensaje(), thrwbl);
        this.tipo = tipo;
    }

    public FactoryExceptionEnum getTipo() {
        return tipo;
    }
  
}
