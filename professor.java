public class professor extends aluno {

    private int anoForm;

    public professor(String nome, String nasc, String apelido, int mtr, String curso, int anoForm) {
        super(nome, nasc, apelido, mtr, curso);
        this.anoForm = anoForm;
    }

    @Override
    public String saudacao() {
        return super.saudacao() + " e meu ano de formação foi em " + anoForm + "!";
    }

}
