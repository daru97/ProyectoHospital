<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Lista de Pacientes</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1 class="my-4">Lista de Pacientes Hospitalizados</h1>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Rut</th>
                    <th>Diagnostico</th>
                    <th>Sala</th>
                    <th>Acciones</th>
                    
                </tr>
            </thead>
            <tbody>
                <tr th:each="paciente : ${paciente}">
                    <td th:text="${paciente.id}">ID</td>
                    <td th:text="${paciente.nombre}">Nombre</td>
                    <td th:text="${paciente.rut}">Rut</td>
                    <td th:text="${paciente.diagnostico}">Diagnostico</td>
                    <td th:text="${paciente.sala}">Sala</td>
                    <td>
                    <a th:href="@{'/formulario/' + ${paciente.id}}">Editar</a>
                    <a th:href="@{'/delete/' + ${paciente.id}}">Eliminar</a>
                </td>
                </tr>
            </tbody>
        </table>
        <a th:href="@{/formulario}" class="btn btn-primary">Agregar Nuevo Paciente</a>
    </div>
   
</body>
</html>

