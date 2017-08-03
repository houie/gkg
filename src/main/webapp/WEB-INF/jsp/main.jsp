<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="shortcut icon" href="https://nhl.bamcontent.com/images/photos/281721042/256x256/cut.png">
    <title>GKG Draft</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/css/main.css"/>">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/react@latest/dist/react.js"></script>
    <script src="https://unpkg.com/react-dom@latest/dist/react-dom.js"></script>
    <script src="https://unpkg.com/babel-standalone@6.15.0/babel.min.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>

<div class="page-header text-center">
    <h1>GKG Draft</h1>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="table-responsive" id="draft-table">
            </div>
        </div>
    </div>
</div>

<div class="navbar navbar-default navbar-fixed-bottom">
    <div class="container">
        <p class="navbar-text pull-left on-the-clock">
            <span class="small text-uppercase">On the Clock:</span>
            <strong class="text-uppercase">Hou-En</strong>
        </p>

        <div class="navbar-text pull-right" id="selection-button">
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="selection-modal" tabindex="-1" role="dialog" aria-labelledby="selection-modal-label">
</div>

<script src="<c:url value="/js/main.js"/>" type="text/babel"></script>
</body>
</html>
