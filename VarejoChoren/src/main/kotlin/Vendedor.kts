class Vendedor {
    var id: Int
    var nome: String
    var rg: String
    var cpf: String
    var cnh: String
    var telefone: Int
    var email: String
    var salarioHora: Float
    var cargaHoraria: Short
    var salarioFinal: Float
    var venda: Venda
    var cliente: Cliente
    var produto: Produto

    constructor(
        id: Int,
        nome: String,
        rg: String,
        cpf: String,
        cnh: String,
        telefone: Int,
        email: String,
        salarioHora: Float,
        cargaHoraria: Short,
        salarioFinal: Float,
        venda: Venda,
        cliente: Cliente,
        produto: Produto
    ) {
        this.id = id
        this.nome = nome
        this.rg = rg
        this.cpf = cpf
        this.cnh = cnh
        this.telefone = telefone
        this.email = email
        this.salarioHora = salarioHora
        this.cargaHoraria = cargaHoraria
        this.salarioFinal = salarioFinal
        this.venda = venda
        this.cliente = cliente
        this.produto = produto
    }
}