<h1 align="center">Desafío AlkeParking</h1></br>
<p align="left">
:eyeglasses: AlkeParking es un estacionamiento que permite estacionar diferentes tipos de
vehículos (auto, moto, minibus y bus) con un cupo máximo de 20 vehículos.
</p>
<br>

## Requerimientos
- Cuando se va a ingresar un vehículo se ingresa la patente y el tipo, y se
valida que no haya ningún otro vehículo con esa misma patente en el
estacionamiento.
- Cuando un vehículo va a ser retirado se cobra una tarifa determinada por
las siguientes reglamentaciones
    - Las primeras 2 horas de estacionamiento tendrán un costo fijo
determinado por el tipo de vehículo (auto: $20, moto: $15, mini bus:
$25, bus: $30).
    - Luego de las 2 primeras horas se cobrarán $5 por cada 15 minutos o
fracción independiente del tipo de vehículo. Por ejemplo para un auto
se tendrían las siguientes tarifas:
<br>
<div align="center">
<table>
    <tr>
        <td align="center"><b>Ingreso</b></td>
        <td align="center"><b>Salida</b></td>
        <td align="center"><b>Tarifa</b></td>
    </tr>
    <tr>
        <td align="center"><b>18:00</b></td>
        <td align="center"><b>18:46</b></td>
        <td align="center"><b>$20</b></td>
    </tr>
    <tr>
        <td align="center"><b>18:00</b></td>
        <td align="center"><b>20:00</b></td>
        <td align="center"><b>$20</b></td>
    </tr>
    <tr>
        <td align="center"><b>18:00</b></td>
        <td align="center"><b>21:13</b></td>
        <td align="center"><b>$45</b></td>
    </tr>
    <tr>
        <td align="center"><b>18:00</b></td>
        <td align="center"><b>21:18</b></td>
        <td align="center"><b>$50</b></td>
    </tr>
    <tr>
        <td align="center"><b>18:00</b></td>
        <td align="center"><b>21:30</b></td>
        <td align="center"><b>$50</b></td>
    </tr>
</table>
  </div>
<br>

- Los vehículos pueden tener (opcionalmente) una tarjeta de
descuentos, la cual reduce la tarifa total de estacionamiento un 15%.
- Los valores de las tarifas no deben incluir centavos; en caso de
tenerlos deben descartarse.
- Por solicitud de la administración de AlkeParking, debe tenerse un registro
del total de vehículos que se retiran del estacionamiento, junto con el total
de las ganancias recibidas.
- La administración podrá solicitar en cualquier momento la lista de las
patentes de los vehículos que se encuentran en el estacionamiento.
