
public class teste {
    public static void main(String[] args) {
        Pessoa tio = new Pessoa("Paulo", "2007", "paulinho");
        System.out.println(tio.saudacao());

        aluno al = new aluno("Pedro", "1956", "pedrinho", 54684, "Informática");
        System.out.println(al.saudacao());

        professor prof = new professor("Matheus", "1940", "Teus", 20656, "História", 2012);
        System.out.println(prof.saudacao());

        funcionario fun = new funcionario("Roberto", "1980", "bertinho", "Desenvolvedor Web", 5000);
        System.out.println(fun.saudacao());
    }
}