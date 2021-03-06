package br.ufes.sgi.memento;

import br.ufes.sgi.model.ImagemMemento;
import java.util.Stack;

public class ZeladorImagem {

    private final Stack<ImagemMemento> elementos;
    private static ZeladorImagem instancia;

    private ZeladorImagem() {
        this.elementos = new Stack<>();
    }

    public static ZeladorImagem getInstancia() {
        if (instancia == null) {
            instancia = new ZeladorImagem();
        }
        return instancia;
    }

    public void add(ImagemMemento todo) throws Exception {
        this.elementos.push(todo);

    }

    public ImagemMemento getUltimo() throws Exception {
        if (!elementos.isEmpty()) {
            return elementos.pop();
        }
        throw new Exception("Não há estados salvos");
    }

}
