# README #

Autotest for https://www.leconte.cz/

## Using ##
* java 1.8
* junit 4.13.2
* selenium-java 4.1.4
* JUnitParams 1.1.1

## Bug report ##
* Build Number: <!--  Last Published: Sun Nov 18 2018 17:44:28 GMT+0000 (UTC)  -->
* Environment: OS Name Microsoft Windows 10 Pro Google Chrome 101.0.4951.54

<table>
	<tr>
	    <th>Bug ID   </th>
	    <th>Type</th>
	    <th>Bug Name</th>  
    	<th>Area Path   </th>
	    <th>Severity</th>
	    <th>Priority</th>  
    	<th>Assigned To</th>
	    <th>Reported By </th>
	    <th>Reported On </th>  
	</tr >
	<tr >
	    <td>1</td>
	    <td>UX</td>
	    <td>Button Odeslat is available when mandatory fields are empty</td>
    	<td>https://www.leconte.cz/#form</td>
	    <td>Low</td>
	    <td>Low</td>
      <td>Developer-Front-end</td>
	    <td>Iuliia Geinish</td>
	    <td>09-05-2022</td>
	</tr>
	<tr>
	    <td>Description</td>
	    <td colspan="8">Button Odeslat is available when mandatory fields (e-mail) are empty</td>
	</tr>
	<tr>
	    <td>Steps to Reproduce</td>
	    <td colspan="8">1) Open https://www.leconte.cz/#form <br>
                      2) Form fields are empty</td>
	</tr>
	<tr>
	    <td>Expected Result</td>
	    <td colspan="8">Button Odeslat is not available.</td>
	</tr>
  <tr>
	    <td>2</td>
	    <td>UX</td>
	    <td>Missing hints for mandatory fields</td>
    	<td>https://www.leconte.cz/#form</td>
	    <td>Low</td>
	    <td>Low</td>
      <td>Developer-Front-end</td>
	    <td>Iuliia Geinish</td>
	    <td>09-05-2022</td>
	</tr>
	<tr>
	    <td>Description</td>
	    <td colspan="8">Missing hints for mandatory fields (e-mail)</td>
	</tr>
	<tr>
	    <td>Steps to Reproduce</td>
	    <td colspan="8">1) Open https://www.leconte.cz/#form <br>
                      2) Form fields are empty</td>
	</tr>
	<tr>
	    <td>Expected Result</td>
	    <td colspan="8">Hint: which fields are mandatory</td>
	</tr>
    <tr>
	    <td>3</td>
	    <td>UX</td>
	    <td>Missing placeholder hints for e-mail, Telefon, Jméno a příjmení</td>
    	<td>https://www.leconte.cz/#form</td>
	    <td>Low</td>
	    <td>Low</td>
      <td>Developer-Front-end</td>
	    <td>Iuliia Geinish</td>
	    <td>09-05-2022</td>
	</tr>
	<tr>
	    <td>Description</td>
	    <td colspan="8">Missing placeholder hints for e-mail, Telefon, Jméno a příjmení</td>
	</tr>
	<tr>
	    <td>Steps to Reproduce</td>
	    <td colspan="8">1) Open https://www.leconte.cz/#form <br>
                      2) Form fields are empty</td>
	</tr>
	<tr>
	    <td>Expected Result</td>
	    <td colspan="8">Placeholders for fields e-mail, Telefon, Jméno a příjmení</td>
	</tr>
	<tr>
	    <td>4</td>
	    <td>Function</td>
	    <td>User can sending message without Text zprávy</td>
    	<td>https://www.leconte.cz/#form</td>
	    <td>Medium</td>
	    <td>Medium</td>
      <td>Developer-Front-end</td>
	    <td>Iuliia Geinish</td>
	    <td>09-05-2022</td>
	</tr>
	<tr>
	    <td>Description</td>
	    <td colspan="8">User can sending message without Text zprávy</td>
	</tr>
	<tr>
	    <td>Steps to Reproduce</td>
	    <td colspan="8">1) Open https://www.leconte.cz/#form <br>
                      2) Fill out e-mail <br>
                      3) Press the button Odeslat</td>
	</tr>
	<tr>
	    <td>Expected Result</td>
	    <td colspan="8">User should see message about: “Text zprávy” Field must be filled out</td>
	</tr>
	<tr>
	    <td>5</td>
	    <td>Function</td>
	    <td>Validation for fields e-mail, Telefon is invalid</td>
    	<td>https://www.leconte.cz/#form</td>
	    <td>Low</td>
	    <td>Low</td>
      <td>Developer-Front-end</td>
	    <td>Iuliia Geinish</td>
	    <td>09-05-2022</td>
	</tr>
	<tr>
	    <td>Description</td>
	    <td colspan="8">Validation for fields e-mail, Telefon is invalid</td>
	</tr>
	<tr>
	    <td>Steps to Reproduce</td>
	    <td colspan="8">
Validation e-mail: <br>
1) Open https://www.leconte.cz/#form <br>
2) Fill out e-mail: we@we  <br>
3) Press the button Odeslat <br>
<br>
Validation Telefon: <br>
Steps to Reproduce: <br>
1) Open https://www.leconte.cz/#form <br>
2) Fill out Telefon: +4201112223334445556 (filed mustn’t be less then 18 chars, msisdn should be less then 15 chars)  <br>
3) Press the button Odeslat
    </td>
	</tr>
	<tr>
	    <td>Expected Result</td>
	    <td colspan="8">User should see message about: “Telefon is not valid”, “Email is not valid”</td>
	</tr>
</table>
