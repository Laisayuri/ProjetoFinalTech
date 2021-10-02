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
    public class ClienteController : Controller
    {
        public async Task<IActionResult> AllClientes()
        {
            //Definir meu cliente HTTP
            HttpClient clienteHTTP = new HttpClient();

            //Ler os dados minha API e guardar em uma string
            string result = await clienteHTTP.GetStringAsync("http://localhost:8080/cliente");
            
            //Converter de JSON para uma lista do meu modelo/Objeto
            IEnumerable<Cliente> titular = JsonSerializer.Deserialize<IEnumerable<Cliente>>(result);

            //Retorno para minha View os resultados obtidos, a lista de titular.
            return View(titular);
        }

        
        
    }
}