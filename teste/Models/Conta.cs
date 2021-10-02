using System;

namespace teste.Models{
// {
//     "numero": 4,
//     "agencia": 20,
//     "saldo": 100.0,
//     "tipoConta": 1,
//     "titular": {
//         "codigo": 1,
//         "nome": "Lais Yasunaka",
//         "cpf": "2222222",
//         "telefone": "2222222",
//         "email": "lais.yasunaka@itau-unibanco.com.br"
//     }
// }

    public class Conta
    {
        public long numero {get;set;}
        public int agencia {get;set;}
        public double saldo {get;set;}
        public int tipoConta {get;set;}
        public Cliente titular {get;set;}

        
    }

}