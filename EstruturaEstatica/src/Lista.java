public class Lista<T> extends EstruturaEstatica<T> {
    //método Construtor com parâmetors o super proque está herdando...
    public Lista(int capacidade) {
        super(capacidade);
    }

    //método Construtor sem parâmetros
    public Lista() {
        super();
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
        return super.adiciona(posicao, elemento);
    }


}
