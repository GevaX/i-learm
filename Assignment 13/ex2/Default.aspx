<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <link rel="stylesheet" href="styles.css"/>
</head>
<body>
    <h1>Multiplication Table</h1>
    <form method="post">
        <label for="size">Enter multiplication table dimension:</label> <br />
        <input type="number" id="size" name="size"/> <br />
        <input type="submit" name="submit" id="submit" value="Show" /> <br />
    </form>
    <%=table %>
</body>
</html>
