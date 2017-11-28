<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Persons</title>
</head>
<body>
<g:each in="${query}" var="person" status="i">
    <h3>${i+1}. ${person.firstName}, ${person.lastName}</h3>
    <p>
        Age: ${person.age}
    </p>
    <br/>
</g:each>
</body>
</html>