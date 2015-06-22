<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="/assets/ReportStyle.css">
      <title>Page Title</title>
   </head>
   <body>
      <h1>Publysher</h1>
      <h2>Factuur </h2>
      <p class="customer-name">Example customer BV</p>
      <p>t.a.v. ${person.name} Factuurnummer: 2020001FAKE Somestreet 277A Datum: 07-05-2015 1028 QX Amsterdam Referentie: QA9823-7 <br><br></p>
      <table>
         <thead>
            <tr>
               <td>Omschrijving(DONT FORGET LINE) </td>
               <td>Aantal </td>
               <td>Tarief </td>
               <td>Bedrag </td>
            </tr>
         </thead>
         <!--USER DEFINED START: -->
         <tbody>
            <tr>
               <td>Interesting stuff </td>
               <td class="amount">12</td>
               <td class="amount">&euro; 70.00</td>
               <td class="amount">1,000,000.00</td>
            </tr>
            <tr>
               <td>Boring stuff </td>
               <td>13</td>
               <td>$80.00</td>
               <td>2,000,000.00</td>
            </tr>
            <tr>
               <td>Other stuff </td>
               <td>14</td>
               <td>$90.00</td>
               <td>3,000,000.00</td>
            </tr>
         </tbody>
         <!--:USER DEFINED END -->
         <tfoot>
            <tr>
               <td>(SPACE W. LINE)
            </tr>
            <tr>
               <td>Subtotaal (exclusief BTW)
               <td>
               <td>
               <td>6,000,000.00
            </tr>
            <tr>
               <td>BTW 21%
               <td>
               <td>
               <td>1,300.00
            </tr>
            <tr>
               <td>Totaal factuurbedrag
               <td>
               <td>
               <td>6,001,300.00
            </tr>
         </tfoot>
      </table>

      <p class="reminder">U wordt verzocht dit bedrag binnen 30 dagen onder vermelding van het factuurnummer over te maken op rekening NL47 INGB 0006 9208 03 t.n.v. Publysher </p>

      <p class="reminder">KvK: 55504035 <br> BTW nummer: 1914.08.049.B.01 <br>ING: NL47 INGB 0006 9208 03 </p>
      <p class="reminder">Henk Henrietstraat 113 <br>1061 VB Amsterdam </p>
      <p class="reminder">T: +31 6 4007 1736 <br>E: info@publysher.nl </p>
   </body>
</html>