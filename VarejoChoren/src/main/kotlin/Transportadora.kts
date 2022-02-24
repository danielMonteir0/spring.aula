class Transportadora {
    var id: Int
    var nome: String
    var cnpj: String
    var endereco: String
    var telefone: Int
    var email: String
    var produto: Produto

    constructor(
        id: Int,
        nome: String,
        cnpj: String,
        endereco: String,
        telefone: Int,
        email: String,
        produto: Produto
    ) {
        this.id = id
        this.nome = nome
        this.cnpj = cnpj
        this.endereco = endereco
        this.telefone = telefone
        this.email = email
        this.produto = produto
    }
}