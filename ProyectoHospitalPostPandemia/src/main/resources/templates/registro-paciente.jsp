<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Registro Pacientes</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 100vh;">
			<div class="col-md-6">
				<div>
					<h1>Nuevo Paciente</h1>
				</div>
				<form action="/save" method="post">
					<div class="row mb-3">
						<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="nombre" name="nombre">
						</div>
					</div>
					<div class="row mb-3">
						<label for="rut" class="col-sm-2 col-form-label">Rut</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="rut" name="rut">
						</div>
					</div>
					<div class="row mb-3">
						<label for="sala" class="col-sm-2 col-form-label">Sala</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="sala" name="sala">
						</div>
					</div>
					<div class="row mb-3">
						<label for="diagnostico" class="col-sm-2 col-form-label">Diagnostico</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="diagnostico"
								name="diagnostico">
						</div>
					</div>

					 <div class="btn-container" style= "text-align: right;">
                <button type="submit" class="btn btn-primary btn-lg">Guardar</button>
                <a href="/pacientes" class="btn btn-secondary btn-lg">Regresar a la lista</a>
            </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>

