package Aula7_Tarefa;

public class Tarefa {

    private int id;
    private String descricao;
    private Membro membroResponsavel;
    private String status;

    public Tarefa(int id, String descricao, String status, Membro membroResponsavel) {
        this.id = id;
        this.descricao = descricao;
        this.membroResponsavel = membroResponsavel;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Tarefa(int id, String descricao, String status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Membro getMembroResponsavel() {
        return membroResponsavel;
    }

    public void setMembroResponsavel(Membro membroResponsavel) {
        this.membroResponsavel = membroResponsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String print() {
        String str = "\nID Tarefa: " + this.id
                + "\nDescrição: " + this.descricao
                + "\nStatus: " + this.status;

        if (membroResponsavel != null) {
            str += "\nMembro responsável: " + membroResponsavel.getNome()
                    + " (" + membroResponsavel.getCargo() + ")";
        } else {
            str += "\nMembro responsável: [Nenhum atribuído]";
        }

        return str;
    }
}
