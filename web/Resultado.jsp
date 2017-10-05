
<%@page import="controlador.GestionarPicoPlaca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    GestionarPicoPlaca picoPlaca = new GestionarPicoPlaca();
    String resultado;
    String mensaje;
    if (picoPlaca.verificarPlaca(request.getParameter("placa"), request.getParameter("fecha"), request.getParameter("hora"))) {
        resultado = "panel panel-success";
        mensaje = "SR/A USUARIO SI PUEDE TRANSITAR ";
    } else {
        resultado = "panel panel-danger";
        mensaje = "SR/A USUARIO NO PUEDE TRANSITAR";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <div class="container">
            <h2><%=picoPlaca.getAuto().getDueño().getNombre()%></h2>
            <div class="panel-group">
                <div class="<%=resultado%>">
                    <div class="panel-heading"><%=mensaje%> <strong>  Fecha:</strong> <%=request.getParameter("fecha")%> <strong>  Hora:</strong> <%=request.getParameter("hora")%></div>
                    <div class="panel-body">
                        <strong>Usuario</strong>
                        <p>Cédula: <%=picoPlaca.getAuto().getDueño().getCedula()%></p>
                        <p>Dirección: <%=picoPlaca.getAuto().getDueño().getDireccion()%></p>
                        <p>Teléfono: <%=picoPlaca.getAuto().getDueño().getTelefono()%></p>
                        <p>Tipo de Sangre: <%=picoPlaca.getAuto().getDueño().getTipo_sangre()%></p>                      
                        
                        
                        <strong>Automóvil</strong>
                        <p>Placa: <%=picoPlaca.getAuto().getPlaca()%></p>
                        <p>Modelo: <%=picoPlaca.getAuto().getModelo()%></p>
                        <p>Color: <%=picoPlaca.getAuto().getColor()%></p>   

                    </div>
                </div>

            </div>
        </div>

        <div class="container">
            <h2>Horarios Pico y Placa</h2>         
            <table class="table">
                <thead>
                    <tr>
                        <th>Lunes</th>
                        <th>Martes</th>
                        <th>Miércoles</th>
                        <th>Jueves</th>
                        <th>Viernes</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1 y 2</td>
                        <td>3 y 4</td>
                        <td>5 y 6</td>
                        <td>7 y 8</td>
                        <td>9 y 0</td>

                    </tr>
                   
                </tbody>
            </table>
            <table class="table">
                <thead>
                    <tr>
                        <th>Mañana</th>
                        <th>Tarde</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>De 07H00 a 09H30</td>
                        <td>De 16H00 a 19H30</td>

                    </tr>
                   
                </tbody>
            </table>
        </div>



        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

    </body>
</html>
