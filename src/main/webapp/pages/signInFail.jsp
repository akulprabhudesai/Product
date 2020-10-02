<!DOCTYPE html>
<html>
<head>
<title>Sign In</title>
<style>
.l1{
	position:relative;
	top:200px;
}
body{
	background-color: #40E0D0;
}
input[type=text] {
  border: double red;
  border-radius: 4px;
}
input[type=password] {
  border: double red;
  border-radius: 4px;
}
</style>
</head>
<body>
<div class="l1">
<div align="center"  ><h1> Sign In to Product Tracking System</h1></div>
<form name="sign_in" action="login">
<div align="center" > 
Username:<input type="text" name="username" id="userId" ></div></br>
<div align="center"> 
Password:<input type="password" name="password" id="passWord"></div></br>
<div align="center"><input type="submit" value="Sign In"></div></br>
</form>
</div>
</body>

</html> 