import kotlin.math.sqrt

class Formula {

    fun acharForcaPeso(massa: Double, gravidade: Double): Double = massa * gravidade

    fun forcaCentripeda(massa: Double, velocidade: Double, raio: Double): Double = massa * (sqrt(velocidade) / raio)

    fun impuslso(
        intensidade: Double,
        tempoInicial: Double,
        tempoFinal: Double
    ): Double = intensidade * (tempoFinal - tempoInicial)

    fun calcularForcaElastica(deformacao: Double, constanteElastica: Double): Double = deformacao * constanteElastica

    fun calcularVelocidadeMedia(
        posicaoFinal: Double,
        posicaoInicial: Double,
        tempoInicial: Double,
        tempoFinal: Double
    ): Double = (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)

    fun calcularMovimentoUniforme(posicaoInicial: Double, velocidade: Double, tempoInicial: Double, tempoFinal: Double):
            Double = posicaoInicial + velocidade * (tempoFinal - tempoInicial)

    fun calcularMovimentoUniformementeVariavel(
        velocidadeInicial: Double,
        posicaoInicial: Double,
        aceleracao: Double,
        tempoInicial: Double,
        tempoFinal: Double
    ):
            Double =
        posicaoInicial + velocidadeInicial * (tempoFinal - tempoInicial) + (aceleracao * sqrt(tempoFinal - tempoInicial) / 2)
}