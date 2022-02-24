import java.util.Date

class Produto {
    var id:Int
    var nome:String
    var precoCompra:Float
    var precoVenda:Float
    var peso:Float
    var validade:Date
    var fornecedor: Fornecedor
    var transportadora:Transportadora

    constructor(
        id:Int,
        nome:String,
        precoCompra:Float,
        precoVenda:Float,
        peso:Float,
        validade:Date,
        fornecedor: Fornecedor,
        transportadora: Transportadora
    ){
        this.id = id
        this.nome = nome
        this.precoCompra = precoCompra
        this.precoVenda = precoVenda
        this.peso = peso
        this.validade = validade
        this.fornecedor = fornecedor
        this.transportadora = transportadora
    }
}