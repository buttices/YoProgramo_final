<%-- 
    Document   : index
    Created on : 2 ago. 2022, 23:43:15
    Author     : Sebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Personales</h1>
        <form action="SvPersona" method="POST">
            <p><label>DNI:</label> <input type="text" name="dni"></p>
            <p><label>Nombre:</label> <input type="text" name="nombre"></p>
            <p><label>Apellido:</label> <input type="text" name="apellido"></p>
            <p><label>Telefono:</label> <input type="text" name="telefono"></p>
            <button type="summit">Enviar </button>
          </form>
        
        <h1>Ver lista de personas</h1>
            <p> Si desea ver la lista completa haga clic aquí</p>
            <form action="SvPersona" method="GET">
                 <button type="summit"> Mostrar Personas </button>
            </form>
            
             <h1>Eliminar Personas</h1>
            <p> Ingrese el ID de la persona a eliminar</p>
            <form action="SvEliminar" method="POST">
                 <p><label>ID:</label> <input type="text" name="id_eliminar"></p>
            <button type="summit"> Eliminar </button>
            </form>
    </body>
</html>
