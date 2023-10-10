<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title> Survey Result</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>

<body>
<h1>Survey Result</h1>
<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label> He/She knows about us from: </label>
<span>${user.aboutUs}</span><br>
<label> Do you want to receive notifications about new CDs: </label>
<span>${user.wouldLike}</span><br>
<label> Contact him/her through: </label>
<span>${user.contact}</span><br>
<form action="emailist" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

</body>
</html>