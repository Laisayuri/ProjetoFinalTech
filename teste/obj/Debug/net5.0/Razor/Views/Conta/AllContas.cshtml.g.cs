#pragma checksum "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "3b912f839817917d002ce95d524c733bf4b7a73c"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Conta_AllContas), @"mvc.1.0.view", @"/Views/Conta/AllContas.cshtml")]
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
#line 1 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\_ViewImports.cshtml"
using teste;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\_ViewImports.cshtml"
using teste.Models;

#line default
#line hidden
#nullable disable
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"3b912f839817917d002ce95d524c733bf4b7a73c", @"/Views/Conta/AllContas.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"f51e606e5be26e1ae3d8e7b3266d6d51b7c19410", @"/Views/_ViewImports.cshtml")]
    public class Views_Conta_AllContas : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<List<Conta>>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            WriteLiteral(@"
<h1>Lista de Todas as Contas</h1>
<hr>
<table class=""table table-striped table-hover"">
    <thead>
        <th scope=""col"">Número</th>
        <th scope=""col"">Agência</th>
        <th scope=""col"">Saldo</th>
        <th scope=""col"">Tipo de Conta</th>
        <th scope=""col"">Código de Cliente</th>
        <th scope=""col"">Titular</th>
        <th scope=""col"">CPF</th>
        <th scope=""col"">Telefone</th>
        <th scope=""col"">E-mail</th>
    </thead>
    <tbody>
");
#nullable restore
#line 18 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
         foreach (Conta dado in Model)
        {

#line default
#line hidden
#nullable disable
            WriteLiteral("            <tr>\r\n                <td>");
#nullable restore
#line 21 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.numero);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 22 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.agencia);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 23 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.saldo);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 24 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.tipoConta);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 25 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.titular.codigo);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 26 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.titular.nome);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 27 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.titular.cpf);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 28 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.titular.telefone);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n                <td>");
#nullable restore
#line 29 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
               Write(dado.titular.email);

#line default
#line hidden
#nullable disable
            WriteLiteral("</td>\r\n            </tr>\r\n");
#nullable restore
#line 31 "C:\Users\drmoc\OneDrive\Documentos\GitHub\ProjetoFinalTech\teste\Views\Conta\AllContas.cshtml"
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
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<List<Conta>> Html { get; private set; }
    }
}
#pragma warning restore 1591
