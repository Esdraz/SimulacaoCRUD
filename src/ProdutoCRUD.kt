class ProdutoCRUD {

    private val produtos = mutableListOf<Produto>()

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
        println("Produto adicionado: $produto")
    }

    fun listarProdutos() {
        if (produtos.isEmpty()) {
            println("\nLista de Produtos:")
            println("Nenhum produto encontrado!")
        } else {
            produtos.forEach { produto ->
                println("ID: ${produto.id}, Nome: ${produto.nome}, Preço: ${produto.preco}")
            }
        }
    }

    private fun buscarProdutoPorId(id: Int): Produto? {
        return produtos.find { it.id == id } ?: run {
            println("Produto com ID $id não encontrado!")
            null
        }
    }

    fun atualizarProduto(id: Int, novoNome: String, novoPreco: Double) {
        val produto = buscarProdutoPorId(id)
        if (produto != null) {
            produto.nome = novoNome
            produto.preco = novoPreco
            println("Produto atualizado: $produto")
        }
    }

    fun removerProduto(id: Int) {
        val produto = buscarProdutoPorId(id)
        if (produto != null) {
            produtos.remove(produto)
            println("Produto removido: $produto")
        }
    }
}
