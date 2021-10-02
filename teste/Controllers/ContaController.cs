using System;
using System.Collections;
using System.Collections.Generic;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
using teste.Models;
using Microsoft.AspNetCore.Mvc;

namespace teste.Controllers
{
    public class ContaController : Controller
    {
        public async Task<IActionResult> AllContas()
        {
            //Definir meu cliente HTTP
            HttpClient clienteHTTP = new HttpClient();

            //Ler os dados minha API e guardar em uma string
            string result = await clienteHTTP.GetStringAsync("http://localhost:8080/conta/contas");
            
            //Converter de JSON para uma lista do meu modelo/Objeto
            IEnumerable<Conta> dados = JsonSerializer.Deserialize<IEnumerable<Conta>>(result);

            //Retorno para minha View os resultados obtidos, a lista de dados.
            return View(dados);
        }

         //Fazer o get pelo ID Turma
        [HttpGet]
        public IActionResult GetContaPorID()
        {
            return View();
        }

        [HttpPost]
        public async Task<IActionResult> GetContaPorID(int numero)
        {
            HttpClient clienteHTTP = new HttpClient();

            //Guardar o resultado do JSON em uma string
            string resultado = await clienteHTTP.GetStringAsync($"http://localhost:8080/conta/{numero}");

            Conta conta = JsonSerializer.Deserialize<Conta>(resultado);

            return View(conta);
        }
        
        
    }
}