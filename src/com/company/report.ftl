<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="/assets/ReportStyle.css">
      <title>Invoice Template 1</title>
   </head>
   <body>
      <h1 class="title">Publysher</h1>
      <h2 class="subTitle">Factuur </h2>
      <p class="customer-name">${receiver.companyName}</p>
      <p class="TxtBoxFactuurnummer">Datum: 07-05-2015<br>Referentie: QA9823-7<br>Factuurnummer: 20200017</p>
      <p>t.a.v. ${receiver.name} <br> ${receiver.address} <br> 1028 QX Amsterdam</p>

      <table class="table">
         <thead>
            <tr>
               <td>Omschrijving </td>
               <td class="amount">Aantal </td>
               <td class="amount">Tarief </td>
               <td class="amount">Bedrag </td>
            </tr>
         </thead>
         <!--USER DEFINED START: -->
         <tbody>
         <#list bill.invoiceLines as line>
             <tr>
                 <td >${line.description}</td>
                 <td class="amount"> ${line.amount?string["0.##"]}</td>
                 <td class="amount"> &euro;${line.rate?string["#.00"]}</td>
                 <td class="amount"> &euro;${line.total?string["#.00"]}</td>
             </tr>
         </#list>

         </tbody>
         <!--:USER DEFINED END -->
         <tfoot>
         <tr class="footspacer">
             <td>
         </tr>
            <tr>
               <td>Subtotaal (exclusief BTW)
               <td>
               <td>
               <td class="subtotalRow"> <span>&euro; 6,000,000.00</span>
            </tr>
            <tr>
               <td>BTW 21%
               <td>
               <td>
               <td class="amount">&euro; 1,300.00
            </tr>
            <tr class="totalAmount">
               <td>Totaal factuurbedrag
               <td>
               <td>
               <td class="totalAmount">&euro; 6,001,300.00
            </tr>
         </tfoot>
      </table>

      <p class="reminder">U wordt verzocht dit bedrag binnen 30 dagen onder vermelding van het factuurnummer over te maken op rekening NL47 INGB 0006 9208 03 t.n.v. Publysher </p>
      <p class="bottomCompanyName"> ${sender.companyName} <p>
      <p class="KvKreminder">KvK: 55504035 <br> BTW nummer: 1914.08.049.B.01 <br>ING: NL47 INGB 0006 9208 03 </p>
      <p class="bottomAdress">${sender.address} <br>1061 VB Amsterdam </p>
      <p class="bottomTelephone">T: ${sender.telephone} <br>E: ${sender.email} </p>
   </body>
</html>