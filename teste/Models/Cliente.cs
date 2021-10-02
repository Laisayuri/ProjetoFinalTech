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

    public class Cliente
    {
        public long codigo {get;set;}
        public string nome {get;set;}
        public string cpf {get;set;}
        public string telefone {get;set;}
        public string email {get;set;}
        
    }

}