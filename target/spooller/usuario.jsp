

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Usuario</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="mb-4">Usuario</h1>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">ID: <span class="badge bg-primary">${usuario.id}</span></h5>
                <p class="card-text"><strong>Username:</strong> ${usuario.username}</p>
                <p class="card-text"><strong>Nombre:</strong> ${usuario.nombre}</p>
                <p class="card-text"><strong>Primer Apellido:</strong> ${usuario.apellido1}</p>
                <p class="card-text"><strong>Segundo Apellido:</strong> ${usuario.apellido2}</p>
            </div>
        </div>
        <a href="index.jsp" class="btn btn-secondary mt-3">Volver al inicio</a>
    </div>
</body>
</html>