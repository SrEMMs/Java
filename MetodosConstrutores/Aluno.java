class Aluno {
    private int id;
    private String nome;
    private String sobrenome;
    
    public Aluno(){
        this.id = 0;
    }

    public Aluno(int id){
        this.id = id;
    }

    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Aluno(String sobrenome, int id){
        this.id = id;
        this.sobrenome = sobrenome; 
    }

    public Aluno(int id, String nome, String sobrenome){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        System.out.println(aluno1.id); //Out: 1
        
        Aluno aluno2 = new Aluno(2);
        System.out.println(aluno2.id); //Out: 2

        Aluno aluno3 = new Aluno(3, "Erick", "Melo");
        
    }

}