<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="webjars/bootstrap/4.3.0/css/bootstrap.min.css">
    <link href="css/signin.css" rel="stylesheet">
    <title>Login!</title>
  </head>
  <body> 
    
    <div class="container">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
	  <form action="/login" method="POST">
	       	<div>
	       	<label>Username :</label>
	       	</div>
	       	<div>
	       	<input name="name" type="text" class="form-control"/>
	       	</div>
	       	
	       	<div>
	       	 <label>Password :</label>
	       	</div>
	       	<div>
	       	<input name="password" type="password" class="form-control"/>
	       	<input type="submit" class="btn btn-primary" value="Login"/>
	       	</div> 
	        
	  </form>	
    </div>
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="webjars/jquery/3.4.0/jquery.min.js"  ></script>
    <script src="webjars/popper.js/1.14.3/umd/popper.min.js" ></script>
    <script src="webjars/bootstrap/4.3.0/js/bootstrap.min.js"></script>
  </body>
</html>
