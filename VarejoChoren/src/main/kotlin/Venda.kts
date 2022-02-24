import java.time.LocalTime
import java.util.Date

class Venda {
    var id: Int
    var valor: Float
    var data: Date
    var horario: LocalTime
    var vendedor: Vendedor
    var cliente: Cliente
    var produto: Produto

    constructor(
        id: Int,
        valor: Float,
        data: Date,
        horario: LocalTime,
        vendedor: Vendedor,
        cliente: Cliente,
        produto: Produto
    ) {
        this.id = id
        this.valor = valor
        this.data = data
        this.horario = horario
        this.vendedor = vendedor
        this.cliente = cliente
        this.produto = produto
    }
}