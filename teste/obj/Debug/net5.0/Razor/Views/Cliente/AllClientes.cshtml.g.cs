#pragma checksum "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "8f12707561fd6f290966c46330034caa99d23f6a"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Cliente_AllClientes), @"mvc.1.0.view", @"/Views/Cliente/AllClientes.cshtml")]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#nullable restore
#line 1 "C:\Users\Cabri\Desktop\teste\Views\_ViewImports.cshtml"
using teste;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\Cabri\Desktop\teste\Views\_ViewImports.cshtml"
using teste.Models;

#line default
#line hidden
#nullable disable
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"8f12707561fd6f290966c46330034caa99d23f6a", @"/Views/Cliente/AllClientes.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"f51e606e5be26e1ae3d8e7b3266d6d51b7c19410", @"/Views/_ViewImports.cshtml")]
    public class Views_Cliente_AllClientes : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<List<Cliente>>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            WriteLiteral(@"
<h1>Lista de Todos os clientes</h1>
<hr>
<table class=""table table-striped table-hover"">
    <thead>
        <th scope=""col"">Código</th>
        <th scope=""col"">Nome</th>
        <th scope=""col"">CPF</th>
        <th scope=""col"">TELEFONE</th>
        <th scope=""col"">EMAIL</th>
    </thead>
    <tbody>
");
#nullable restore
#line 14 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
         foreach (Cliente titulares in Model)
        {

#line default
#line hidden
#nullable disable
            WriteLiteral("            <tr>\r\n                <td>");
#nullable restore
#line 17 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
               Write(titulares.codigo);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 18 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
               Write(titulares.nome);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 19 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
               Write(titulares.cpf);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 20 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
               Write(titulares.telefone);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 21 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
               Write(titulares.email);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n            </tr>\r\n");
#nullable restore
#line 23 "C:\Users\Cabri\Desktop\teste\Views\Cliente\AllClientes.cshtml"
        }

#line default
#line hidden
#nullable disable
            WriteLiteral("    </tbody>\r\n</table>");
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<List<Cliente>> Html { get; private set; }
    }
}
#pragma warning restore 1591
