<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>HOME</title>
</head>
<body>
<div class="main">
<#list teams as team>
    <h3>${team.name}</h3>
    <#list team.members as member>
    <table>
        <tr>
            <td>번호</td>
            <td>${member.idx}</td>
        </tr>
        <tr>
            <td>이름</td>
            <td>${member.name}</td>
        </tr>
    </table>
    </#list>
</#list>
</div>
</body>
</html>