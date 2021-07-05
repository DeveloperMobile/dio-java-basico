package enums;

/* É basicamente um dicionário de dados imutável.
 * Não é permitido criar novas instâncias.
 * O construtor é sempre declarado como private.
 * por convenção, por serem objetos constantes e imutáveis (static, final),
 * os nomes são em MAIÚSCULOS. */

public enum Status {
    OPEN(13, "Aberto"),
    CLOSE(02, "Fechado");

    private int code;
    private String texto;

    Status(int code, String texto) {
        this.code = code;
        this.texto = texto;
    }

    public int getCode() {
        return code;
    }

    public String getTexto() {
        return texto;
    }
}
