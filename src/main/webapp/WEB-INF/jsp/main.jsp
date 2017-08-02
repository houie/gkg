<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>GKG Draft</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/css/main.css"/>">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="page-header text-center">
    <h1>GKG Draft</h1>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <td>Pick</td>
                        <td>Share</td>
                        <td>Shareholder</td>
                        <td>Game</td>
                        <td>Opponent</td>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>A</td>
                        <td>Toivo</td>
                        <td>1A</td>
                        <td>Flyers</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>B</td>
                        <td>Holly</td>
                        <td>21A</td>
                        <td>Ducks</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>C</td>
                        <td>Kellie</td>
                        <td>31A</td>
                        <td>Blackhawks</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<div class="navbar navbar-default navbar-fixed-bottom">
    <div class="container">
        <p class="navbar-text pull-left on-the-clock">
            <span class="small text-lowercase">On the Clock:</span>
            <strong class="text-uppercase">Hou-En</strong>
        </p>

        <div class="navbar-text pull-right">
            <a href="#" class="btn btn-primary btn-primary"><span class="glyphicon glyphicon-star"></span> Select</a>
        </div>
    </div>
</div>
</body>
</html>
