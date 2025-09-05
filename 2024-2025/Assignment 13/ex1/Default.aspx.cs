using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    public string stA = "";
    public string stB = "";
    public string stC = "";
    protected void Page_Load(object sender, EventArgs e)
    {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        Random rand = new Random();

        for (int i = 0; i < a.Length; i++)
        {
            a[i] = rand.Next(100);
            b[i] = rand.Next(100);
            c[i] = Math.Max(a[i], b[i]);
        }
        stA = CreateHtmlTable(a, "red");
        stB = CreateHtmlTable(b, "red");
        stC = CreateHtmlTable(c, "blue");
    }
    private string CreateHtmlTable(int[] array, string cssClass)
    {
        string table = "<table border='1' class='" + cssClass + "'><tr>";
        foreach (int num in array)
        {
            table += "<td>" + num + "</td>";
        }
        table += "</tr></table>";
        return table;
    }
}