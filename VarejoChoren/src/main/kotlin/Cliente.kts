class Cliente {
    var id:Int
    var nome:String
    var cpf:String
    var telefonePessoal:Int
    var telefoneComercial:Int
    var email:String
    var venda: Venda
    var vendedor: Vendedor
    var produto:Produto

    constructor(
        id:Int,
        nome:String,
        cpf:String,
        telefonePessoal:Int,
        telefoneComercial:Int,
        email:String,
        venda:Venda,
        vendedor:Vendedor,
        produto:Produto
    ) {
        this.id = id
        this.nome = nome
        this.cpf = cpf
        this.telefonePessoal = telefonePessoal
        this.telefoneComercial = telefoneComercial
        this.email = email
        this.venda = venda
        this.vendedor = vendedor
        this.produto = produto
    }
}