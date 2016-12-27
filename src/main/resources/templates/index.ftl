<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>INDEX</title>
</head>
<body>
<div>
<#list members as member>
<ul>
    <li>${member.idx}</li>
    <li>${member.name}</li>
    <li>${member.team.idx}</li>
    <li>${member.team.name}</li>
</ul>
</#list>
</div>
</body>
</html>