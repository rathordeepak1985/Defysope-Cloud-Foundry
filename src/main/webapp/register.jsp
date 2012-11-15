<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Admin panel developed with the Bootstrap from Twitter.">
<meta name="author" content="scriptsjungle">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<link href="css/jquery-ui-1.8.12.custom.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/lang.js"></script>
<script type="text/javascript" src="js/class.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.12.custom.min.js"></script>
<script type="text/javascript" src="js/module/register.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/md5.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script>
	jQuery(document).ready(function() {
		new Defysope.module.register.MainClass("#container-fluid", {

		});

	});
</script>
<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">Personal Budget Online</a>
			</div>
		</div>
	</div>
	<!-- end -->

	<div class="container-fluid" id="container-fluid">
		<div class="row-fluid">
			<div class="span4"></div>
			<div class="span4" id="login_form_wrapper">
				<div class="login">
					<div class="login-header">
						<h1>REGISTER</h1>
					</div>

					<form class="form-horizontal" action="register.html" method="post"
						id="registerFrm">
						<fieldset>
							<div class="control-group">
								<label for="name">Name</label>
								<div class="status">
									<input id="name" name="name" class="input-xlarge" type="text">
								</div>
								<div class="status"></div>
							</div>
							<div class="control-group">
								<label for="user">UserName</label>
								<div>
									<input id="userName" name="userName" class="input-xlarge"
										type="text">
								</div>
								<div class="status"></div>
							</div>
							<div class="control-group">

								<label for="name">Password</label>
								<div>
									<input id="password" name="password" class="input-xlarge"
										type="password">
								</div>
								<div class="status"></div>
							</div>

							<div class="control-group">

								<label for="name">Confirm Password</label>
								<div>
									<input id="password_confirm" name="password_confirm"
										class="input-xlarge" type="password">
								</div>
								<div class="status"></div>
							</div>
							<!-- end control-group -->

							<div class="control-group">
								<label for="name">Email</label>
								<div>
									<input id="email" name="email" class="input-xlarge" type="text">
								</div>
								<div class="status"></div>
							</div>

							<div class="control-group">
								<label for="name">Date of Birth</label>
								<div>
									<input id="dob" name="dob" class="input-xlarge" type="text">
								</div>
								<div class="status"></div>
							</div>
							<!-- end control-group -->

							<!-- end control-group -->

							<input class="btn btn-primary btn-large BtnRegister"
								type="submit" value="Sign Up">

							<p class="other_options">
								Already have an account ? <a href="index.jsp"> Login Here </a>
							</p>

						</fieldset>
					</form>
				</div>
			</div>
			<!-- end well -->
			<div class="span4"></div>
		</div>
		<!-- end row-fuild -->
	</div>
	</div>
</body>
</html>
