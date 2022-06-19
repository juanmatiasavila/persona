# Persona
 Challenge Persona

## Atributos
 Long dni - Primaria -Notnull
 String nombre - Notnull
 String apellido - Notnull
 Boolean empleado - Notnull
 
 ## Uso
 
 Alta persona : 
  Solicitud POST '/persona/A'
 
 {
  "dni": 111111,
  "nombre": "Nombre",
  "apellido": "Apellido",
  "empleado": true
 }

 Respuesta
 201 - Created
 400 - BadRequest - Dni ya existente en Base de Datos
 
Baja persona : 
 Solicitud DELETE "/persona/B/{dni}"
 Parametros : Long dni > Requerido. Numero de dni de la persona a eliminar.
 
 Respuesta
 200 - Ok
 400 - BadRequest - Dni no existente en Base de Datos
 
 Modificacion persona : 
 Solicitud PUT "/persona/M"
 
 {
  "dni": 111111,
  "nombre": "Nombre",
  "apellido": "Apellido",
  "empleado": true
 }
 
 Respuesta
 200 - Ok
 400 - BadRequest - Dni no existente en Base de Datos
