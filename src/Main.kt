fun main() {

    //inicializando o objeto com as operações de CRUD
    val crud = ProdutoCRUD()

    //criando e adicionado os produtos
    val produto1 = Produto(1, "PS5", 3700.00)
    val produto2 = Produto(2, "Tv LG", 4500.00)
    val produto3 = Produto(3, "Macbook Pro M3", 11000.00)

    crud.adicionarProduto(produto1)
    crud.adicionarProduto(produto2)
    crud.adicionarProduto(produto3)

    //Listando todos os produtos
    println("\nLista de Produtos:")
    crud.listarProdutos()

    //Atualizando um produto
    crud.atualizarProduto(2, "Dragon Ball Sparking Zero - PS5", 550.00)

    println("\nLista de Produtos após Atualização:")
    crud.listarProdutos()

    //Removendo um produto
    crud.removerProduto(2)

    println("\nLista de Produtos após Remoção:")
    crud.listarProdutos()



}

