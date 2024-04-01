class Pizza {
    private String nome;
    private float valor;
    private String[] ingredientes;

    Pizza(String nome, float valor, String... ingredientes){
        this.setNome(nome);
        this.setValor(valor);
        this.setIngredientes(ingredientes);
    }

    void verPizza(){
        System.out.println("| Nome: " + this.getNome());
        System.out.println("| Valor: " + this.getValor());
        System.out.print("| Ingredientes: ");
        for (String ingrediente : ingredientes) {
            System.out.print(ingrediente + ", ");
        }
        System.out.println();
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setValor(float valor){
        this.valor = valor;
    }

    void setIngredientes(String[] ingredientes){
        this.ingredientes = ingredientes;
    }

    String getNome(){
        return this.nome;
    }
    float getValor(){
        return this.valor;
    }

    String[] getIngredientes(){
        return this.ingredientes;
    }
}