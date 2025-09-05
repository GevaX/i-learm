using System;
using System.Web.UI;

public partial class _Default : Page
{
    public string table = "<table border='1'>";
    protected void Page_Load(object sender, EventArgs e)
    {
        if (Request.Form["submit"] != null)
        {
            int size = int.Parse(Request.Form["size"]);
            for (int i = 1; i <= size; i++)
            {
                table += "<tr>";
                for (int j = 1; j <= size; j++)
                {
                    if (i == j)
                        table += "<td style='background-color:pink;'>" + (i * j) + "</td>";
                    else
                        table += "<td>" + (i * j) + "</td>";
                }
            }
                table += "</tr>";
            }
            table += "</table>";
        }
    }