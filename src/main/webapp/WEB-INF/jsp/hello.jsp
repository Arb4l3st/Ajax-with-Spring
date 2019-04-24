<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<script language="JavaScript" type="text/javascript" src="/js/jQuery.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<head>
    <meta charset="UTF-8">
    <title>Узнать время</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
    <body>
        <h2 class="hello-title">${someString}</h2>
        <form action="hello" method="GET">
            <input class="button" type="submit" name="get" value="Now"/>
        </form>
        <br/>
        <input class="button" id="someButton" type="submit" value="Узнать день недели">
        <script type="text/javascript">
            $(function() {
                $('#someButton').click(function(e) {
                    $.post({
                        url : 'helloPost',
                        success : function(res) {
                                $('#resultContainer pre code').text(JSON.stringify(res));
                                $('#resultContainer').show();
                        }
                    })
                });
            });
        </script>
        <div id="resultContainer" style="display: none;">
            <hr/>
            <h4 style="color: green;">Текущий день недели:</h4>
            <pre style="color: green;">
                <code></code>
            </pre>
        </div>

    </body>
</html>
