package lobo.cachorrada.clientes.teste

import lobo.cachorrada.clientes.Model.Cliente
import lobo.cachorrada.clientes.Service.RetrofitFactory

fun main() {

    val c1 = Cliente(
        nome = "Pelé",
        email = "pele@santosfc.com.br"
    )

    val retrofit = RetrofitFactory().getClienteService()
    val cliente = retrofit.gravar(c1)

}