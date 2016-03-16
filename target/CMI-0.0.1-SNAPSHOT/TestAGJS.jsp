<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>Create CMI</title>
</head>
<body>
	<form action="post" id="cmi" action="" method="post">
		<div class="container">
			<div class="page-header">
				<h1>พ ร บ.</h1>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div style="background-color: silver; height: 30px;">
						<b>Vehicle Information</b>
					</div>
				</div>
			</div>
			<br>
			<div class="row">

				<div class="col-md-3">
					Make:<select name="sMake" class="form-control">
					Make:
						<option>Please Select</option>
						<option value="Honda">Honda</option>
						<option value="Toyota">Toyota</option>
						<option value="Mazda">Mazda</option>
					</select>
				</div>

			</div>

		</div>
	</form>
</html>